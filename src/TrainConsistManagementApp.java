import java.util.Set;
import java.util.TreeSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("=======================================\n");

        // Create TreeSet (sorted + unique)
        Set<String> trainConsist = new TreeSet<>();

        // Add bogies (unordered input + duplicates)
        trainConsist.add("B3");
        trainConsist.add("B1");
        trainConsist.add("B4");
        trainConsist.add("B2");
        trainConsist.add("B1"); // duplicate

        // Display results
        System.out.println("Bogies added (auto-sorted, duplicates removed).\n");

        System.out.println("Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}