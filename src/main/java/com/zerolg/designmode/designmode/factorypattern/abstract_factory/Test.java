package com.zerolg.designmode.designmode.factorypattern.abstract_factory;

/**
 * @program: design
 * @description: 测试
 * @author: Gyc
 * @create: 2019-05-06 21:54
 **/
public class Test  {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactiory();
        courseFactory.getArticle().produce();
        courseFactory.geteVide().produce();
    }
}
