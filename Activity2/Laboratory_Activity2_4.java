import java.util.*;

public class Laboratory_Activity2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Original array: " + Arrays.toString(numbers));
        
        System.out.print("Enter number to delete: ");
        int numberToDelete = scanner.nextInt();
        
        int indexToDelete = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToDelete) {
                indexToDelete = i;
                break;
            }
        }
        
        if (indexToDelete == -1) {
            System.out.println("Number " + numberToDelete + " not found in the array!");
        } else {
            int[] newArray = new int[numbers.length - 1];
            
            int newIndex = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (i != indexToDelete) {
                    newArray[newIndex] = numbers[i];
                    newIndex++;
                }
            }
            
            System.out.println("New array: " + Arrays.toString(newArray));
        }
        
        scanner.close();
    }
}