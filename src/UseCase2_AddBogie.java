import java.util.ArrayList;
import java.util.List;

public class UseCase2_AddBogie {

    public static void main(String[] args) {

        System.out.println("=== UC2: Add Passenger Bogies ===");

        // Create ArrayList
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display list
        System.out.println("After adding bogies: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present");
        } else {
            System.out.println("Sleeper bogie is NOT present");
        }

        // Final state
        System.out.println("Final bogie list: " + bogies);
    }
}