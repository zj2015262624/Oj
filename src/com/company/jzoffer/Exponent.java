package com.company.jzoffer;

/**
 * Created by zj on 2017/3/13 0013.
 */
public class Exponent {
    public double power(double base,int exponent)throws Exception{
        double result = 0.0;
        if(equals(base,0.0) && exponent < 0){
            throw new Exception("0的负次幂没有意义！");
        }else if(exponent < 0){
            return 1/powerWithExponent(base,-exponent);
        }else{
            return powerWithExponent(base,exponent);
        }
    }
    public double powerWithExponent(double base,int exponent){
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        double result = 1.0;
        for(int i =0;i<exponent;i++){
            result = result * base;
        }
        return result;
    }
    public boolean equals(double num1,double num2){
        if((num1-num2 < 0.00000001)&&(num1-num2 >-0.00000001)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Exponent ex = new Exponent();
        try{
            System.out.print(ex.power(3.0,-3));
        }catch(Exception e){
            System.out.print("Exception");
        }

    }
}
