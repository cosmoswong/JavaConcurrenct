package com.bigdata.juc.part2.classloader.chapter5;

/***************************************
 * @author:Alex Wang
 * @Date:2017/4/4 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class RuntimePackage {
    //RuntimePackage
    //com.bigdata.juc.part2.classloader.chapter5
    //Boot.Ext.App.com.bigdata.juc.part2.classloader.chapter5

    //Boot.Ext.App.com.bigdata.juc.part2.classloader.chapter5.SimpleClassLoaderTest
    //Boot.Ext.App.SimpleClassLoader.com.bigdata.juc.part2.classloader.chapter5.SimpleClassLoaderTest

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SimpleClassLoader simpleClassLoader = new SimpleClassLoader();
        Class<?> aClass = simpleClassLoader.loadClass("com.bigdata.juc.part2.classloader.chapter5.SimpleObject");
        //sSystem.out.println(aClass.getClassLoader());
        SimpleObject simpleObject = (SimpleObject) aClass.newInstance();
    }
}