package com.lumor.design.pattern.factory.abstr;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 15:04
 * @Description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFactory factory  = new CarFactory();

        System.out.println(factory.getAudi().getCar());

        System.out.println(factory.getBmw().getCar());
    }
}
