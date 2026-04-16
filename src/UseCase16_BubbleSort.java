import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase16_BubbleSort {

    public static void main(String[] args) {

        System.out.println("=== UC16: Sort Bogies using Bubble Sort ===");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Bubble Sort (ascending by capacity)
        for (int i = 0; i < bogies.size() - 1; i++) {
            for (int j = 0; j < bogies.size() - i - 1; j++) {

                if (bogies.get(j).capacity > bogies.get(j + 1).capacity) {

                    // Swap
                    Bogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);
                }
            }
        }

        // Display sorted list
        System.out.println("Sorted Bogies (by capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}
