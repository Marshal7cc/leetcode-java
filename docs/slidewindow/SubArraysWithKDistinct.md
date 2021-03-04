## 题目描述
给定一个正整数数组 A，如果 A 的某个子数组中不同整数的个数恰好为 K，则称 A 的这个连续、不一定不同的子数组为好子数组。

（例如，[1,2,3,1,2] 中有 3 个不同的整数：1，2，以及 3。）

返回 A 中好子数组的数目。

 

示例 1：
<br>输入：A = [1,2,1,2,3], K = 2
<br>输出：7
<br>解释：恰好由 2 个不同整数组成的子数组：[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].

示例 2：
<br>输入：A = [1,2,1,3,4], K = 3
<br>输出：3
<br>解释：恰好由 3 个不同整数组成的子数组：[1,2,1,3], [2,1,3], [1,3,4].
 

提示：
<br>1 <= A.length <= 20000
<br>1 <= A[i] <= A.length
<br>1 <= K <= A.length


## 解法
[==>SOLUTION<==](https://leetcode-cn.com/problems/subarrays-with-k-different-integers/solution/k-ge-bu-tong-zheng-shu-de-zi-shu-zu-by-l-ud34/)
## 代码
[SubArraysWithKDistinct.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/slidewindow/SubArraysWithKDistinct.java)

