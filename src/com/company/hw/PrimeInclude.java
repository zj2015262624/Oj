package com.company.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class PrimeInclude {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        List<Long> list = new ArrayList<Long>();
        while (!isPrime1(l)) {
            list.add(isInclude(l));
            l = l / isInclude(l);
        }
        list.add(l);
        Collections.sort(list);
        for (long i : list) {
            System.out.print(i + " ");
        }
        System.out.print(isPrime1(2));


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
        } else if (l == 2) {
            isPrime = true;
        } else if (l % 2 == 0) {
            isPrime = false;
        } else {
            for (long i = 2; i <= Math.sqrt(l); i++) {
                if (l % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    static boolean isPrime1(long a) {
        boolean flag = true;
        if (a < 2) {
            flag = false;
        } else {
            for (long i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }

        }
        return flag;
    }

}