import java.util.LinkedHashSet;

public class UseCase5_InsertionOrder {

    public static void main(String[] args) {

        System.out.println("=== UC5: Preserve Insertion Order of Bogies ===");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate (ignored)

        // Display formation
        System.out.println("Final Train Formation: " + train);
    }
}