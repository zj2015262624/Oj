package com.company.beauty;

import java.util.Scanner;

public class Ro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] startState = {1, 2, 3, 4, 5, 6};

        while (in.hasNext()) {
            String str = in.nextLine();

            char[] charArray = str.toCharArray();

            for (char ch : charArray) {
                if ('L' == ch) {
                    startState = rotateL(startState);
                }
                if ('R' == ch) {
                    startState = rotateR(startState);
                }

                if ('F' == ch) {
                    startState = rotateF(startState);
                }

                if ('B' == ch) {
                    startState = rotateB(startState);
                }


                if ('A' == ch) {
                    startState = rotateA(startState);
                }

                if ('C' == ch) {
                    startState = rotateC(startState);
                }
            }

            for (int i : startState) {
                System.out.print(i);
            }
        }


    }

    public static int[] rotateL(int[] arr) {
        int temp1 = arr[4]; //上
        int temp2 = arr[5];    //下

        arr[4] = arr[1];
        arr[5] = arr[0];

        arr[0] = temp1;
        arr[1] = temp2;

        return arr;
    }


    public static int[] rotateR(int[] arr) {
        int temp1 = arr[4]; //上
        int temp2 = arr[5];    //下

        arr[4] = arr[0];
        arr[5] = arr[1];

        arr[0] = temp2;
        arr[1] = temp1;

        return arr;
    }

    public static int[] rotateF(int[] arr) {
        int temp1 = arr[4]; //上
        int temp2 = arr[5];    //下

        arr[4] = arr[3];
        arr[5] = arr[2];

        arr[2] = temp1;
        arr[3] = temp2;

        return arr;
    }

    public static int[] rotateB(int[] arr) {
        int temp1 = arr[4]; //上
        int temp2 = arr[5];    //下

        arr[4] = arr[2];
        arr[5] = arr[3];

        arr[2] = temp2;
        arr[3] = temp1;

        return arr;
    }

    public static int[] rotateC(int[] arr) {
        int temp1 = arr[2];    //前
        int temp2 = arr[3];    //后

        arr[2] = arr[1];
        arr[3] = arr[0];

        arr[0] = temp1;
        arr[1] = temp2;

        return arr;
    }

    public static int[] rotateA(int[] arr) {
        int temp1 = arr[2];    //前
        int temp2 = arr[3];    //后

        arr[2] = arr[0];
        arr[3] = arr[1];

        arr[0] = temp2;
        arr[1] = temp1;

        return arr;
    }
}