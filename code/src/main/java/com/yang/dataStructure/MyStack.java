package com.yang.dataStructure;

import java.util.Arrays;

public class MyStack {
    public int[] elem; //数组 -> 栈空间
    public int usedSize;//有效数据

    MyStack(){
        this.elem = new int[5];
        this.usedSize = 0;
    }

    //入栈
    public void push(int val){
        //如果栈满了就进行扩容
        if(isFull()){
            this.elem = Arrays.copyOf(elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        usedSize++;
    }
    //判断栈是否满
    public boolean isFull(){
        return usedSize==this.elem.length;
    }

    //出栈
    public int pop(){
        if(isEmpty()){
            throw new NullPointerException("栈为空！");
        }
        int oldVal = this.elem[usedSize-1];
        this.usedSize--;
        return oldVal;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return this.usedSize==0;
    }

    //读取栈顶元素
    public int peek(){
        if(isEmpty()){
            throw new NullPointerException("栈为空！");
        }
        return this.elem[usedSize-1];
    }
}