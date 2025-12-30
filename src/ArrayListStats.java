import java.util.ArrayList;

public class ArrayListStats {

    // 1. Returns true if the list contains a 0
    public static boolean containsZero(ArrayList<Double> list) {

        
        return false;
    }

    // 2. Computes and returns the average
    public static double average(ArrayList<Double> list) {

        
        return 0.0;
    }

    // 3. Computes and returns the maximum value
    public static double maxValue(ArrayList<Double> list) {
        

        return 0.0;
    }

    // 4. Counts and returns the number of negative values
    public static int countNegatives(ArrayList<Double> list) {



        return 0;
    }

    // 5. Reverses the elements of the list 
    public static void reverse(ArrayList<Double> list) {
        // Swap the first and last element,
        // then swap the 2nd and 2nd to last, and so on...

        
    }

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        // Add 10 random values between -10 and 10
        for (int i = 0; i < 10; i++) {
            double value = Math.random() * 20 - 10;
            double rounded = Math.round(value * 100) / 100.0;
            numbers.add(rounded);
        }

        // Display original list
        System.out.println("Original list:");
        System.out.println(numbers);

        // Test methods
        System.out.println("\nContains zero? " + containsZero(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Maximum value: " + maxValue(numbers));
        System.out.println("Number of negative values: " + countNegatives(numbers));

        // Reverse list and display
        reverse(numbers);
        System.out.println("\nReversed list:");
        System.out.println(numbers);
    }
}

