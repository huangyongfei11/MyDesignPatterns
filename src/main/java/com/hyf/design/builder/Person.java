package com.hyf.design.builder;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Person {

    /**
     * 必填
     */
    private String name;

    /**
     * 必填
     */
    private String sex;

    /**
     * 必填
     */
    private int age;

    private int height;

    private int weight;

    private String  identify;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "BuilderPerson{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", identify='" + identify + '\'' +
                '}';
    }

    static  class  BuilderPerson{

        private Person p;

        public BuilderPerson(String name,String sex,int age){
            p = new Person(name,sex,age);
        }

        public BuilderPerson height(int height) {
            p.height = height;
            return this;
        }


        public BuilderPerson weight(int weight) {
            p.weight = weight;
            return this;
        }

        public BuilderPerson identify(String identify) {
            p.identify = identify;
            return this;
        }

        public Person build(){
            return p;
        }

    }

    public static void main(String[] args) {
        Person person = new Person.BuilderPerson("黄","男",24)
                .height(121)
                .weight(160).build();
        System.out.println(person);
    }

}
