package com.company.hw;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class Reverse {

        public static String reverse(String sentence){
            StringBuilder sb = new StringBuilder(sentence);
            return sb.reverse().toString();

        }

    public static void main(String[] args) {
        System.out.print( reverse("i am a boy"));
    }



}
