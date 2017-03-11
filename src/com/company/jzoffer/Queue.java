package com.company.jzoffer;

import java.util.Stack;

/**
 * Created by zj on 2017/3/11 0011.
 * 使用两个栈实现一个队列
 */
public class Queue<T> {
    private Stack<T> stack1 = new Stack<T>();
    private Stack<T> stack2 = new Stack<T>();
    public void appendTail(T t){
        stack1.push(t);
    }
    public T deleteHead() throws Exception{
       if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
       }
        if(stack2.isEmpty()){
            throw new Exception("队列为空，不能删除");
        }
        return stack2.pop();
    }

}
