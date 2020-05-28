package com.hyf.design.observer.v2;

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
        new Children(new Dad()).wake();
    }
}
class Children{

    private boolean isCry = false;

    private Dad dad;

    public Children(Dad dad){
        this.dad = dad;
    }

    public void wake(){
        isCry =true;
        dad.wake();

    }

}
class Dad{

    public void wake(){
        System.out.println("为宝宝喝奶。。。");
    }
}
