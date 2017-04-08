package com.company.Sort;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class QuickSort {
    public static void sort(int[] arr,int low,int high){
        if(low < high){
            int i =  low;
            int j = high;
            int value  = arr[low];
            while(i<j){
                while(i < j && value <= arr[j]){
                    j--;
                }
                if(i < j){
                    arr[i++] = arr[j];
                }
                while(i < j && value >= arr[j]){
                    i++;
                }
                if(i < j){
                    arr[j--] = arr[i];
                }
            }
            arr[i] = value;
            sort(arr,low,i - 1);//每次i都会改变下一次稳定状态时候的i==j的时候
            sort(arr,i + 1,high);
        }
}

    public static void main(String[] args) {

        int[]  a = {34,2,3,1,6,5,8,76};
        sort(a,0,7);
        for(int i:a){
            System.out.print(i+" ");
        }

    }

}
