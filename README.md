javah com.jni.demo.JNIDemo 生成com_jni_demo_JNIDemo.h头文件
将com_jni_demo_JNIDemo.h文件与 jni.h jni_md.h(在JDK include文件夹下)
创建testJni.c

#include "com_jni_demo_JNIDemo.h"
JNIEXPORT void JNICALL Java_com_jni_demo_JNIDemo_sayHello (JNIEnv * env, jobject obj)
{
    printf("Hello World! from jni");
    return;
}

将com_jni_demo_JNIDemo.h中 #include <jni.h> 改为#include "jni.h"  和 jni.h 中 #include <jni_md.h> 改为 #include "jni_md.h"

gcc testJni.c -fPIC -shared -o libtest.so
将libtest.so copy到java工程
# Jni
