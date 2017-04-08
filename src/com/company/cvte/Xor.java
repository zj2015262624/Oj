package com.company.cvte;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/7 0007.
 * 京东异或
 */
public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n < 1 || n >20) {
            return;
        }
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()>n||s2.length()>n||s1.length()<=0||s2.length()<=0){
            return;
        }
        int num1 = Integer.valueOf(s1,2);
        int num2 = Integer.valueOf(s2,2);
        int result = num1^num2;
        System.out.println(Integer.toString(result,10));

    }

}
