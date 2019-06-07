package com.zerolg.designmode.designmode.factorypattern.factory_method;

/**
 * @program: design
 * @description: Python 工厂
 * @author: Gyc
 * @create: 2019-05-05 19:31
 **/
public class PythonFaction extends VideoFaction {
    public Video getVido() {
        return new PythonVideo();
    }
}
