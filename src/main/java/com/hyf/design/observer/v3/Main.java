package com.hyf.design.observer.v3;

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
        new Children().wake();
    }
}
class Children{

    private boolean isCry =false;

    private Dad dad = new Dad();

    private Mom mom = new Mom();

    private Dog dog = new Dog();

    public void wake(){
        isCry =true;
        dad.wake();
        mom.wake();
        dog.wake();
    }

}
class Dad{

    public void wake(){
        System.out.println("喂宝宝。。。");
    }
}
class Mom{
    public void wake(){
        System.out.println("抱宝宝。。。");
    }
}
class Dog{
    public void wake(){
        System.out.println("摇尾巴。。。");
    }
}
