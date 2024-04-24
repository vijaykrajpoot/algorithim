package com.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}


public class PrefixMatcher2 {
    static TrieNode root;

    public static void insert(String key) {
        TrieNode current = root;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    public static boolean isPrefix(String str) {
        TrieNode current = root;
        for (int i = 0; i < str.length(); i++) {
            if (current.children.get(str.charAt(i)) == null) {
                return false;
            }
            current = current.children.get(str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        root = new TrieNode();

        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("ab");
        strings.add("bc");
        strings.add("abc hello");

        // Construct the trie
        for (String str : strings) {
            insert(str);
        }

        // Identify and remove prefix strings
        List<String> nonPrefixes = new ArrayList<>();
        for (String str : strings) {
            if (!isPrefix(str)) {
                nonPrefixes.add(str);
            }
        }

        System.out.println("Non-prefix strings: " + nonPrefixes);
    }
}
