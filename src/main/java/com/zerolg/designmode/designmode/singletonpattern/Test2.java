package com.zerolg.designmode.designmode.singletonpattern;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: design
 * @description: 单例破坏单例
 * @author: Gyc
 * @create: 2019-05-11 11:01
 **/
public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class hsl = HungrySingleton.class;
//        获取反射对象
        Constructor hslClass = hsl.getDeclaredConstructor();
//        开启暴力破解
        hslClass.setAccessible(true);
//        利用反射对象实例化
        HungrySingleton newInstance = (HungrySingleton) hslClass.newInstance();
        //        单例获取对象
        HungrySingleton instance = HungrySingleton.getHungrySingleton();
//        比较两对象是否为同一对象
        System.out.println("两对象是否还是同一实例" + (instance == newInstance));


    }
    @Test
    public  void  test2() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Class hsl = LazySingleton.class;
//        获取反射对象
        Constructor hslClass = hsl.getDeclaredConstructor();
//        开启暴力破解
        hslClass.setAccessible(true);
//        利用反射对象实例化
        LazySingleton newInstance = (LazySingleton) hslClass.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
//        比较两对象是否为同一对象
        System.out.println("两对象是否还是同一实例" + (instance == newInstance));
    }
}
