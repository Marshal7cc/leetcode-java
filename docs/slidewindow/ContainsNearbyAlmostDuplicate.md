## 题目描述

给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。

如果存在则返回 true，不存在返回 false。

 

示例 1：
<br>输入：nums = [1,2,3,1], k = 3, t = 0
<br>输出：true

示例 2：
<br>输入：nums = [1,0,1,1], k = 1, t = 2
<br>输出：true

示例 3：
<br>输入：nums = [1,5,9,1,5,9], k = 2, t = 3
<br>输出：false

提示：
<br>0 <= nums.length <= 2 * 104
<br>-231 <= nums[i] <= 231 - 1
<br>0 <= k <= 104
<br>0 <= t <= 231 - 1

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/contains-duplicate-iii/solution/cun-zai-zhong-fu-yuan-su-iii-by-leetcode-bbkt/)

## 代码

[ContainsNearbyAlmostDuplicate.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/slidewindow/ContainsNearbyAlmostDuplicate.java)

