import java.io.*;
import java.util.*;

public class RexianLaboratoryActivity2 {
    
    public static int[] inputAttendance() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many students are in the class? ");
        int numStudents = scanner.nextInt();
        
        int[] attendanceDays = new int[numStudents];
        System.out.println("Enter attendance days for " + numStudents + " students:");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            attendanceDays[i] = scanner.nextInt();
        }
        
        scanner.close();
        return attendanceDays;
    }
    
    public static String checkAttendance(int days) {
        if (days > 25) {
            return "Perfect Attendance";
        } else if (days >= 15 && days <= 25) {
            return "Regular Attendance";
        } else {
            return "Poor Attendance";
        }
    }
    
    public static void saveReport(String data) {
        try (FileWriter writer = new FileWriter("attendance_report.txt")) {
            writer.write(data);
            System.out.println("Saved report to attendance_report.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        int[] attendanceDays = inputAttendance();
        
        StringBuilder reportData = new StringBuilder();
        
        for (int i = 0; i < attendanceDays.length; i++) {
            String status = checkAttendance(attendanceDays[i]);
            String line = "Student " + (i + 1) + ": " + attendanceDays[i] + " days – " + status;
            
            System.out.println(line);
            reportData.append(line).append("\n");
        }
        saveReport(reportData.toString());
    }
}
