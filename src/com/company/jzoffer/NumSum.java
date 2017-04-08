package com.company.jzoffer;


/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class NumSum {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int j = 1;j<= n;j++){
            String s = String.valueOf(j);
            for(int k = 0;k < s.length();k++){
                if(s.charAt(k) == '1'){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(5));
    }
}
