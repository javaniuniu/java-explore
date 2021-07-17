package com.javniuniu.distance.invoke;

/**
 * 为了多次载入执行类而加入的类加载器
 * 把 defineClass 方法放出来，只有外部显示调用的时候才会使用到 loadByte 方法
 * 由虚拟机调用时，仍然按照原有的双亲委派机制规则使用 loadClass 方法进行类加载
 *
 * @auther: javaniuniu
 * @date: 2020/8/16 7:22 PM
 */
public class HotSwapClassLoader extends ClassLoader {
    public HotSwapClassLoader() {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classByte) {
        return defineClass(null,classByte,0,classByte.length);
    }
}
