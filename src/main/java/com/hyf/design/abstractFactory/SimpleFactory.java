package com.hyf.design.abstractFactory;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class SimpleFactory extends AbastractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new CheryVehicle();
    }

    @Override
    Weapon createWeapon() {
        return new Knife();
    }
}
