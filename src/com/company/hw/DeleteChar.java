package com.company.hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class DeleteChar {
    //方法一
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            char[] c = sc.next().toCharArray();
//            Set<Character> set = new HashSet<Character>();
//            StringBuilder sb = new StringBuilder();
//            for(int i = 0 ;i<c.length;i++){
//                if(set.add(c[i])){
//                    sb.append(c[i]);
//                }
//            }
//            System.out.print(sb.toString());
//        }
    //方法二
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if (!builder.toString().contains(temp + "")) {
                    builder.append(temp);
                }
            }
            System.out.println(builder.toString());
            scanner.close();
        }
}
