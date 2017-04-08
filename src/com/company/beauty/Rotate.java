package com.company.beauty;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24 0024.
 */
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.length() == 0) {
                System.out.print("123456");
            }
            int[] num = new int[3];
            for (int i = 0; i < num.length; i++) {
                num[i] = 0;
            }
            char[] arr = s.toCharArray();
            if (s.length() > 0 && s.length() < 50) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 'L') {
                        num[1]++;
                    } else if (arr[i] == 'R') {
                        num[1]--;
                    } else if (arr[i] == 'F') {
                        num[2]++;
                    } else if (arr[i] == 'B') {
                        num[2]--;
                    } else if (arr[i] == 'A') {
                        num[3]++;
                    } else if (arr[i] == 'C') {
                        num[3]--;
                    }
                }
            }

            int r = num[1] % 4;
            int f = num[2] % 4;
            int c = num[3] % 4;


//            if( r = 0 ){
//
//            }
        }
    }
}
