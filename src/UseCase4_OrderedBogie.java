import java.util.LinkedList;

public class UseCase4_OrderedBogie {

    public static void main(String[] args) {

        System.out.println("=== UC4: Maintain Ordered Bogie IDs ===");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");
        System.out.println("After adding Pantry Car: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After removing first and last: " + train);
    }
}