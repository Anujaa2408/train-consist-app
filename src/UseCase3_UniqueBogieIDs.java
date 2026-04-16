import java.util.HashSet;
import java.util.Set;

public class UseCase3_UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        // Create HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");

        // Try adding duplicate
        bogieIDs.add("B102"); // duplicate (ignored)

        // Display unique IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}