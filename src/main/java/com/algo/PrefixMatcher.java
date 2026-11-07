package com.algo;
import java.util.ArrayList;
import java.util.List;
// Logic: Solves the prefix matcher problem by processing the input data, applying the required algorithmic rule, and returning the expected result.


public class PrefixMatcher {

     public static boolean isPrefix(String str, String prefix) {
        return str.startsWith(prefix);
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("ab");
        strings.add("bc");
        strings.add("abc hello");
        for (int i = 0; i < strings.size(); i++) {
            String currentString = strings.get(i);
            for (int j = 0; j < strings.size(); j++) {
                if (i != j) {
                    String otherString = strings.get(j);
                    if (isPrefix(otherString, currentString)) {
                        strings.remove(currentString);
                        i--;
                        break;
                    }
                }
            }
        }
        System.out.println("strings:"+ strings);
    }
}