package com.company.jzoffer;

/**
 * Created by zj on 2017/3/11 0011.
 * 饿汉单例
 */
public class SingletonClass {
    private static final SingletonClass singletonClass = new SingletonClass();
    private SingletonClass(){
    }
    public static SingletonClass getInstance(){
        return singletonClass;
    }
}
