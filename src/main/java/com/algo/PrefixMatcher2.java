package com.algo; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

class TrieNode { // Defines the Java type that contains the related data and behavior.
    Map<Character, TrieNode> children; // Declares a variable to hold data needed by this method.
    boolean isEndOfWord; // Declares a variable to hold data needed by this method.

    public TrieNode() { // Defines the method that performs this unit of work for the class.
        children = new HashMap<>(); // Stores the computed or supplied value in a variable for later use.
        isEndOfWord = false; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.


public class PrefixMatcher2 { // Defines the Java type that contains the related data and behavior.
    static TrieNode root; // Declares a variable to hold data needed by this method.

    public static void insert(String key) { // Defines the method that performs this unit of work for the class.
        TrieNode current = root; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < key.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            char ch = key.charAt(i); // Stores the computed or supplied value in a variable for later use.
            current.children.putIfAbsent(ch, new TrieNode()); // Executes the current statement to update state or trigger the required behavior.
            current = current.children.get(ch); // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        current.isEndOfWord = true; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    public static boolean isPrefix(String str) { // Defines the method that performs this unit of work for the class.
        TrieNode current = root; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < str.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            if (current.children.get(str.charAt(i)) == null) { // Checks whether the condition is true before taking the matching action.
                return false; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
            current = current.children.get(str.charAt(i)); // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        return true; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        root = new TrieNode(); // Stores the computed or supplied value in a variable for later use.

        List<String> strings = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        strings.add("abc"); // Executes the current statement to update state or trigger the required behavior.
        strings.add("ab"); // Executes the current statement to update state or trigger the required behavior.
        strings.add("bc"); // Executes the current statement to update state or trigger the required behavior.
        strings.add("abc hello"); // Executes the current statement to update state or trigger the required behavior.

        // Construct the trie
        for (String str : strings) { // Repeats the loop body as long as the loop condition remains true.
            insert(str); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

        // Identify and remove prefix strings
        List<String> nonPrefixes = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        for (String str : strings) { // Repeats the loop body as long as the loop condition remains true.
            if (!isPrefix(str)) { // Checks whether the condition is true before taking the matching action.
                nonPrefixes.add(str); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

        System.out.println("Non-prefix strings: " + nonPrefixes); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
