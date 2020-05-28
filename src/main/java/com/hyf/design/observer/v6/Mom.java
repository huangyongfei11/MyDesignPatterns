package com.hyf.design.observer.v6;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/28]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Mom implements Observer {
    @Override
    public void wake(WakeUpEvent wakeUpEvent) {
        Children children = wakeUpEvent.getSource();
        System.out.println(children.getName()+"乖，不哭。。。");
    }

}
