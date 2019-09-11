package com.algo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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


public class FindTimeSlots_DD {

  public static List<Integer> getSlots(List<Integer> timeSlots) {
    int maxSoFar = 0;
    List<Integer> result = new ArrayList<>(2);
    for (int i = 0; i < timeSlots.size(); i++) {
      if (i % 2 == 0) {
        continue;
      } else {
        int diff = timeSlots.get(i + 1) - timeSlots.get(i);
        if (diff > 0 && diff > maxSoFar) {
          maxSoFar = diff;
          if (maxSoFar >= 3) {
            result.add(timeSlots.get(i));
            result.add(timeSlots.get(i + 1));
          }
        }
      }
      System.out.println(maxSoFar);
    }
    return result;
  }

  public static void main(String[] args) {
    List<Integer> timeSlots = Arrays.asList(new Integer[] {0, 2, 1, 7, 3, 13, 14, 15, 16, 19, 22});
    List<Integer> ll = FindTimeSlots_DD.getSlots(timeSlots);
    System.out.println(Arrays.toString(ll.toArray()));
  }



}
