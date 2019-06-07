package com.zerolg.designmode.designmode.factorypattern.factory_method;

/**
 * @program: design
 * @description: java工厂
 * @author: Gyc
 * @create: 2019-05-05 19:30
 **/
public class JavaFaction extends VideoFaction {
    public Video getVido() {
        return new JavaVideo();
    }
}
