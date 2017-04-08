package com.company.beauty;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24 0024.
 */
public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] str = s.split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            if(a > 1 && a < 7000 && b > 1 && b < 7000 ){
                System.out.println(reverseAdd(a,b));
            }else{
                System.out.println(-1);
            }
        }
    }
    static int reverseAdd(int a,int b){
        String a1 = String.valueOf(a);
        String a2 = String.valueOf(b);
        StringBuilder sb1 = new StringBuilder(a1);
        StringBuilder sb2 = new StringBuilder(a2);
        a1 = sb1.reverse().toString();
        a2 = sb2.reverse().toString();
        int result = Integer.parseInt(a1) + Integer.parseInt(a2);
        return result;

    }
}
