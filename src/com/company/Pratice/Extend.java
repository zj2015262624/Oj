package com.company.Pratice;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class Extend {
}
class Son extends Extend{
    private void stm(){
        System.out.println("bbbb");

    }
    public static void main(String[] args) {
        Son s = new Son();
        s.stm();
    }
}


