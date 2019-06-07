package com.zerolg.designmode.designmode.factorypattern.simple_factory;

/**
 * @program: designmode_ pattern
 * @description: 测试
 * @author: Gyc
 * @create: 2019-04-29 10:50
 **/
public class Test {
    public static void main(String[] args) {
      VideoFaction videoFaction = new VideoFaction();
        Video video = videoFaction.getVido("java");
        if (video == null) {

            return;
        }
        video.produce();
    }
      /*  VideoFaction videoFaction = new VideoFaction();
        Video vido = videoFaction.getVido(JavaVideo.class);

        vido.produce();*/

}