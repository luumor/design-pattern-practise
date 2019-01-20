package com.lumor.design.pattern.factory.simple;

import com.lumor.design.pattern.factory.AudiCar;
import com.lumor.design.pattern.factory.Bmw;
import com.lumor.design.pattern.factory.Car;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 14:39
 * @Description:
 */
public class SimpleFactory {

    public Car getCar(String carName){

        if ("audi".equalsIgnoreCase(carName)){
            return new AudiCar();
        }else if ("bmw".equalsIgnoreCase(carName)){
            return new Bmw();
        }else{
            return null;
        }
    }
}
