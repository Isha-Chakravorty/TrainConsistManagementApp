import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=======================================\n");

        // Create LinkedHashSet (insertion order + unique)
        Set<String> trainConsist = new LinkedHashSet<>();

        // Add bogies (with duplicates)
        trainConsist.add("B3");
        trainConsist.add("B1");
        trainConsist.add("B4");
        trainConsist.add("B2");
        trainConsist.add("B1"); // duplicate

        // Display results
        System.out.println("Bogies added (insertion order preserved, duplicates removed).\n");

        System.out.println("Train Consist (Insertion Order):");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}