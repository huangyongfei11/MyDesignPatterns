package com.hyf.design.strategy.v2;

import java.util.Arrays;

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

    public static void main(String[] args) {

        Dog dog =new Dog(2,"tewwwwwws");
        Dog dog2 =new Dog(4,"ab");
        Dog dog3 =new Dog(3,"scww");
        Dog dog5 =new Dog(6,"ab");
        Dog dog4 =new Dog(1,"jkssss");

        Dog[] dogs = new Dog[]{dog,dog2,dog3,dog4,dog5};

        Sort<Dog> sort  = new Sort<>();
        sort.sort(dogs,new DogAgeComparator());
        System.out.println(Arrays.asList(dogs));
        System.out.println("===================");

        sort.sort(dogs,(d1,d2)->{
            if(d1.getName().equals(d2.getName())){
                return 0;
            }else if(d1.getName().length() > d2.getName().length()){
                return -1;
            }else{
                return 1;
            }
        });
        System.out.println(Arrays.asList(dogs));
        System.out.println("===================");
    }
}
