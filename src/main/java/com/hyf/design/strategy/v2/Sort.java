package com.hyf.design.strategy.v2;

import com.hyf.design.strategy.v1.Comparable;

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
public class Sort<T> {

    public void sort(T[] es, Comparator<T> comparator) {
        for (int i = 0; i < es.length; i++) {
            for (int j = i + 1; j < es.length; j++) {
                int minPos = comparator.compareTo(es[i], es[j]) == -1 ? j : i;
                swap(es, i, minPos);
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
