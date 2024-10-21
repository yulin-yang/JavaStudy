package com.yang;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//测试线程池
public class ThreadPool {

    public static void main(String[] args) {

        // 1. 创建服务，擦行间线程池
        // newFixedThreadPool(线程池大小)
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        //执行
        threadPool.execute(new MyThread());
        threadPool.execute(new MyThread());
        threadPool.execute(new MyThread());
        threadPool.execute(new MyThread());
        threadPool.execute(new MyThread());
        threadPool.execute(new MyThread());
        //关闭连接
        threadPool.shutdown();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread2 implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}