package com.hyf.design.singleton.v4;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/26]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DCLSingleton {

    private static volatile DCLSingleton instance;

    private DCLSingleton(){

    }

    public static DCLSingleton getInstance(){
        if(null == instance){
            synchronized (DCLSingleton.class){
                if(null == instance){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
