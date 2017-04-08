package com.company.Sort;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class ArrayUtils {
    public static void printArray(int[] arr){
        System.out.println("{");
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
            if(i <arr.length-1){
                System.out.println(",");
            }
        }
        System.out.println("}");
    }

    public static void exchangeElement(int[] arr,int index1,int index2) {
           int temp = arr[index1];
           arr[index1] = arr[index2];
           arr[index2] = temp;
    }
}
