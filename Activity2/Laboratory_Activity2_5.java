public class Laboratory_Activity2_5 {
    public static void main(String[] args) {
        int[] calcAverage = {235,537,355,206,399,746,593,763,997,916,415,972,4,
            691,386,494,760,28,347,38,623, 447,445,164,129,358,418,89,251,738,603,
            687,765,851,19,288,144,237,687,702,926,87,0,159,900,749,115,50,255,932,
            744,67,882,93,813, 12,764,772,526,111};

        int sum = 0;
        for (int i = 0; i < calcAverage.length; i++) {
            sum += calcAverage[i];
        }
        
        double average = (double) sum / calcAverage.length;
        
        System.out.println("Total elements: " + calcAverage.length);
        System.out.println("Sum of all elements: " + sum);
        System.out.printf("Average of all elements: %.2f",average);
    }
}
