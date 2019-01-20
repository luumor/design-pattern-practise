package com.lumor.design.pattern.proxy.cglib;

/**
 * Created by Tom on 2018/3/10.
 */
public class CglibTest {

    public static void main(String[] args) {

        try {
            com.lumor.design.pattern.proxy.cglib.ZhangSan obj = (com.lumor.design.pattern.proxy.cglib.ZhangSan)new CglibMeipo().getInstance(com.lumor.design.pattern.proxy.cglib.ZhangSan.class);
            obj.findLove();
            System.out.println("--------------------------------");
           // System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
