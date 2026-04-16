import java.util.ArrayList;
import java.util.List;

public class UseCase20_ExceptionDuringSearch {

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search ===");

        // Create empty list (simulate no bogies)
        List<String> bogies = new ArrayList<>();

        String searchKey = "B101";

        try {
            // Defensive check
            if (bogies.isEmpty()) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // Search logic (only runs if not empty)
            boolean found = false;

            for (String b : bogies) {
                if (b.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("✅ Bogie found!");
            } else {
                System.out.println("❌ Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        System.out.println("🚆 Program continues safely...");
    }
}