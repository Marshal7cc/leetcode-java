## 题目描述

给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。

返回仅包含 1 的最长（连续）子数组的长度。

 

示例 1：
<br>输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
<br>输出：6
<br>解释：
<br>[1,1,1,0,0,1,1,1,1,1,1]
<br>粗体数字从 0 翻转到 1，最长的子数组长度为 6。

示例 2：
<br>输入：A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
<br>输出：10
<br>解释：
<br>[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
<br>粗体数字从 0 翻转到 1，最长的子数组长度为 10。

提示：
<br>1 <= A.length <= 20000
<br>0 <= K <= A.length
<br>A[i] 为 0 或 1

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/max-consecutive-ones-iii/solution/zui-da-lian-xu-1de-ge-shu-iii-by-leetcod-hw12/)

## 代码

[LongestOnes.java](https://github.com/Marshal7cc/LeetCode-Java/blob/master/src/slidewindow/LongestOnes.java)

