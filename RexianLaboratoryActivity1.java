import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RexianLaboratoryActivity1 {
    
    /**
     * Method 1: Inputs equipment count and usage values from user
     * @return int[] array containing usage counts for each equipment
     */
    public static int[] inputUsage() {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for number of equipment items
        System.out.print("How many equipment items to monitor? ");
        int numEquipment = scanner.nextInt();
        
        // Create dynamic array
        int[] usageCounts = new int[numEquipment];
        
        // Input usage counts
        System.out.println("Enter usage counts for " + numEquipment + " equipment items:");
        for (int i = 0; i < numEquipment; i++) {
            System.out.print("Equipment " + (i + 1) + ": ");
            usageCounts[i] = scanner.nextInt();
        }
        
        scanner.close();
        return usageCounts;
    }
    
    /**
     * Method 2: Categorizes usage level based on count
     * @param count the usage count
     * @return String describing usage status
     */
    public static String checkUsage(int count) {
        if (count > 200) {
            return "Heavily Used";
        } else if (count >= 80 && count <= 200) {
            return "Moderately Used";
        } else {
            return "Rarely Used";
        }
    }
    
    /**
     * Method 3: Saves the report to equipment_usage.txt
     * @param data the report data to save
     */
    public static void saveReport(String data) {
        try {
            FileWriter fileWriter = new FileWriter("equipment_usage.txt");
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("Saved report to equipment_usage.txt");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
    
    /**
     * Main method - orchestrates the program
     */
    public static void main(String[] args) {
        // Get usage data from user
        int[] usageCounts = inputUsage();
        
        // Build report string for console and file output
        StringBuilder report = new StringBuilder();
        
        // Console and file output
        System.out.println("\n--- Equipment Usage Report ---");
        for (int i = 0; i < usageCounts.length; i++) {
            int equipmentId = i + 1;
            int usage = usageCounts[i];
            String status = checkUsage(usage);
            
            String line = "Equipment " + equipmentId + ": " + usage + " uses – " + status;
            System.out.println(line);
            report.append(line).append("\n");
        }
        
        // Save report to file
        saveReport(report.toString());
    }
}
