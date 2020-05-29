package com.hyf.design.strategy.v2;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/29]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Dog {

    private int age;

    private String name;

    public Dog(int age, String name){
        this.age =age;
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
