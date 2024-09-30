package com.yang.dataStructure;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueue {
    public static void main(String[] args) {
        // 创建一个Queue对象
        Queue<String> queue = new LinkedList<>();

        // 添加元素到队列
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        // 获取队列头部元素
        String head = queue.peek();
        System.out.println("头部元素：" + head);

        // 遍历队列并输出元素
        System.out.println("队列元素：");
        for (String element : queue) {
            System.out.println(element);
        }


        // 移除队列头部元素
        String removedElement = queue.remove();
        System.out.println("移除的元素：" + removedElement);

        // 队列大小
        int size = queue.size();
        System.out.println("队列大小：" + size);

        // 判断队列是否为空
        boolean isEmpty = queue.isEmpty();
        System.out.println("队列是否为空：" + isEmpty);
    }
}