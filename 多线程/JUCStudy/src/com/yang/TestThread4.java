package com.yang;

/**
 * 多个线程同时操作同一个对象  买火车票案例
 */
//发现问题:多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TestThread4 implements Runnable {

    //票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "--->拿到了第" + ticketNums-- + "张票");
        }
    }
    public static void main(String[] args) {

        TestThread4 ticket = new TestThread4();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛1").start();
        new Thread(ticket,"黄牛2").start();
    }
}