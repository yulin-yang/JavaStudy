package com.yang;

public class TestThread3 implements Runnable {

    @Override
    public void run() {

        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码----" + i);
        }
    }

    public static void main(String[] args) {
        //main线程，上线程
        //创建一个线程对象
        TestThread3 testThread = new TestThread3();
        //调用start（）开启线程
        new Thread(testThread).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程----" + i);
        }
    }
}