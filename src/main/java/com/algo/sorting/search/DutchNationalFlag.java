package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.

public class DutchNationalFlag { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        ArrayList<Character> characters=new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        characters.add('G'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('B'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('G'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('G'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('R'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('B'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('R'); // Executes the current statement to update state or trigger the required behavior.
        characters.add('G'); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(characters); // Prints the result to the console so the current state can be inspected.
        dutch_flag_sort(characters); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(characters); // Prints the result to the console so the current state can be inspected.

    } // Closes the current block and ends the active scope.
    static void dutch_flag_sort(ArrayList<Character> balls) { // Defines the method that performs this unit of work for the class.

        int start = 0; // Stores the computed or supplied value in a variable for later use.
        int mid = 0; // Stores the computed or supplied value in a variable for later use.
        int end = balls.size()-1; // Stores the computed or supplied value in a variable for later use.
        while (mid <= end) { // Keeps executing this block until the loop condition becomes false.
            if (balls.get(mid) == 'R') { // Checks whether the condition is true before taking the matching action.
                swap(balls, start, mid); // Executes the current statement to update state or trigger the required behavior.
                start++; // Executes the current statement to update state or trigger the required behavior.
                mid++; // Executes the current statement to update state or trigger the required behavior.

            } else if (balls.get(mid) == 'G') { // Closes the current block and ends the active scope.
                mid++; // Executes the current statement to update state or trigger the required behavior.
            } else if (balls.get(mid) == 'B') { // Closes the current block and ends the active scope.
                swap(balls, mid, end); // Executes the current statement to update state or trigger the required behavior.
                end--; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        System.out.println("Balls:"+ balls); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    static void swap(ArrayList<Character> balls, int p1, int p2) { // Defines the method that performs this unit of work for the class.
        Character temp = balls.get(p1); // Stores the computed or supplied value in a variable for later use.
        balls.set(p1, balls.get(p2)); // Executes the current statement to update state or trigger the required behavior.
        balls.set(p2, temp); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
