package com.yang.dataStructure;

import java.util.Deque;
import java.util.ArrayDeque;

public class MyDqueue {
    public static void main(String[] args) {
        // 创建一个Deque对象
        Deque<String> deque = new ArrayDeque<>();

        // 添加元素到双端队列
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addLast("Orange");

        // 获取双端队列头部和尾部元素
        String first = deque.getFirst();
        String last = deque.getLast();
        System.out.println("头部元素：" + first);
        System.out.println("尾部元素：" + last);

        // 遍历双端队列并输出元素
        System.out.println("双端队列元素（从头到尾）：");
        for (String element : deque) {
            System.out.println(element);
        }

        // 移除双端队列头部和尾部元素
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();
        System.out.println("移除的头部元素：" + removedFirst);
        System.out.println("移除的尾部元素：" + removedLast);

        // 双端队列大小
        int size = deque.size();
        System.out.println("双端队列大小：" + size);

        // 判断双端队列是否为空
        boolean isEmpty = deque.isEmpty();
        System.out.println("双端队列是否为空：" + isEmpty);
    }
}