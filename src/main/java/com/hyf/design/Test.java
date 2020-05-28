package com.hyf.design;

import java.util.Arrays;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author hyf
 * @version [版本号, 2020/5/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class Test {

    /**
     * 二分法查找,前提是数组的内容是有序的
     *
     * @param arr 数组
     */
    public static void queryByMid(int[] arr) {
        int target = 4;
        int index = -1;
        int begin = 0;
        int end = arr.length - 1;
        int mid;
        while (true) {
            mid = (begin + end) / 2;
            if (target == arr[mid]) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
            //不加这行会死循环
            if (begin >= end) {
                break;
            }
        }

        System.out.println(index);
    }


    public static void quickSort(int[] arr, int low, int high) {
        int number, i, j;
        if (low > high) {
            return;
        }
        number = arr[low];
        i = low;
        j = high;
        while (i < j) {
            while (arr[j] >= number && i < j) {
                j--;
            }
            while (arr[i] <= number && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = number;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);

    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 4, 2, 1};
        Test.quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(item -> System.out.println(item));
    }

}

