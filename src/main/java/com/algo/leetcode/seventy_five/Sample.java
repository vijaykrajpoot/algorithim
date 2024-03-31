package com.algo.leetcode.seventy_five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {

        String name = "ruchi arya";
        System.out.println("Length:" + name.length());
        int len = name.length() - 1;
        char[] ch = name.toCharArray();
        for (int i = 0, j = len; i < len / 2; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

        }
        System.out.println("Original String : " + name);
        System.out.println("Reverse String  : " + new String(ch));

    }
}
