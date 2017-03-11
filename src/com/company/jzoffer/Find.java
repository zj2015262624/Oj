package com.company.jzoffer;

/**
 * Created by zj on 2017/3/11 0011.
 * 某个数组是否包含某个整数
 */
public class Find {
    static void find(int[][] arr,int key){
        boolean found = false;
        if(arr != null){
            int row = 0;
            int column = arr[0].length - 1;
            while(row <= arr.length - 1 && column >= 0){
                if(key == arr[row][column]){
                    found = true;
                    break;
                }else if(key > arr[row][column]){
                    row++;
                }else{
                    column--;
                }
            }
        }
        if(found){
            System.out.print("array contains the key");
        }else{
            System.out.print("array doesn't contain the key");
        }

    }

    public static void main(String[] args) {
        int[][] a = {{1,5,6},{7,8,9},{10,12,14}};
        find(a,8);
    }
}
