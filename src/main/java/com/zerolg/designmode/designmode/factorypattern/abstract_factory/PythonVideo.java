package com.zerolg.designmode.designmode.factorypattern.abstract_factory;

/**
 * @program: design
 * @description: Python 视频
 * @author: Gyc
 * @create: 2019-05-06 21:47
 **/
public class PythonVideo implements Video {
    public void produce() {
        System.out.println("录制Pythion视频");
    }
}
