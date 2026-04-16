import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString for printing
    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase7_SortBogies {

    public static void main(String[] args) {

        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Create List
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator (lambda)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted list
        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}