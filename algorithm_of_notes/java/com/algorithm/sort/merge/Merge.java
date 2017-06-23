package com.algorithm.sort.merge;

import java.util.Arrays;

/**
 * 归并排序（递归）
 * Created by yulinfeng on 2017/6/23.
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 1, 7, 2, 4};
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 归并排序
     * @param nums 待排序数组序列
     * @return 排好序的数组序列
     */
    private static int[] mergeSort(int[] nums) {
        segment(nums, 0, nums.length - 1);
        return nums;
    }

    /**
     * 递归切分待排
     * @param nums 待切分数组
     * @param left 待切分最后第一个元素的索引
     * @param right 待切分数组最后一个元素的索引
     */
    private static void segment(int[] nums, int left, int right) {
        if (left >= right)
            return;
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        segment(nums, left, center);
        // 对右边数组进行递归
        segment(nums, center + 1, right);
        // 合并
        merge(nums, left, center, right);
    }

    /**
     * 两两归并排好序的数组（2路归并）
     * @param nums 带排序数组对象
     * @param left 左边数组的第一个索引
     * @param center 左数组的最后一个索引，center + 1右数组的第一个索引
     * @param right 右数组的最后一个索引
     */
    private static void merge(int[] nums, int left, int center, int right) {
        int[] tmpArray = new int[nums.length];
        int rightIndex = center + 1;   // 右数组第一个元素索引
        int tmpIndex = left;    //临时数组索引
        int begin = left;   // 缓存左数组第一个元素的索引，用于将排好序的数组拷贝回原数组
        while (left <= center && rightIndex <= right) {
            if (nums[left] <= nums[rightIndex]) {
                tmpArray[tmpIndex++] = nums[left++];
            } else {
                tmpArray[tmpIndex++] = nums[rightIndex++];
            }
        }
        while (left <= center) {
            tmpArray[tmpIndex++] = nums[left++];
        }
        while (rightIndex <= right) {
            tmpArray[tmpIndex++] = nums[rightIndex++];
        }
        while (begin <= right) {
            nums[begin] = tmpArray[begin++];
        }
    }
}
