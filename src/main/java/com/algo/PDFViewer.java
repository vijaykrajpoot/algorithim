package com.algo;

import java.util.*;
import java.util.stream.Collectors;

public class PDFViewer {
    static Map<Character, Integer> chIdx = new HashMap<>();

    public static void main(String[] args) {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            chIdx.put(ch, index);
        }
        System.out.println(chIdx);
        int[] arr = new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
        List<Integer> aa = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int value=PDFViewer.designerPdfViewer(aa, "zaba");
        System.out.println("Value:"+ value);


    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        char arr[] = word.toCharArray();
        int high = 0;
        for (char ch : arr) {
            int val = chIdx.get(ch);
            int chVal = h.get(val);
            if (chVal > high) {
                high = chVal;
            }
        }
        return high * word.length();

    }
}
