package com.yang.dataStructure;
import java.util.*;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


class MyStack2 {

    Queue<Integer> queueIn;
    Queue<Integer> queueOut;

    public MyStack2() {
        queueIn = new LinkedList<>();
        queueOut = new LinkedList<>();
    }

    public void push(int x) {
        queueIn.add(x);
    }

    public int pop() {
        Integer remove = null;
        while(!queueIn.isEmpty()) {
            if(queueIn.size() == 1) {
                remove = queueIn.poll();
                break;
            }
            queueOut.add(queueIn.poll());
        }
        //再把所有元素转移到queueIn
        while(!queueOut.isEmpty()) {
            queueIn.add(queueOut.poll());
        }
        return remove;
    }

    public int top() {
        Integer remove = null;
        while(!queueIn.isEmpty()) {
            if(queueIn.size() == 1) {
                remove = queueIn.peek();
            }
            queueOut.add(queueIn.poll());
        }
        //再把所有元素转移到queueIn
        while(!queueOut.isEmpty()) {
            queueIn.add(queueOut.poll());
        }
        return remove;
    }

    public boolean empty() {
        return queueIn.isEmpty();
    }
}

public class MyTest {

    public static void main(String[] args) {

        MyStack2 myStack2 = new MyStack2();
        myStack2.push(1);
        myStack2.pop();
        myStack2.empty();


    }
}
