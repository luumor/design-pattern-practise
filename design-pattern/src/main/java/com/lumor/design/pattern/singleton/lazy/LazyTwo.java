package com.lumor.design.pattern.singleton.lazy;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 15:51
 * @Description:
 */
public class LazyTwo {

    private LazyTwo(){
    }

    private static LazyTwo lazy = null;

    public static synchronized LazyTwo getInstance(){

        //调用之前，先判断
        // 如果没有初始化，将其进行初始化，并且赋值
        // 将该实例缓存
        if (lazy == null){
            lazy = new LazyTwo();
        }
        return lazy;
    }

}
