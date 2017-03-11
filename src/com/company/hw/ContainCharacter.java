package com.company.hw;

import java.util.Scanner;

/**
 * Created by zj on 2017/3/10 0010.
 */
public class ContainCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(findWordNum(str1,str2));
    }
    public static int findWordNum(String s,String c){
        s = s.toLowerCase();
        char t = c.toLowerCase().charAt(0);
        byte[] byteArr = s.getBytes();
        int count = 0;
        for (byte b : byteArr) {
            if (b == t){
                count++;
            }
        }
        return count;
    }
}
