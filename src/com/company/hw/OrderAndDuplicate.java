package com.company.hw;

import java.util.*;

/**
 * Created by zj on 2017/3/10 0010.
 * 对数组进行去重然后排序
 */
public class OrderAndDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> list = order(arr);
        for (int a : list) {
            System.out.print(a + " ");
        }

    }
    static List<Integer> order(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int a : arr) {
            set.add(a);
        }
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(set);
        Collections.sort(list);
        return list;
    }

}
