package com.company.jd;
import java.util.Scanner;

/**
 * Created by zj on 2017/3/10 0010.
 * 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。
 输入描述:
 每个测试输入包含1个测试用例
 每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。
 有问题？？？
 */
public class CodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        boolean change = false;
        StringBuilder sb = new StringBuilder();
        char firstChar = s.charAt(0);
        for(int i = 0;i < s.length();i++){
           if(firstChar == s.charAt(i)){
              if(i == s.length()-1){
                  sb.append(count+1).append(firstChar);
              }else{
                  count ++;
              }
           } else{
               if(i == s.length()-1){
                   sb.append(1).append(s.charAt(i-1));
                   sb.append(1).append(s.charAt(i));
               }else{
                       change = true;
                       sb.append(count).append(firstChar);
                       count = 1;
               }
           }
            if(change){
                firstChar = s.charAt(i);
                change = false;
            }
        }
        System.out.print(sb.toString());
    }
}
