import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=======================================\n");

        // Create train consist
        List<String> trainConsist = new ArrayList<>();

        // Add passenger bogies
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");
        trainConsist.add("B4");

        // Display bogies
        System.out.println("Passenger Bogies Added Successfully!\n");

        System.out.println("Current Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}