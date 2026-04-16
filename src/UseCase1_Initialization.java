import java.util.ArrayList;
import java.util.List;

public class UseCase1_Initialization {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}