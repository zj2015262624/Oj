package com.company.saima360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/17 0017.
 */
public class PressButton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isSymmetry = true;
        while(sc.hasNext()){
            char[] charArray1 = sc.next().toCharArray();
            char[] charArray2 = sc.next().toCharArray();
            char[] charArray3 = sc.next().toCharArray();
            char[] charInput = new char[9];
            for(int i = 0;i < 3;i++){
                charInput[i] = charArray1[i];
            }
            for(int i = 3;i < 6;i++){
                charInput[i] = charArray2[i-3];
            }
            for(int i = 6;i < 9;i++){
                charInput[i] = charArray3[i-6];
            }
            for(int i = 0; i < 4;i++){
                if(charInput[i] != charInput[8-i]){
                    isSymmetry = false;
                    break;
                }
            }
            if(isSymmetry){
                System.out.print("Yes");
            }else{
                System.out.print("No");

            }

        }



        }
}
