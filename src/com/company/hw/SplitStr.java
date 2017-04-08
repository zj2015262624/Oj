package com.company.hw;

import java.util.Scanner;

/**
 * Created by zj on 2017/3/19 0019.
 */
public class SplitStr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] result1 = splitStr(a);
            String[] result2 = splitStr(b);
            if(result1 != null){
                for(String x : result1){
                    System.out.println(x);
                }
            }
            if(result2 != null) {
                for (String y : result2) {
                    System.out.println(y);
                }
            }

    }
    public static String[] splitStr(String str) {
        String[] arr = null ;
        if (!"".equals(str) && str != null ) {
            arr  = new String[str.length() / 8 + 1];
            String temp;
            for (int i = 0; i < str.length() / 8; i++) {
                temp = str.substring(8 * i, 8 * (i + 1));
                arr[i] = temp;
            }
            if (str.length() % 8 > 0) {
                StringBuilder a = new StringBuilder(str.substring(8 * (str.length() / 8), str.length()));
                int len = 8 - str.length() % 8;
                for (int i = 0; i < len; i++) {
                    a.append(0);
                }
                arr[str.length()/ 8 ] = a.toString();
            }

        }
        return arr;
    }

}
//public class Main{
//    static String zero8s = new String("00000000");
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str1, str2;
//        str1 = sc.nextLine();
//        str2 = sc.nextLine();
//
//        fun(str1);
//        fun(str2);
//    }
//
//    public static void fun(String str1){
//        int len= str1.length();
//        while(len>0){
//            if(len<=8){
//                String temp = str1+zero8s.substring(0,8-str1.length());
//                System.out.println(temp);
//                break;
//            }else{
//                System.out.println(str1.substring(0,8));
//                str1= str1.substring(8);
//                len = len-8;
//            }
//        }
//    }
//
//}