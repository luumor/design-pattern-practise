package com.lumor.design.pattern.singleton.lazy;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 16:00
 * @Description:
 */
// 特点：在外部类调用时 内部类才会被加载

    //这种形式 兼顾了恶汉式的内存浪费，也兼顾了synchronized 性能问题
public class LazyThree {

    private static boolean initialized = false;

    private LazyThree(){
        // 锁类
        synchronized (LazyThree.class){

            if (initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已经被侵犯！");
            }
        }

    }

    public static final LazyThree getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }

}
