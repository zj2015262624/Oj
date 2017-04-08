package com.company.beauty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25 0025.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        List<Long> list = new ArrayList<Long>();
        for (long i = 2; i < l; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        Collections.sort(list);
        long[] arr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int m = k; m < arr.length; m++) {
                if (arr[k] == l - arr[m]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }

    static long isInclude(long l) {
        long a = 0;
        for (long i = 2; i <= l; i++) {
            if (l % i == 0) {
                a = i;
                break;
            }
        }
        return a;
    }

    static boolean isPrime(long l) {
        boolean isPrime = true;
        if (l == 1) {
            isPrime = false;
        }
        if (l == 2) {
            isPrime = true;
        }
        if (l % 2 == 0) {
            isPrime = false;
        }
        for (long i = 2; i < Math.sqrt(l); i++) {
            if (l % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
