package com.yang.myTest;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;

public class MyTest {


    @Test
    public void bloomFilterTest(){

        BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), 5000000);
        for (int i = 0; i < 5000000; i++) {
            bloomFilter.put(i);
        }
        long start = System.nanoTime();
        if (bloomFilter.mightContain(500000)) {
            System.out.println("成功过滤到500000");
        }
        long end = System.nanoTime();
        System.out.println("布隆过滤器消耗时间"+(end - start)/1000000L+"毫秒");


    }
}
