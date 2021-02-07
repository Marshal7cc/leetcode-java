## 题目描述
给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。

我们是这样定义一个非递减数列的： 对于数组中所有的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。

 

示例 1:
<br>输入: nums = [4,2,3]
<br>输出: true
<br>解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。

示例 2:
<br>输入: nums = [4,2,1]
<br>输出: false
<br>解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
<br>
<br>说明：
<br>1 <= n <= 10 ^ 4
<br>- 10 ^ 5 <= nums[i] <= 10 ^ 5

## 解法
[==>entrance](https://leetcode-cn.com/problems/non-decreasing-array/solution/fei-di-jian-shu-lie-by-leetcode-solution-zdsm/)
## 代码
[CheckPossibility.java](https://github.com/Marshal1996/LeetCode-Java/blob/master/src/array/CheckPossibility.java)

