package com.zerolg.designmode.designmode.singletonpattern;

import java.io.Serializable;

/**
 * @program: design
 * @description: 饿汉设计模式
 * @author: Gyc
 * @create: 2019-05-11 10:16
 **/
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw  new  RuntimeException("单例设计模式不允许反射调用");
        }
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

    public Object readResolve() {
        return hungrySingleton;
    }
}
