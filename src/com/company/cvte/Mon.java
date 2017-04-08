package com.company.cvte;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/29 0029.
 */
public class Mon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if(!s.matches("[0-9]]")&&!s1.matches("[0-9]")){
            System.out.println(-1);
            return;
        }
        long num = Long.parseLong(s1);
        String[] arr = s.split(",");
        long[] array = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Long.parseLong(arr[i]);
        }
        Arrays.sort(array);
        long result = 0;
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
