package com.company.other;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/3/14 0014.
 * java用三种方法实现阶乘n!
 */
public class MultiplyN {

//    第一种方法:从1开始，一直递增乘到n，从而实现n！
    public static BigDecimal factorial(int n){
        BigDecimal result = new BigDecimal(1);
        BigDecimal a;
        for(int i = 2;i <= n;i++){
            a = new BigDecimal(i);
           result = result.multiply(a);
        }
        return result;
    }
    //第二种方法:从n开始，一直递减乘到2，从而实现n！
    public static BigDecimal factorial2(BigDecimal n){
        BigDecimal bt1 = new BigDecimal(1);
        BigDecimal bt2 = new BigDecimal(2);
        BigDecimal result = bt1;
        while(n.compareTo(bt1) > 0){
           result =  result.multiply(n.multiply(n.subtract(bt1)));
            n = n.subtract(bt2);
        }
        return result;
    }
//     第三种方法,用递归实现:f(n)=n*f(n-1),f(1)=1,递归相乘，从而实现n！
    public static BigDecimal factorial3(BigDecimal n){
        BigDecimal result;
        BigDecimal bt1 = new BigDecimal(1);
        if(n.equals(bt1)){
            result = bt1;
        }else{
            result = n.multiply(factorial3(n.subtract(bt1)));
        }
        return result;
    }
}
