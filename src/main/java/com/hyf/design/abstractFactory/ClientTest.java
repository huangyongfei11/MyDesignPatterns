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
public class ClientTest {

    public static void main(String[] args) {
//        AbastractFactory abastractFactory = new SimpleFactory();
        AbastractFactory abastractFactory = new RichFactory();
        abastractFactory.createFood().printName();
        abastractFactory.createVehicle().printName();
        abastractFactory.createWeapon().printName();


    }
}
