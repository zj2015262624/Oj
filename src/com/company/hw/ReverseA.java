package com.company.hw;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class ReverseA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(reverse(s));
    }
    public static String reverse(String sentence){
            String result = null;
            String[] str = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = str.length-1;i>=0;i--){
                sb.append(str[i]).append(" ");
            }

            result = sb.substring(0,sentence.length());
            return result;


    }

}
