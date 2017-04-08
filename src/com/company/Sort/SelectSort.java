package com.company.Sort;

/**
 * Created by zj on 2017/3/26 0026.
 */
public class SelectSort {
    public static void sort(int arr[]){
        if(arr==null||arr.length==0){
            return;
        }
        for(int i = 0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
          if(i != min){
              int temp = arr[min];
              arr[min] = arr[i];
              arr[i] = temp;
          }
        }
    }
}
