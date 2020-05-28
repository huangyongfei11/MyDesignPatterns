package com.hyf.design.observer.v5;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/28]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Dad implements Observer {
    @Override
    public void wake(WakeUpEvent wakeUpEvent) {
        String msg = wakeUpEvent.address;
        if(msg.equals("宝宝掉地上了")){
            System.out.println("把宝宝放到床上。。。");
        }

        System.out.println("喂宝宝。。。");
    }
}
