package com.zerolg.designmode.designmode.factorypattern.abstract_factory;

/**
 * @Author Gyc
 * @Description 课程工厂 产品族工厂  课程=视频+手记
 * @Date 21:36 2019-05-06
 * @Param
 * @return
 **/
public interface CourseFactory {
    public abstract  Video geteVide();
    public abstract  Article getArticle();
}
