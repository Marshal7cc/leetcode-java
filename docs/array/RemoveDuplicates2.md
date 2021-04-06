## 题目描述

给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

 

说明：

为什么返回数值是整数，但输出的答案是数组呢？

请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:

<br>// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
<br>int len = removeDuplicates(nums);

<br>// 在函数里修改输入数组对于调用者是可见的。
<br>// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
<br>for (int i = 0; i < len; i++) {
<br>print(nums[i]);
<br>}

示例 1：
<br>输入：nums = [1,1,1,2,2,3]
<br>输出：5, nums = [1,1,2,2,3]
<br>解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。

示例 2：
<br>输入：nums = [0,0,1,1,1,1,2,3,3]
<br>输出：7, nums = [0,0,1,1,2,3,3]
<br>解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 不需要考虑数组中超出新长度后面的元素。

提示：
<br>1 <= nums.length <= 3 * 104
<br>-104 <= nums[i] <= 104
<br>nums 已按升序排列

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-yec2/)

## 代码

[RemoveDuplicates2.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/array/RemoveDuplicates2.java)

