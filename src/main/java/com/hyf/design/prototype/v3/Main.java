package com.hyf.design.prototype.v3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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

        //深克隆，通过序列化
        System.out.println(person.location.getAddress());
        System.out.println(person1.location.getAddress());


    }
}

class Person implements Serializable {

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
    protected Person clone() {
        try {

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);

            ObjectOutputStream  outputStream= new ObjectOutputStream(new BufferedOutputStream(byteArrayOutputStream));
            outputStream.writeObject(this);
            outputStream.flush();

            byte[] bytes = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(byteArrayInputStream));

            return (Person) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Location implements Serializable{

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
