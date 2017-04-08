package com.company.hw;

import java.util.*;

/**
 * Created by Administrator on 2017/3/23 0023.
 */
public class Ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String n = sc.nextLine();
            int N = Integer.parseInt(n);
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLine();
            }
            List<String> list = Arrays.asList(arr);
            int count = 0;
            while(!list.isEmpty()){
                List<Integer> l  = new ArrayList<Integer>();
                for (int j = 1; j < list.size(); j++) {
                    if(isSameType(list.get(0),list.get(j)) ){
                        l.add(j);
                    }
                }
                for(int i:l){
                    list.remove(i);
                }
            }

        }
    }
    public static boolean isSameType(String a,String b){
        if(a.length() != b.length()){
            return false;
        }else{
            SortedSet<Character> set1 = new TreeSet<Character>();
            SortedSet<Character> set2 = new TreeSet<Character>();
            char[] a1 =a.toCharArray();
            char[] a2 = a.toCharArray();
            for(int j = 0;j <a1.length;j++){
                set1.add(a1[j]);
            }
            for(int k = 0;k <a2.length;k++) {
                set2.add(a1[k]);
            }
            if(set1.size() != set2.size()){
                return false;
            }else{
               return set1.contains(set2);
            }
        }
    }
}
