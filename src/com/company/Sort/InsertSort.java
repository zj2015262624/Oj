package com.company.Sort;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class InsertSort {
    public static void sort(int[] arr){
        for(int i = 1;i < arr.length; i++){
            for(int j = i; j > 0 && arr[j-1] > arr[j];j--){
                swap(arr,j-1,j);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
    }

    public static void main(String[] args) {
        int[]  a = {34,2,3,1,6,5,8,111,232,4234,22,76,99,789,11,10};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
