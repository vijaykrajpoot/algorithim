package com.algo; // Declares the package so the class is organized under the correct Java namespace.

import java.util.*; // Imports the classes needed to support this file's logic.
import java.util.stream.Collectors; // Imports the classes needed to support this file's logic.

public class PDFViewer { // Defines the Java type that contains the related data and behavior.
    static Map<Character, Integer> chIdx = new HashMap<>(); // Stores the computed or supplied value in a variable for later use.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        for (char ch = 'a'; ch <= 'z'; ch++) { // Repeats the loop body as long as the loop condition remains true.
            int index = ch - 'a'; // Stores the computed or supplied value in a variable for later use.
            chIdx.put(ch, index); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        System.out.println(chIdx); // Prints the result to the console so the current state can be inspected.
        int[] arr = new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7}; // Stores the computed or supplied value in a variable for later use.
        List<Integer> aa = Arrays.stream(arr).boxed().collect(Collectors.toList()); // Stores the computed or supplied value in a variable for later use.

        int value=PDFViewer.designerPdfViewer(aa, "zaba"); // Stores the computed or supplied value in a variable for later use.
        System.out.println("Value:"+ value); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.

    public static int designerPdfViewer(List<Integer> h, String word) { // Defines the method that performs this unit of work for the class.
        char arr[] = word.toCharArray(); // Executes the current statement to update state or trigger the required behavior.
        int high = 0; // Stores the computed or supplied value in a variable for later use.
        for (char ch : arr) { // Repeats the loop body as long as the loop condition remains true.
            int val = chIdx.get(ch); // Stores the computed or supplied value in a variable for later use.
            int chVal = h.get(val); // Stores the computed or supplied value in a variable for later use.
            if (chVal > high) { // Checks whether the condition is true before taking the matching action.
                high = chVal; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return high * word.length(); // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
