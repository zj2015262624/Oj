package com.company.cvte;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18 0018.
 */
public class Sort2Array {
    public static void main(String[] args) {
        int start1 = 0;
        int start2 = 0;
        int[] array1 = {1,3,6,9};
        int[] array2 = {2,3,4,10};
        int[] array = new int[array1.length+array2.length];
        for(int i=0;i< array.length;i++){
            while( start1<array1.length && start2 <array2.length){
                if(array1[start1] >= array2[start2] ){
                    array[i] = array2[start2];
                    start2++;
                }else{
                    array[i] = array1[start1];
                    start1++;
                }
            }

        }

    }
}
