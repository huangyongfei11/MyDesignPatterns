package com.hyf.design.singleton.v6;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class StaticInnerClassSingleton {

    private  StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstance(){
        return Test.INNER_CLASS_SINGLETON;
    }
    static class Test{
        private static final StaticInnerClassSingleton INNER_CLASS_SINGLETON = new StaticInnerClassSingleton();
    }

    public static void main(String[] args) {
        System.out.println(getInstance().equals(getInstance()));
    }
}
