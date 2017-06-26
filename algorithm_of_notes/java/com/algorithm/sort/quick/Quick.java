package com.algorithm.sort.quick;

import java.util.Arrays;

/**
 * 快速排序
 * Created by 余林丰 on 2017/6/26/0026.
 */
public class Quick {
    public static void main(String[] args) {
        int[] nums = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        nums = quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    
    /**
     * 快速排序
     * @param nums 待排序数组序列
     * @param left 数组第一个元素索引
     * @param right 数组最后一个元素索引
     * @return 排好序的数组序列
     */
    private static int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int temp = nums[left];
            int i = left;
            int j = right;
            while (i < j) {
                while (i < j && nums[j] >= temp) {
                    j--;
                }
                if (i < j) {
                    nums[i] = nums[j];
                    i++;
                }
                while (i < j && nums[i] < temp) {
                    i++;
                }
                while (i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }
            nums[i] = temp;
            quickSort(nums, left, i - 1);
            quickSort(nums, i + 1, right);
        }
        return nums;
    }
}
