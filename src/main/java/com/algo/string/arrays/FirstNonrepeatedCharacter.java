package com.algo.string.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * Write an efficient function to find the first nonrepeated character in a string. For instance,
 * the first nonrepeated character in “total” is 'o' and the first nonrepeated character in “teeter”
 * is 'r'. Discuss the efficiency of your algorithm.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FirstNonrepeatedCharacter {

  public static void main(String str[]) {

    FirstNonrepeatedCharacter fu = new FirstNonrepeatedCharacter();
    System.out.println(fu.findFirstNonRepeatedChracter("LALA"));

  }

  public char findFirstNonRepeatedChracter(String str) {

    HashMap<Character, Integer> hashMap = new LinkedHashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (hashMap.containsKey(ch)) {
        hashMap.put(ch, hashMap.get(ch) + 1);
      } else {
        hashMap.put(ch, 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    throw new RuntimeException("There is no First Repeated Chracter");
  }

}
