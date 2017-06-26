#快速排序
def quick_sort(nums, left, right):
    if left < right:
        temp = nums[left]
        i = left
        j = right
        while i < j:
            while i < j and nums[j] >= temp:
                j -= 1
            if i < j:
                nums[i] = nums[j]
                i += 1
            while i < j and nums[i] < temp:
                i += 1
            if i < j:
                nums[j] = nums[i]
                j -= 1
        nums[i] = temp
        quick_sort(nums, left, i - 1)
        quick_sort(nums, i + 1, right)
    
    return nums

nums = [6, 1, 2, 7, 9, 3, 4, 5, 10, 8]
nums = quick_sort(nums, 0, len(nums) - 1)
print(nums)