package com.company.jzoffer;

/**
 * Created by zj on 2017/3/11 0011.
 * 懒汉单例
 */
public class SingletonClassLazy {
    private static SingletonClassLazy singleton = null;
    private SingletonClassLazy(){}
    public synchronized static SingletonClassLazy getInstance(){
        if(singleton == null){
            singleton = new SingletonClassLazy();
        }
        return singleton;

    }

}
