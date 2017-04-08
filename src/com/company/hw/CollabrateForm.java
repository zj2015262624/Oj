package com.company.hw;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class CollabrateForm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        int line = Integer.parseInt(line1);
        SortedMap<Long,Long> map = new TreeMap<Long,Long>();
        String[] s = new String[line];
        for(int i = 0; i < line;i++){
            s[i] = sc.nextLine();
        }
        Long newVal = 0l;
        for(int i = 0;i<line;i++){
            String[] arr = s[i].split("\\s");
            long key = Long.parseLong(arr[0]);
            long value = Long.parseLong(arr[1]);
            if(map.containsKey(key)){
                newVal= map.get(key) + value;
                map.put(key,newVal);
            }else{
                map.put(key,value);
            }
        }

        for(long m:map.keySet()){
            System.out.println( m + " " + map.get(m));
        }
    }
}
