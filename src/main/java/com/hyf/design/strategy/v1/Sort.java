package com.hyf.design.strategy.v1;

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

    public void sort(T[] es, Comparable<T> comparable) {

        for (int i = 0; i < es.length; i++) {
            for (int j = i + 1; j < es.length; j++) {
                int minPos = comparable.compareTo(es[i], es[j]) == -1 ? j : i;
                swap(es, i, minPos);
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Sort<Integer> sort = new Sort<>();
        Integer[] integer = new Integer[]{1, 3, 5, 2, 1, 4};
        sort.sort(integer, (t1, t2) -> {
            if (t1 > t2) {
                return -1;
            }else {
                return 0;
            }
        });
        Arrays.stream(integer).forEach(item -> {
            System.out.println(item);
        });

    }
}
