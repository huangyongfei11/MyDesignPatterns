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
public interface Comparator<T> {

    int compareTo(T t1,T t2);
}
