// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    void assignCargo() {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            System.out.println("Cargo assigned safely: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

public class UseCase15_CargoSafety {

    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical", "Petroleum");
        b1.assignCargo();

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular", "Petroleum");
        b2.assignCargo();

        System.out.println("Program continues safely...");
    }
}