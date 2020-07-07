package com.javaniuniu;

import org.junit.Test;

import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @auther: javaniuniu
 * @date: 2020/7/7 11:23 AM
 */
// jdk1.8 生成 100，200之间的随机数，
public class Random {
    public static void main(String[] args) {


    }
    // 速度比random 快
    @Test
    public void random1() {
        // ThreadLocalRandom
        int randomNum = ThreadLocalRandom.current().nextInt(100,200);
        System.out.println(randomNum);
    }
    // 速度比random 快
    @Test
    public void random2() {
        // ThreadLocalRandom
        SplittableRandom random = new SplittableRandom();
        int num = random.nextInt(100,200);
        System.out.println(num);
    }
    // 速度比random 快
    @Test
    public void random3() {
        // ThreadLocalRandom
        int num =ThreadLocalRandom.current().ints(100,200).distinct().limit(1).findFirst().getAsInt();
        System.out.println(num);
    }

}
