package com.hyf.design.prototype.v2;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/29]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(24, "笑话");

        Person person1 = person.clone();

        System.out.println(person.hashCode() == person1.hashCode());

        System.out.println(person.location == person1.location);
        person.location.setAddress("去学校。。。。");

        //深克隆，但是每个成员变量都需要重写clone方法以及实现Cloneable接口
        System.out.println(person1.location.getAddress());


    }
}

class Person implements Cloneable{

    private int age;

    private String name;

    Location location = new Location("在家");

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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
    protected Person clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        this.location = (Location) p.location.clone();
        return p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Location implements Cloneable{

    private String Address;

    public Location(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Location{" +
                "Address='" + Address + '\'' +
                '}';
    }
}
