package com.lumor.design.pattern.singleton.hungry;

/**
 * @Auther: Administrator
 * @Date: 2018/12/31 0031 15:46
 * @Description: 恶汉式 单例
 *
 */

/**
 * 在类加载时候初始化，并且创建单例对象，存储在静态变量中
 * 线程绝对安全
 */
// 优点：没有加任何的锁，执行效率高，在用户体验上比懒汉式更好
    //缺点：类加载时候就初始化，占用内存空间，有可能浪费了部分内存
public class Hungry {

    private  Hungry(){
        // 类初始化顺序
        // 先静态、后动态
        //先上后下
    }

    private  static  final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return  hungry;
    }


}
