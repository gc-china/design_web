package com.zerolg.designmode.designmode.Test;

import com.zerolg.designmode.designmode.singletonpattern.HungrySingleton;

import java.io.*;

/**
 * @program: design
 * @description: 测试
 * @author: Gyc
 * @create: 2019-05-08 11:58
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        序列化和反序列化破坏单例
//  创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singLeton_file"));
//      获取单例对象
        HungrySingleton instance = HungrySingleton.getHungrySingleton();
//      序列化对象
        oos.writeObject(instance);
//        创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singLeton_file")));
//      反序列对象
        HungrySingleton newinstance = (HungrySingleton) ois.readObject();
//      对比两对象是否为同一对象
        System.out.println("序列化后是否还是同一个对象:"+(instance == newinstance));
    }
}
