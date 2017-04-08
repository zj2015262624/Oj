package com.company.cvte;

import java.util.*;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
//public class Paragraph {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] str = s.split(" ");
//        int N = Integer.parseInt(str[0]);
//        int M = Integer.parseInt(str[1]);
//        String[] L = new String[N];
//        String[] W = new String[M];
//        for(int i = 0;i<N;i++){
//            L[i] = sc.nextLine();
//        }
//        for(int j = 0;j<M;j++){
//            W[j] = sc.nextLine();
//        }
//        ArrayList<Set<String>> list = new ArrayList<Set<String>>();
//        for(int k = 0;k<M;k++){
//            Set<String> set = new HashSet<String>();
//            String[] c = W[k].split(" ");
//            for(int i = 0;i<c.length;i++){
//                set.add(c[i]);
//            }
//            list.add(set);
//        }
//        ArrayList<Set<String>> list1 = new ArrayList<Set<String>>();
//
//        for(int k = 0;k< N;k++){
//            Set<String> set = new HashSet<String>();
//            String[] c = W[k].split(" ");
//            for(int i = 0;i<c.length;i++){
//                set.add(c[i]);
//            }
//            list1.add(set);
//        }
//
//        int[] count = new int[M];
//       String[] result = new String[M];
//        for(int m = 0;m < M;m++){
//            count[m] = 0;
//            for(int n = 0;n < N ;n++){
//                Set<String> p  = list.get(m);
//                Set<String> q  = list.get(n);
//                ArrayList<String> l = new ArrayList<String>();
//                Iterator it = q.iterator();
//                while (it.hasNext()){
//                    l.add(it.next().toString());
//                }
//                int min = 0;
//
//                for(int i = 0;i < q.size();i++){
//                    if(p.contains(l.get(n))){
//                        count[m]++;
//                    }
//                }
//                if(min > count[m]){
//                    min = count[m];
//                    result[m] =
//                }
//            }
//        }
//
//
//    }
//
//}
