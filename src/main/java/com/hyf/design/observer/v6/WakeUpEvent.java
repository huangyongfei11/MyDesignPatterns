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
public class WakeUpEvent extends Event<Children> {

    long time;

    String address;

    private  Children source;

    public WakeUpEvent(long time, String address, Children source){
        this.time = time;
        this.address = address;
        this.source = source;
    }

    @Override
    public Children getSource() {
        return source;
    }
}
