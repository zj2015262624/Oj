package com.company.Sort;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class BubbleSort {
    public static  int[] sort(int[] array){
        for(int i =0;i<array.length - 1;i++){
            for(int j = array.length-1;j>i;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[]  a = {34,2,3,1,6,5,8,76};
        sort(a);
        for(int i:a){
         System.out.print(i+" ");
        }
    }
}
