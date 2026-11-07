package com.algo.interview; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.Collections; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

/**
 * 
 * 
 * 
 * Google Calendar, Outlook, iCal has been banned from your company! So an intrepid engineer has
 * decided to roll their own implementation. Unfortunately one major missing feature is the ability
 * to find out what time slots are free for a particular individual.
 * 
 * Given a list of time blocks where a particular person is already booked/busy, a start and end
 * time to search between, a minimum duration to search for, find all the blocks of time that a
 * person is free for a potential meeting that will last the aforementioned duration.
 * 
 * Given: start_time, end_time, duration, meetings_list -> suggested_meeting_times
 * 
 * Let's assume we abstract the representation of times as simple integers, so a valid time is any
 * valid integer supported by your environment. Here is an example input:
 * 
 * meetings_list: [3,13],[0,2], [1-7], [16,17], [19,22] start_time: 0 end_time: 24 min_duration: 3
 * expected answer:
 * 
 * free_time: [13,16]
 * 
 * @author Vijay Kumar Rajput
 *
 */


public class FindTimeSlots_DD { // Defines the Java type that contains the related data and behavior.

  public static List<Integer> getSlots(List<Integer> timeSlots) { // Defines the method that performs this unit of work for the class.
    int maxSoFar = 0; // Stores the computed or supplied value in a variable for later use.
    List<Integer> result = new ArrayList<>(2); // Stores the computed or supplied value in a variable for later use.
    for (int i = 0; i < timeSlots.size(); i++) { // Repeats the loop body as long as the loop condition remains true.
      if (i % 2 == 0) { // Checks whether the condition is true before taking the matching action.
        continue; // Skips the rest of the current loop iteration and moves to the next one.
      } else { // Closes the current block and ends the active scope.
        int diff = timeSlots.get(i + 1) - timeSlots.get(i); // Stores the computed or supplied value in a variable for later use.
        if (diff > 0 && diff > maxSoFar) { // Checks whether the condition is true before taking the matching action.
          maxSoFar = diff; // Stores the computed or supplied value in a variable for later use.
          if (maxSoFar >= 3) { // Checks whether the condition is true before taking the matching action.
            result.add(timeSlots.get(i)); // Executes the current statement to update state or trigger the required behavior.
            result.add(timeSlots.get(i + 1)); // Executes the current statement to update state or trigger the required behavior.
          } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
      } // Closes the current block and ends the active scope.
      System.out.println(maxSoFar); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.
    return result; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    List<Integer> timeSlots = Arrays.asList(new Integer[] {0, 2, 1, 7, 3, 13, 16, 19, 24}); // Stores the computed or supplied value in a variable for later use.
    List<Integer> ll = FindTimeSlots_DD.getSlots(timeSlots); // Stores the computed or supplied value in a variable for later use.
    System.out.println(Arrays.toString(ll.toArray())); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.



} // Closes the current block and ends the active scope.
