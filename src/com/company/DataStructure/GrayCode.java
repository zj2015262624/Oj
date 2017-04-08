package com.company.DataStructure;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class GrayCode {
    public ArrayList<Integer> grayCode(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < 1<<n;i++){
            list.add((i>>1)^i);
        }
        return list;
    }
}
