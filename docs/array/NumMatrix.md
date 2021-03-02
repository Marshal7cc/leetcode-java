## 题目描述

给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2) 。

上图子矩阵左上角 (row1, col1) = (2, 1) ，右下角(row2, col2) = (4, 3)，该子矩形内元素的总和为 8。

 

示例：
<br>给定 matrix = [
<br>[3, 0, 1, 4, 2],
<br>[5, 6, 3, 2, 1],
<br>[1, 2, 0, 1, 5],
<br>[4, 1, 0, 1, 7],
<br>[1, 0, 3, 0, 5]
<br>]

<br>sumRegion(2, 1, 4, 3) -> 8
<br>sumRegion(1, 1, 2, 2) -> 11
<br>sumRegion(1, 2, 2, 4) -> 12

提示：
<br>你可以假设矩阵不可变。
<br>会多次调用 sumRegion 方法。
<br>你可以假设 row1 ≤ row2 且 col1 ≤ col2 。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/range-sum-query-2d-immutable/solution/er-wei-qu-yu-he-jian-suo-ju-zhen-bu-ke-b-2z5n/)

## 代码

[NumMatrix.java](https://github.com/Marshal7cc/LeetCode-Java/blob/master/src/array/NumMatrix.java)

