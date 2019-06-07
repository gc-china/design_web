package com.zerolg.designmode.designmode.factorypattern.factory_method;

/**
 * @program: design
 * @description: 前端视频工厂
 * @author: Gyc
 * @create: 2019-05-05 19:43
 **/
public class HTMLFaction extends VideoFaction {
    public Video getVido() {
        return  new  HtmlVide();
    }
}
