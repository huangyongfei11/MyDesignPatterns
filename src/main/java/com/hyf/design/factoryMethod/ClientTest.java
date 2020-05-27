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
public class ClientTest {

    public static void main(String[] args) {

        //优点，创建对象的细节被封装，后期如果创建car的逻辑变动，
        // 调用方无感知，可扩展性比较好
        Moveable move = CarFactory.create();
        move.move();
        move = PlaneFactory.create();
        move.move();
        move = BroomFactory.create();
        move.move();
    }

}
