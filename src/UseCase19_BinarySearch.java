import java.util.Arrays;
import java.util.Scanner;

public class UseCase19_BinarySearch {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // Sorted array (IMPORTANT)
        String[] bogieIDs = {"B101", "B205", "B309", "B412", "B550"};

        // Ensure sorted (safety step)
        Arrays.sort(bogieIDs);

        Scanner sc = new Scanner(System.in);

        // Input key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Output
        if (found) {
            System.out.println("✅ Bogie ID found!");
        } else {
            System.out.println("❌ Bogie ID not found.");
        }

        sc.close();
    }
}