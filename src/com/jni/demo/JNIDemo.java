/**
 * @ClassName JNIDemo
 * @Description TODO
 * @Author Liyihe
 * @Date 19-6-8 下午10:36
 * @Version 1.0
 */
package com.jni.demo;

public class JNIDemo {
    static {
        NativeLoader.loader("com/jni/demo/libtest.so");
    }
    public native static void sayHello();
}
