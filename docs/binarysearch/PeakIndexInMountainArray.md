## 题目描述

符合下列属性的数组 arr 称为 山脉数组 ：
<br>arr.length >= 3
<br>存在 i（0 < i < arr.length - 1）使得：
<br>arr[0] < arr[1] < ... arr[i-1] < arr[i]
<br>arr[i] > arr[i+1] > ... > arr[arr.length - 1]
<br>给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。

 

示例 1：
<br>输入：arr = [0,1,0]
<br>输出：1

示例 2：
<br>输入：arr = [0,2,1,0]
<br>输出：1

示例 3：
<br>输入：arr = [0,10,5,2]
<br>输出：1

示例 4：
<br>输入：arr = [3,4,5,1]
<br>输出：2

示例 5：
<br>输入：arr = [24,69,100,99,79,78,67,36,26,19]
<br>输出：2

提示：
<br>3 <= arr.length <= 104
<br>0 <= arr[i] <= 106
<br>题目数据保证 arr 是一个山脉数组

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/solution/shan-mai-shu-zu-de-feng-ding-suo-yin-by-dtqvv/)

## 代码

[PeakIndexInMountainArray.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/binarysearch/PeakIndexInMountainArray.java)

