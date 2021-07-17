package com.javniuniu.distance.invoke;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @auther: javaniuniu
 * @date: 2020/8/17 8:17 AM
 */
public class TestClass {
    public int test1(int x) {
        int xx = x + 2;
        Point p = new Point(x,42);
        return p.getX();
    }
    private AtomicLong count = new AtomicLong(0);

    public long getCount() {
//        System.out.println(Thread.currentThread().getName()+" :"+count);
//        System.out.println(count);
        return count.get();
    }
    public synchronized void setCount() {
        System.out.println(Thread.currentThread().getName()+" :"+count);
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                testClass.setCount();
                testClass.getCount();
            }, String.valueOf(i)).start();
        }
    }
    
}
