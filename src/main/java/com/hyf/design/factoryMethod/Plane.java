package com.hyf.design.factoryMethod;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/26]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Plane extends Moveable {
    @Override
    public void move() {
        System.out.println("飞机 嗡嗡嗡。。。。。");
    }
}
