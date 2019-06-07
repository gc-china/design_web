package com.zerolg.designmode.designmode.factorypattern.simple_factory;

/**
 * @program: designmode_ pattern
 * @description: 简单工厂中的具体类
 * @author: Gyc
 * @create: 2019-04-29 10:44
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
