package com.lumor.design.pattern.factory.abstr;

import com.lumor.design.pattern.factory.AudiCar;
import com.lumor.design.pattern.factory.Bmw;
import com.lumor.design.pattern.factory.Car;
import com.lumor.design.pattern.factory.factory.AudiFacory;
import com.lumor.design.pattern.factory.factory.BmwFactory;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 15:06
 * @Description:
 */
public class CarFactory extends  AbstractFactory{
    @Override
    public Car getAudi() {
        return new AudiFacory().getCar();
    }

    @Override
    public Car getBmw() {
        return new BmwFactory().getCar();
    }
}
