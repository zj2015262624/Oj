package com.company.jzoffer;

/**
 * Created by zj on 2017/3/11 0011.
 * 斐波那契数列第n个数
 */
public class Fabinacci {
    static int fabinacci(int n){
        int preOne = 0;
        int preTwo = 1;
        int result = 0;
        if(n == 0){
            return preOne;
        }
        if(n == 1){
            return preTwo;
        }
        for(int i = 2;i < n;i++){
            result = preOne + preTwo;
            preOne = preTwo;
            preTwo = result;
        }
        return  result;
    }
}
