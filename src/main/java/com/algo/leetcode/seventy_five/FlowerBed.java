package com.algo.leetcode.seventy_five;


/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class FlowerBed {
    public static void main(String[] args) {
        int []arr=new int[]{1,0,0,0,1};
        int numberOfFlower=1;
        FlowerBed flowerBed=new FlowerBed();
        boolean result= flowerBed.canPlaceFlowers(arr,numberOfFlower);
        System.out.println("result:"+result);

    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int i=0;
        if (n == 0) {
            return true; // No flowers need to be planted
        }

        while ( i < flowerbed.length){
            if(flowerbed[i]==1){
                i=i+2;
                continue;
            }
            int emptyCounter=0;
            while( i < flowerbed.length && flowerbed[i]==0) {
                emptyCounter++;
                i++;
            }
            if( i == flowerbed.length && flowerbed[i-1]==0){
                count =count + (emptyCounter+1)/2;
            }else{
                count =count + (emptyCounter)/2;
            }
            if(count >=n){
                return true;
            }
        }
        return false;
    }


}
