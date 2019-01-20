package com.lumor.design.pattern.factory.factory;

import com.lumor.design.pattern.factory.Bmw;
import com.lumor.design.pattern.factory.Car;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 14:58
 * @Description:
 */
public class BmwFactory implements Factory{
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
