package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.


/**
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's,
 * where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating
 * the no-adjacent-flowers rule and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class FlowerBed { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int []arr=new int[]{1,0,0,0,1}; // Stores the computed or supplied value in a variable for later use.
        int numberOfFlower=1; // Stores the computed or supplied value in a variable for later use.
        FlowerBed flowerBed=new FlowerBed(); // Stores the computed or supplied value in a variable for later use.
        boolean result= flowerBed.canPlaceFlowers(arr,numberOfFlower); // Stores the computed or supplied value in a variable for later use.
        System.out.println("result:"+result); // Prints the result to the console so the current state can be inspected.

    } // Closes the current block and ends the active scope.


    public boolean canPlaceFlowers(int[] flowerbed, int n) { // Defines the method that performs this unit of work for the class.
        int count=0; // Stores the computed or supplied value in a variable for later use.
        int i=0; // Stores the computed or supplied value in a variable for later use.
        if (n == 0) { // Checks whether the condition is true before taking the matching action.
            return true; // No flowers need to be planted // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.

        while ( i < flowerbed.length){ // Keeps executing this block until the loop condition becomes false.
            if(flowerbed[i]==1){ // Carries out the current statement to support the program's logic.
                i=i+2; // Executes the current statement to update state or trigger the required behavior.
                continue; // Skips the rest of the current loop iteration and moves to the next one.
            } // Closes the current block and ends the active scope.
            int emptyCounter=0; // Stores the computed or supplied value in a variable for later use.
            while( i < flowerbed.length && flowerbed[i]==0) { // Carries out the current statement to support the program's logic.
                emptyCounter++; // Executes the current statement to update state or trigger the required behavior.
                i++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            if( i == flowerbed.length && flowerbed[i-1]==0){ // Carries out the current statement to support the program's logic.
                count =count + (emptyCounter+1)/2; // Stores the computed or supplied value in a variable for later use.
            }else{ // Closes the current block and ends the active scope.
                count =count + (emptyCounter)/2; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
            if(count >=n){ // Carries out the current statement to support the program's logic.
                return true; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return false; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
