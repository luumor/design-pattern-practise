package com.lumor.design.pattern.factory.abstr;

import com.lumor.design.pattern.factory.Car;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 15:02
 * @Description:
 */
public abstract class AbstractFactory {

    /**
     *
     * @return
     */
    public abstract Car getAudi();

    /**
     *
     * @return
     */
    public abstract Car getBmw();

}
