import java.util.Arrays;

public class UseCase17_ArraySort {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names using Arrays.sort() ===");

        // Create array
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Sort array
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogieNames));
    }
}