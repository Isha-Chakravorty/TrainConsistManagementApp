import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("=======================================\n");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> trainCapacityMap = new HashMap<>();

        // Add bogies with capacity
        trainCapacityMap.put("B1", 72);
        trainCapacityMap.put("B2", 72);
        trainCapacityMap.put("B3", 72);
        trainCapacityMap.put("B4", 72);

        // Display bogie capacities
        System.out.println("Bogie Capacity Mapping:\n");

        for (Map.Entry<String, Integer> entry : trainCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Total capacity calculation
        int totalCapacity = 0;
        for (int capacity : trainCapacityMap.values()) {
            totalCapacity += capacity;
        }

        System.out.println("\nTotal Train Capacity: " + totalCapacity);
    }
}