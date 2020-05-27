package com.hyf.design.singleton.v3;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/26]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class SyncSingleton {

    private static SyncSingleton instance;

    private SyncSingleton() {

    }

    public static synchronized SyncSingleton getInstance() {
        if (null == instance) {
            instance = new SyncSingleton();
        }
        return instance;
    }
}
