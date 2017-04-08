package com.company.DataStructure;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class LongestConsecutiveSequence {
    public int getLongestConsecutiveSequence(int[] num){
        Arrays.sort(num);
        int max = 1;
        int count = 1;
        for(int i = 1;i< num.length;i++){
            if(num[i] == num[i-1]){
                continue;
            }else if(num[i] == num[i-1]+1){
                count++;
            }else{
                count = 1;
            }
            if(count > max ){
                max = count;
            }
        }
        return max;
    }
}
