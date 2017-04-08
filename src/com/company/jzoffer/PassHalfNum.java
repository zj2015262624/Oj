package com.company.jzoffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class PassHalfNum {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set<Integer> set = new HashSet<Integer>();
        set.add(array[0]);
        map.put(array[0],1);
        for(int i = 1;i < array.length;i++){
            if(!set.contains(array[i])){
                set.add(array[i]);
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        int length = array.length/2;
        int res = 0;
        for(int i:map.keySet()){
            if(map.get(i) > length){
                res = i;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        int a = MoreThanHalfNum_Solution(arr);
        System.out.println(a);
    }
}
