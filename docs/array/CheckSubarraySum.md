## 题目描述

给你一个整数数组 nums 和一个整数 k ，编写一个函数来判断该数组是否含有同时满足下述条件的连续子数组：

子数组大小 至少为 2 ，且 子数组元素总和为 k 的倍数。 如果存在，返回 true ；否则，返回 false 。

如果存在一个整数 n ，令整数 x 符合 x = n * k ，则称 x 是 k 的一个倍数。

 

示例 1：
<br>输入：nums = [23,2,4,6,7], k = 6
<br>输出：true
<br>解释：[2,4] 是一个大小为 2 的子数组，并且和为 6 。

示例 2：
<br>输入：nums = [23,2,6,4,7], k = 6
<br>输出：true
<br>解释：[23, 2, 6, 4, 7] 是大小为 5 的子数组，并且和为 42 。
<br>42 是 6 的倍数，因为 42 = 7 * 6 且 7 是一个整数。

示例 3：
<br>输入：nums = [23,2,6,4,7], k = 13
<br>输出：false

提示：
<br>1 <= nums.length <= 105
<br>0 <= nums[i] <= 109
<br>0 <= sum(nums[i]) <= 231 - 1
<br>1 <= k <= 231 - 1

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/continuous-subarray-sum/solution/lian-xu-de-zi-shu-zu-he-by-leetcode-solu-rdzi/)

## 代码

[CheckSubarraySum.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/array/CheckSubarraySum.java)

