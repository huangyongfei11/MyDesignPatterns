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
public class DogAgeComparator implements Comparator<Dog> {
    @Override
    public int compareTo(Dog t1, Dog t2) {
        if(t1.getAge() > t2.getAge()){
            return -1;
        }else if(t1.getAge() == t2.getAge()){
            return 0;
        }else{
            return 1;
        }
    }
}
