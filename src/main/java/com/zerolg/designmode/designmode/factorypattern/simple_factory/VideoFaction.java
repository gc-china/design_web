package com.zerolg.designmode.designmode.factorypattern.simple_factory;

/**
 * @program: designmode_ pattern
 * @description: 简单工厂中的视频工厂类
 * @author: Gyc
 * @create: 2019-04-29 10:40
 **/
public class VideoFaction {
    /**
     * @Author Gyc
     * @Description //TODO 不使用简单反射创建实例
     * @Date 14:24 2019-04-29
     * @Param [type]
     * @return com.zerolg.com.zerolg.designmode.designmode.factorypattern.simple_factory.Video
     **/
    public Video getVido(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaVideo();
        } else if (type.equalsIgnoreCase("python")) {
            return new PythonVideo();
        } else {
            return null;
        }

    }

    /**
     * @return com.zerolg.com.zerolg.designmode.designmode.factorypattern.simple_factory.Video
     * @Author Gyc
     * @Description //TODO 用反射创建
     * @Date 11:12 2019-04-29
     * @Param [video]
     **/
  /*  public Video getVido(Class v) {
        Video video = null;
        try {
            video = (Video) Class.forName(v.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }*/
}
