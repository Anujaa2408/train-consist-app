import java.util.Scanner;

public class UseCase18_LinearSearch {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Array of bogie IDs
        String[] bogieIDs = {"B101", "B205", "B309", "B412", "B550"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(key)) {
                found = true;
                break; // stop early
            }
        }

        // Output result
        if (found) {
            System.out.println("✅ Bogie ID found!");
        } else {
            System.out.println("❌ Bogie ID not found.");
        }

        sc.close();
    }
}