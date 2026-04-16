import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " - " + cargo;
    }
}

public class UseCase12_SafetyCheck {

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Grains"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Flatbed", "Machinery"));

        // Safety rule using allMatch()
        boolean isSafe = bogies.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
        );

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFE for transport ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}