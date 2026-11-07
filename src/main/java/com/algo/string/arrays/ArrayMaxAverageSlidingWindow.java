package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class ArrayMaxAverageSlidingWindow { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = new int[]{1, 12, -5, -6, 50, 3}; // Stores the computed or supplied value in a variable for later use.
        double avg = average(arr, 4); // Stores the computed or supplied value in a variable for later use.
        System.out.println(avg); // Prints the result to the console so the current state can be inspected.

    } // Closes the current block and ends the active scope.

    static double average(int[] arr, int k) { // Defines the method that performs this unit of work for the class.
        double maxAvg = Integer.MIN_VALUE; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            System.out.println(i); // Prints the result to the console so the current state can be inspected.
            if (i <   k) { // Checks whether the condition is true before taking the matching action.
                // System.out.println("Inside:"+ i);
                int sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3]; // Stores the computed or supplied value in a variable for later use.
                System.out.println("sum:" + sum); // Prints the result to the console so the current state can be inspected.
                double calcSum = (double) sum / k; // Stores the computed or supplied value in a variable for later use.
                if (calcSum > maxAvg) { // Checks whether the condition is true before taking the matching action.
                    maxAvg = calcSum; // Stores the computed or supplied value in a variable for later use.
                    System.out.println("calcSum: [" + calcSum + "]: maxSum:[" + maxAvg + "]"); // Prints the result to the console so the current state can be inspected.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return maxAvg; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

    static double average2(int[] arr, int k) { // Defines the method that performs this unit of work for the class.
        double maxSum = -1; // Stores the computed or supplied value in a variable for later use.
        double sum = 0; // Stores the computed or supplied value in a variable for later use.
        int start = 0; // Stores the computed or supplied value in a variable for later use.
        int end = 4; // Stores the computed or supplied value in a variable for later use.
        // Average first 4
        for (int i = 0; i < k; i++) { // Repeats the loop body as long as the loop condition remains true.
            sum = sum + arr[i]; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        while (start < arr.length - 1 - k) { // Keeps executing this block until the loop condition becomes false.
            sum = sum - arr[start] + arr[end]; // Stores the computed or supplied value in a variable for later use.
            maxSum = Math.max(maxSum, sum); // Stores the computed or supplied value in a variable for later use.
            start++; // Executes the current statement to update state or trigger the required behavior.
            end++; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return maxSum / 4; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
