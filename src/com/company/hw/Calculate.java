package com.company.hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by zj on 2017/3/16 0016.
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        for (int i = 0 ;i < str.length();i++){
            char ch = str.charAt(i);
            int ascii = Integer.valueOf(ch);
            if(!set.contains(ch)){
                if(ascii >= 0 && ascii <= 127){
                    set.add(ch);
                    count++;
                }
            }
        }
        System.out.print(count);
    }

}
