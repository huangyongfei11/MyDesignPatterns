package com.hyf.design.singleton.v2;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/26]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Singleton {
    //保证单例的原因，static修饰成员变量，只会再类加载的时候初始化一次，
    // final使得该成员变量不能重新赋值
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }

    /**
     * 静态工厂方式提供单例
     * @return
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().equals(Singleton.getInstance()));
    }
}
