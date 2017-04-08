package com.company.jzoffer;

import java.util.*;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class KMinNum {
    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(arr,4);
        for(int i : list){
            System.out.println(i+",");
        }
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        quickSort(input, 0, input.length-1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int i = low;
            int j = high;
            int value = arr[low];
            while (i < j) {
                while (i < j && value <= arr[j]) {
                    j--;
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && value >= arr[i]) {
                    i++;
                }
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            arr[i] = value;
            quickSort(arr, low, i - 1);
            quickSort(arr, i + 1, high);
        }

    }

}
