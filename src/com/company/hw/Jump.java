package com.company.hw;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class Jump {
    public int JumpFloorII(int target) {
        if(target <= 0){
            return 0;
        }else if(target == 1 || target == 2){
            return target;
        }else{
            int a = 0;
            for(int i = target - 1;i>0;i--){
                a += JumpFloorII(i);
            }
            return a;
        }
    }
}
