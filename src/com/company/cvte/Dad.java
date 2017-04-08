package com.company.cvte;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/29 0029.
 */
public class Dad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            if(s == null || s.length() ==0 || s1 == null || s1.length() == 0){
                System.out.println(-1);
            }
            if(!s.matches("[0-9]]")&&!s1.matches("[0-9]")){
                System.out.println(-1);
                return;
            }
            int num = Integer.parseInt(s1);
            String[] arr = s.split(",");
            int[] array = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                array[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(array);
            int result = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                if(num%array[i] == 0){
                    result += num/array[i];
                    break;
                }else{
                    result += num/array[i];
                    if(num%array[i]<array[0]){
                        result = -1;
                    }else{
                        num = num%array[i];
                    }

                }
            }
            System.out.println(result);
        }
    }
}