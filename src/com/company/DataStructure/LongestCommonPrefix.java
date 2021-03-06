package com.company.DataStructure;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class LongestCommonPrefix {
    public String longestPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }
        int right_most = strs[0].length();
        for(int i = 1;i < strs.length;i++){
            right_most = Math.min(right_most,strs[i].length());
            for(int j = 0;j <right_most;j++){
                if(strs[0].charAt(j) != strs[i].charAt(j) ){
                    right_most = j;
                    break;
                }
            }
        }
        return strs[0].substring(0,right_most);
    }
}
