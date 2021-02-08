## 题目描述
当 A 的子数组 A[i], A[i+1], ..., A[j] 满足下列条件时，我们称其为湍流子数组：

若 i <= k < j，当 k 为奇数时， A[k] > A[k+1]，且当 k 为偶数时，A[k] < A[k+1]；

或 若 i <= k < j，当 k 为偶数时，A[k] > A[k+1] ，且当 k 为奇数时， A[k] < A[k+1]。

也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。

返回 A 的最大湍流子数组的长度。

 

示例 1：
<br>输入：[9,4,2,10,7,8,8,1,9]
<br>输出：5
<br>解释：(A[1] > A[2] < A[3] > A[4] < A[5])

示例 2：
<br>输入：[4,8,12,16]
<br>输出：2

示例 3：
<br>输入：[100]
<br>输出：1
 

提示：
<br>1 <= A.length <= 40000
<br>0 <= A[i] <= 10^9
## 解法
[==>SOLUTION<==](https://leetcode-cn.com/problems/longest-turbulent-subarray/==>SOLUTION<==/zui-chang-tuan-liu-zi-shu-zu-by-leetcode-t4d8/)
## 代码
[MaxTurbulenceSize.java](https://github.com/Marshal1996/LeetCode-Java/blob/master/src/slidewindow/MaxTurbulenceSize.java)

