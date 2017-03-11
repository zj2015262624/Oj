package com.company.jzoffer;

/**
 * Created by zj on 2017/3/11 0011.
 * 二进制中1的个数
 */
public class NumberOf1 {
    int count = 0;
    int numberOf1(int n){
        while(n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
