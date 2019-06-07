package com.zerolg.designmode.designmode.factorypattern.simple_factory;

/**
 * @program: designmode_ pattern
 * @description: 简单工厂中的具体类
 * @author: Gyc
 * @create: 2019-04-29 10:43
 **/
public class JavaVideo extends  Video {
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
