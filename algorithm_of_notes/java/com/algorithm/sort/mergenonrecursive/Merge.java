package com.algorithm.sort.mergenonrecursive;

import java.util.Arrays;

/**
 * 归并排序（非递归）
 * Created by yulinfeng on 2017/6/24.
 */
public class Merge {

    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 1, 7, 2, 4};
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 归并排序（非递归）
     * 从切分的数组长度为1开始，一次归并变回原来长度的2倍
     * @param nums 待排序数组
     * @return 排好序的数组
     */
    private static int[] mergeSort(int[] nums) {
        int len = 1;
        while (len <= nums.length) {
            for (int i = 0; i + len <= nums.length; i += len * 2) {
                int low = i, mid = i + len - 1, high = i + 2 * len - 1;
                if (high > nums.length - 1) {
                    high = nums.length - 1; //整个待排序数组为奇数的情况
                }
                merge(nums, low, mid, high);
            }
            len *= 2;
        }
        return nums;
    }

    /**
     * 将切分的数组进行归并排序
     * @param nums 带排序数组
     * @param low 左边数组第一个元素索引
     * @param mid 左边数组最后一个元素索引，mid + 1为右边数组第一个元素索引
     * @param high 右边数组最后一个元素索引
     */
    private static void merge(int[] nums, int low, int mid, int high) {
        int[] tmpArray = new int[nums.length];
        int rightIndex = mid + 1;
        int tmpIndex = low;
        int begin = low;
        while (low <= mid && rightIndex <= high) {
            if (nums[low] <= nums[rightIndex]) {
                tmpArray[tmpIndex++] = nums[low++];
            } else {
                tmpArray[tmpIndex++] = nums[rightIndex++];
            }
        }
        while (low <= mid) {
            tmpArray[tmpIndex++] = nums[low++];
        }
        while (rightIndex <= high) {
            tmpArray[tmpIndex++] = nums[rightIndex++];
        }
        while (begin <= high) {
            nums[begin] = tmpArray[begin++];
        }
    }
}
