package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.


import java.util.*; // Imports the classes needed to support this file's logic.

/**
 * 3 Sum
 * Given an integer array arr of size n, find all magic triplets in it.
 * <p>
 * Magic triplet is a group of three numbers whose sum is zero.
 * <p>
 * Note that magic triplets may or may not be made of consecutive numbers in arr.
 * <p>
 * Example
 * {
 * "arr": [10, 3, -4, 1, -6, 9]
 * }
 * Output:
 * <p>
 * ["10,-4,-6", "3,-4,1"]
 */
public class ThreeSum { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = new int[]{10, 3, -4, 1, -6, 9}; // Stores the computed or supplied value in a variable for later use.
        ThreeSum threeSum = new ThreeSum(); // Stores the computed or supplied value in a variable for later use.
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(10, 3, -4, 1, -6, 9)); // Stores the computed or supplied value in a variable for later use.
        System.out.println(threeSum.threeSum(arrayList)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.



    static ArrayList<String> threeSum(ArrayList<Integer> arrList) { // Defines the method that performs this unit of work for the class.
        int [] arr=arrList.stream().mapToInt(i->i).toArray(); // Stores the computed or supplied value in a variable for later use.
        Arrays.sort(arr); // Executes the current statement to update state or trigger the required behavior.
        Set<String> ll = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < arr.length - 1; i++) { // Repeats the loop body as long as the loop condition remains true.
            int low = i + 1; // Stores the computed or supplied value in a variable for later use.
            int high = arr.length - 1; // Stores the computed or supplied value in a variable for later use.
            while (low < high) { // Keeps executing this block until the loop condition becomes false.
                int sum = arr[i] + arr[low] + arr[high]; // Stores the computed or supplied value in a variable for later use.
                if (sum == 0) { // Checks whether the condition is true before taking the matching action.
                    StringBuilder bb = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
                    bb // Carries out the current statement to support the program's logic.

                            .append(arr[i]) // Carries out the current statement to support the program's logic.
                            .append(",") // Carries out the current statement to support the program's logic.
                            .append(arr[low]) // Carries out the current statement to support the program's logic.
                            .append(",") // Carries out the current statement to support the program's logic.
                            .append(arr[high]); // Executes the current statement to update state or trigger the required behavior.

                    ll.add(bb.toString()); // Executes the current statement to update state or trigger the required behavior.
                    low++; // Executes the current statement to update state or trigger the required behavior.
                    high--; // Executes the current statement to update state or trigger the required behavior.
                } else { // Closes the current block and ends the active scope.
                    if (sum > 0) { // Checks whether the condition is true before taking the matching action.
                        high--; // Executes the current statement to update state or trigger the required behavior.
                    } else { // Closes the current block and ends the active scope.
                        low++; // Executes the current statement to update state or trigger the required behavior.
                    } // Closes the current block and ends the active scope.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return new ArrayList(ll); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


    List<List<Integer>> threeSum1(int[] arr) { // Defines the method that performs this unit of work for the class.
        Arrays.sort(arr); // Executes the current statement to update state or trigger the required behavior.
        Set<List<Integer>> ll = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < arr.length - 2; i++) { // Repeats the loop body as long as the loop condition remains true.
            int low = i + 1; // Stores the computed or supplied value in a variable for later use.
            int high = arr.length - 1; // Stores the computed or supplied value in a variable for later use.
            while (low < high) { // Keeps executing this block until the loop condition becomes false.
                int sum = arr[low] + arr[high] + arr[i]; // Stores the computed or supplied value in a variable for later use.
                if (sum == 0) { // Checks whether the condition is true before taking the matching action.
                    ll.add(Arrays.asList(arr[i], arr[low], arr[high])); // Executes the current statement to update state or trigger the required behavior.
                    low++; // Executes the current statement to update state or trigger the required behavior.
                    high--; // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                if (sum > 0) { // Checks whether the condition is true before taking the matching action.
                    high--; // Executes the current statement to update state or trigger the required behavior.
                } else { // Closes the current block and ends the active scope.
                    low++; // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return new ArrayList<>(ll); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
