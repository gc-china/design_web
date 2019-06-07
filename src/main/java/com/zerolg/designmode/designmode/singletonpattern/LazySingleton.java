package com.zerolg.designmode.designmode.singletonpattern;

/**
 * @program: design
 * @description: 懒汉式 线程不安全的  重点与懒加载  只有使用的时候才创建对象
 * @author: Gyc
 * @create: 2019-05-08 11:55
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例设计模式不允许反射调用");
        }
    }

    /**
     * synchronized 加入synchronized 后性能降低 线程安全
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
