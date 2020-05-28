package com.hyf.design.observer.v4;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/28]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Main {
    public static void main(String[] args) {
        Children children =new Children();
        Dad dad = new Dad();
        children.addObserver(dad);
        children.addObserver(new Mom());
        children.wake();
        System.out.println("===============");
        children.addObserver(new Dog());
        children.deleteObserver(dad);
        children.wake();
    }
}
