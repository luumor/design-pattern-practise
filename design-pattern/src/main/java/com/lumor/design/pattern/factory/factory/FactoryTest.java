package com.lumor.design.pattern.factory.factory;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 14:59
 * @Description: 工厂模式，专用工厂生产专车
 */
public class FactoryTest {

    public static void main(String[] args) {

        Factory audiFac = new AudiFacory();

        System.out.println(audiFac.getCar().getCar());

        Factory bmwFactory = new BmwFactory();
        System.out.println(bmwFactory.getCar().getCar());

    }

}
