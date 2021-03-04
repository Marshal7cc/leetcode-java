## 题目描述

给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。

如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。

示例 1：
<br>输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
<br>输出：true
<br>解释：
<br>在上述矩阵中, 其对角线为:
<br>"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
<br>各条对角线上的所有元素均相同, 因此答案是 True 。

示例 2：
<br>输入：matrix = [[1,2],[2,2]]
<br>输出：false
<br>解释：
<br>对角线 "[1, 2]" 上的元素不同。

提示：
<br>m == matrix.length
<br>n == matrix[i].length
<br>1 <= m, n <= 20
<br>0 <= matrix[i][j] <= 99

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/toeplitz-matrix/solution/tuo-pu-li-ci-ju-zhen-by-leetcode-solutio-57bb/)

## 代码

[IsToeplitzMatrix.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/array/IsToeplitzMatrix.java)

