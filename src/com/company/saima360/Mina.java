package com.company.saima360;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/3/17 0017.
 */
public class Mina {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                String str = scanner.next();
                int length = str.length();
                int result = 0;
                for(int i=0;i<length;i++){
                    if(str.charAt(i)>'1'){
                        result += Math.pow(2,length-i)-1;
                        break;
                    }else if(str.charAt(i)=='1'){
                        result += Math.pow(2,length-1-i);
                    }
                }
                System.out.println(result);
            }
        }

}
