package com.company.jzoffer;
import java.util.ArrayList;
import java.math.*;
/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class ArrayExclude {
        public static int[] multiply(int[] A) {
            BigInteger s = new BigInteger(A[0]+"");
            int[] B = new int[A.length];
            for(int j = 1;j < A.length-1;j++){
                s = s.multiply(new BigInteger(A[j]+""));
            }
            for(int i = 0;i < A.length-1;i++){
                B[i] = s.divide(new BigInteger(A[i]+"")).intValue();
            }
            return B;
        }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = multiply(a);
        for(int i =0 ;i<b.length;i++){
            System.out.println(b[i]+" ");
        }
    }
}
