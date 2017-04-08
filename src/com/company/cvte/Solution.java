package com.company.cvte;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/7 0007.
 * 京东石头分堆
 *
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int score = 0;
        if( k > n){
           return;
        }
        if(n == k){
            score = 1;
        }else{
            if(k == 1){
                if(n % 3 == 0){
                    score = n/3 *2;
                }else{
                    score = n/3 *2 + 1;
                }
            }else{
                if(n % (k+1) == k){
                    score = n/(k+1) +1;
                }else{
                    score = n/(k+1);
                }
            }
        }
        System.out.println(score);
    }
}
