import java.io.*;
import java.util.*;

public class RexianLaboratoryActivity1 {
    
    public static int[] inputConditions() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many books to inspect? ");
        int numBooks = scanner.nextInt();
        
        int[] conditionScores = new int[numBooks];
        System.out.println("Enter condition scores for " + numBooks + " books:");
        
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            conditionScores[i] = scanner.nextInt();
        }
        
        scanner.close();
        return conditionScores;
    }
    
    public static String checkCondition(int score) {
        if (score > 85) {
            return "Excellent Condition";
        } else if (score >= 60 && score <= 85) {
            return "Good Condition";
        } else {
            return "Needs Repair";
        }
    }
    
    public static void saveReport(String data) {
        try (FileWriter writer = new FileWriter("book_condition_report.txt")) {
            writer.write(data);
            System.out.println("Saved report to book_condition_report.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        int[] conditionScores = inputConditions();
        
        StringBuilder reportData = new StringBuilder();
        
        for (int i = 0; i < conditionScores.length; i++) {
            String condition = checkCondition(conditionScores[i]);
            String line = "Book " + (i + 1) + ": " + conditionScores[i] + " – " + condition;
            
            System.out.println(line);
            reportData.append(line).append("\n");
        }
        saveReport(reportData.toString());
    }
}
