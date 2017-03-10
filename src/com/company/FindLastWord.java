package com.company;

import java.util.Scanner;
import java.util.concurrent.RunnableFuture;

/**
 * Created by zj on 2017/3/10 0010.
 */
public class FindLastWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.print(findLastWord(line));

    }
    public static int findLastWord(String s){
        String[] arr = s.split(" ");
        int length = arr[arr.length - 1].length();
        return length;
    }
}

