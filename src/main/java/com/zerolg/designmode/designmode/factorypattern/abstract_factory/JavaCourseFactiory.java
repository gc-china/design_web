package com.zerolg.designmode.designmode.factorypattern.abstract_factory;

/**
 * @program: design
 * @description: java课程工厂
 * @author: Gyc
 * @create: 2019-05-06 21:46
 **/
public class JavaCourseFactiory implements CourseFactory {
    public Video geteVide() {
        return new JavaVidoe();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
