package com.lumor.design.pattern.singleton.lazy;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 15:51
 * @Description:
 */
public class LazyOne {

    private LazyOne(){
    }

    private static LazyOne lazy = null;

    public static LazyOne getInstance(){

        //调用之前，先判断
        // 如果没有初始化，将其进行初始化，并且赋值
        // 将该实例缓存
        if (lazy == null){
            lazy = new LazyOne();
        }
        return lazy;
    }

}
