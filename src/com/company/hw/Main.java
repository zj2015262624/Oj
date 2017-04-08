package com.company.hw;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/23 0023.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            char[] arr = a.toCharArray();
            if(arr.length <=1){
                System.out.println("NO");
            }
            if(arr.length == 2 &&(arr[0] == arr[1])){
                System.out.println("YES");
            }
            int num1 = 1;
            int num2;
            boolean flag = false;
            for(int i =0;i<arr.length-1;i++){
                num2 = 1;
                num1 = num1 * Integer.parseInt(arr[i]+"");
                for(int j = i+1;j < arr.length;j++){
                    num2 = num2 * Integer.parseInt(arr[j] +"");
                }
                if(num1 == num2){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }

    }
}
