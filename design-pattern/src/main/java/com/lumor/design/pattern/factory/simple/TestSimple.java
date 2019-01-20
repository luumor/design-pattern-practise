package com.lumor.design.pattern.factory.simple;

import com.lumor.design.pattern.factory.AudiCar;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 14:37
 * @Description: 简单工厂隐藏 制造细节，但是 耦合严重，不利于扩展
 */
public class TestSimple {
    public static void main(String[] args) {

//        System.out.println(new AudiCar().getCar());

        SimpleFactory fac = new SimpleFactory();
        System.out.println(fac.getCar("audi").getCar());
        System.out.println(fac.getCar("bmw").getCar());

    }

}
