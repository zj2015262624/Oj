package com.company.nk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/10 0010.
 * 某个区间的素数 有问题
 */
public class countPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < 10000;i++){
            if(count < n ){
                if(isPrime(i)){
                    count++;
                    list.add(i);
                }
            }else{
                break;
            }
        }
        List<Integer> sonList = list.subList(m-1,n);
        for(int i = 0;i < sonList.size() - 1;i++){
           if( i!= 0 && (i+1) % 10 == 0){
               System.out.println(sonList.get(i));
           }else{
               System.out.print(sonList.get(i) + " ");
           }
        }
        System.out.print(sonList.get(sonList.size()-1));
    }
    static boolean isPrime(int a){
        boolean flag = true;
        if(a < 2){
            flag = false;
        }else {
            for(int i = 2;i < a;++i){
                if(a % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
