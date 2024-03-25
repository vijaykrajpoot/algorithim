package com.algo.sorting.search;

import java.util.ArrayList;

public class DutchNationalFlag {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('G');
        characters.add('B');
        characters.add('G');
        characters.add('G');
        characters.add('R');
        characters.add('B');
        characters.add('R');
        characters.add('G');
        System.out.println(characters);
        dutch_flag_sort(characters);
        System.out.println(characters);

    }
    static void dutch_flag_sort(ArrayList<Character> balls) {

        int start = 0;
        int mid = 0;
        int end = balls.size()-1;
        while (mid <= end) {
            if (balls.get(mid) == 'R') {
                swap(balls, start, mid);
                start++;
                mid++;

            } else if (balls.get(mid) == 'G') {
                mid++;
            } else if (balls.get(mid) == 'B') {
                swap(balls, mid, end);
                end--;
            }
        }
        System.out.println("Balls:"+ balls);
    }


    static void swap(ArrayList<Character> balls, int p1, int p2) {
        Character temp = balls.get(p1);
        balls.set(p1, balls.get(p2));
        balls.set(p2, temp);
    }

}
