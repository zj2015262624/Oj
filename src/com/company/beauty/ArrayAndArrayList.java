package com.company.beauty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class ArrayAndArrayList {
    public static void main(String[] args) {
        String[] userid = {"aa","bb","cc"};
        List list1 = Arrays.asList(userid);
        List<String> list = new ArrayList<String>(Arrays.asList(userid));
        list.add("ewr");
        System.out.print(list);
        List<String> strList = new ArrayList<String>();
        strList.add("aa");
        strList.add("bb");
        String[] strs = (String[])strList.toArray(new String[0]);
        System.out.print(strs[0]);




    }
}
