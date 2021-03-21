## 题目描述

给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。

进阶：

一个直观的解决方案是使用 O(mn) 的额外空间，但这并不是一个好的解决方案。 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。 你能想出一个仅使用常量空间的解决方案吗？

示例 1：
<br>输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
<br>输出：[[1,0,1],[0,0,0],[1,0,1]]

示例 2：
<br>输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
<br>输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

提示：
<br>m == matrix.length
<br>n == matrix[0].length
<br>1 <= m, n <= 200
<br>-231 <= matrix[i][j] <= 231 - 1

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/set-matrix-zeroes/solution/ju-zhen-zhi-ling-by-leetcode-solution-9ll7/)

## 代码

[SetZeroes.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/array/SetZeroes.java)

