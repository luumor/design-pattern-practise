package com.lumor.design.pattern.factory.factory;

import com.lumor.design.pattern.factory.AudiCar;
import com.lumor.design.pattern.factory.Car;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 14:51
 * @Description:
 */
public class AudiFacory implements Factory{
    @Override
    public Car getCar() {
        return new AudiCar();
    }
}
