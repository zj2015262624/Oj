package com.company.jzoffer;

import java.lang.management.GarbageCollectorMXBean;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class UglyNum {
    public static int GetUglyNumber_Solution(int index) {
        int i = 1;
        int count = 0;
        int temp = 0;
        while(count != index){
            if(isUglyNum(i)){
                count++;
                temp = i;
            }
            i++;
        }
        return temp;
    }
    public static boolean isUglyNum(int num){
        boolean flag = false;
        if(num == 1){
            flag =true;
        }else{
            while(num%2 == 0){
                num = num/2;
            }
            while(num%3 == 0){
                num = num/3;
            }
            while(num%5 == 0){
                num = num/5;
            }
            if(num == 1){
                flag = true;
            }else{
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        long startTime=System.nanoTime();
        System.out.println( GetUglyNumber_Solution(10));
        long endTime=System.nanoTime();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }
}

