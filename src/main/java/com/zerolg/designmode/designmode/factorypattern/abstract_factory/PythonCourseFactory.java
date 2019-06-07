package com.zerolg.designmode.designmode.factorypattern.abstract_factory;

/**
 * @program: design
 * @description: Python 视频工厂
 * @author: Gyc
 * @create: 2019-05-06 21:49
 **/
public class PythonCourseFactory implements CourseFactory {
    public Video geteVide() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
