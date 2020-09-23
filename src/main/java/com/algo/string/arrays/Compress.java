package com.algo.string.arrays;

/**
 * Assume you have given a non empty string of characters from A-Z. You will have to compress the characters in that string
 * if they are repeating more then 2 time. If repeating characters are only two then do not compress it
 * <p>
 * Example -1
 * XXXYYYZZZ = X3Y3Z3
 * <p>
 * Example -2
 * PPPPQQQMMPP=P4Q3MMPP
 * <p>
 * Example -3
 * ASDFGHJK=ASDFGHJK;
 */
public class Compress {

    public static void main(String[] args) {

        System.out.println(compress("PPPPQQQMMPP"));
    }

    static String compress(String str) {
        int counter = 1;
        char ch[] = str.toCharArray();
        char prevCh;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            prevCh = ch[i];
            if (i + 1 < ch.length) {
                if (prevCh == ch[i + 1]) {
                    counter++;
                    continue;
                }
            }
            if (counter > 2) {
                sb.append(String.valueOf(prevCh)).append(String.valueOf(counter));
            } else if (counter == 2) {
                sb.append(String.valueOf(prevCh)).append(String.valueOf(prevCh));
            } else {
                sb.append(String.valueOf(prevCh));
            }
            counter = 1;
        }
        return sb.toString();
    }

}
