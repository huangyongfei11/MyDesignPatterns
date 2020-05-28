package com.hyf.design.observer.v1;

import java.nio.charset.Charset;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 * 披着面向对象外衣的面向过程
 */
public class MainTest {

    public static void main(String[] args)  {
         Child child = new Child();

        new Thread(()->{
            try {
                System.out.println("开始循环");
                while (!child.isCry()) {
                    //为什么不加volatile也能正常停止，
                    // 因为println方法中存在synchronized修饰的代码块
                    //synchronized肯定能保证原子性，可见性和指令重排
//                    System.out.println("观察宝宝。。。。。");
                };
                System.out.println("结束循环");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            child.setCry(true);
            System.out.println("宝宝醒了。。。。");
        }).start();

        System.out.println("===============");



    }
}
class Child{

    private  boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void setCry(boolean cry) {
        this.cry = cry;
    }
}
