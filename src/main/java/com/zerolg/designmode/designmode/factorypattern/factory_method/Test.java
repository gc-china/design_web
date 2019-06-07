package com.zerolg.designmode.designmode.factorypattern.factory_method;

/**
 * @program: designmode_ pattern
 * @description: 测试
 * @author: Gyc
 * @create: 2019-04-29 10:50
 **/
public class Test {
    public static void main(String[] args) {
        VideoFaction vide = new PythonFaction();
        VideoFaction vide2 = new JavaFaction();
        VideoFaction vide3 = new HTMLFaction();
        vide.getVido().produce();
        vide2.getVido().produce();
        vide3.getVido().produce();
    }

}