## 题目描述

给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

给你一个 m x n 的矩阵 matrix 和一个整数 k ，找出并返回矩阵内部矩形区域的不超过 k 的最大数值和。

题目数据保证总会存在一个数值和不超过 k 的矩形区域。

 

示例 1：
<br>输入：matrix = [[1,0,1],[0,-2,3]], k = 2
<br>输出：2
<br>解释：蓝色边框圈出来的矩形区域 [[0, 1], [-2, 3]] 的数值和是 2，且 2 是不超过 k 的最大数字（k = 2）。

示例 2：
<br>输入：matrix = [[2,2,-1]], k = 3
<br>输出：3

提示：
<br>m == matrix.length
<br>n == matrix[i].length
<br>1 <= m, n <= 100
<br>-100 <= matrix[i][j] <= 100
<br>-105 <= k <= 105

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/solution/gong-shui-san-xie-you-hua-mei-ju-de-ji-b-dh8s/)

## 代码

[MaxSumSubmatrix.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/matrix/MaxSumSubmatrix.java)


