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
public class Main {
    public static void main(String[] args) {
        Children children =new Children("黄晓🐟");
        Dad dad = new Dad();
        children.addObserver(dad);
        children.addObserver(new Mom());
        children.wake();
        System.out.println("===============");
        Children children2 =new Children("黄大🐟");
        children2.addObserver(new Mom());
        children2.wake();
    }
}
