import java.io.*;
import java.util.*;

public class RexianLaboratoryActivity1 {
    
    public static int[] inputUsage() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many equipment items to monitor? ");
        int numEquipment = scanner.nextInt();
        
        int[] usageCounts = new int[numEquipment];
        
        System.out.println("Enter usage counts for " + numEquipment + " equipment items:");
        for (int i = 0; i < numEquipment; i++) {
            System.out.print("Equipment " + (i + 1) + ": ");
            usageCounts[i] = scanner.nextInt();
        }
        
        scanner.close();
        return usageCounts;
    }
    
    public static String checkUsage(int count) {
        if (count > 200) {
            return "Heavily Used";
        } else if (count >= 80 && count <= 200) {
            return "Moderately Used";
        } else {
            return "Rarely Used";
        }
    }
    
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
    
    public static void main(String[] args) {
        int[] usageCounts = inputUsage();
        
        StringBuilder report = new StringBuilder();
        
        System.out.println("\n--- Equipment Usage Report ---");
        for (int i = 0; i < usageCounts.length; i++) {
            int equipmentId = i + 1;
            int usage = usageCounts[i];
            String status = checkUsage(usage);
            
            String line = "Equipment " + equipmentId + ": " + usage + " uses – " + status;
            System.out.println(line);
            report.append(line).append("\n");
        }
        saveReport(report.toString());
    }
}
