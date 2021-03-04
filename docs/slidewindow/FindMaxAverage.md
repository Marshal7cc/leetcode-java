## 题目描述
给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。

 

示例 1：
<br>输入：[1,12,-5,-6,50,3], k = 4
<br>输出：12.75
<br>解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75

提示：
<br>1 <= k <= n <= 30,000。
<br>所给数据范围 [-10,000，10,000]。
## 解法
### 1 滑动窗口
注意点：不必每个子数组遍历求和，只需求遍历第一个子数组求和，后续子数组在窗口滑动时减去左元素再加上右元素即为和。
## 代码
[FindMaxAverage.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/slidewindow/FindMaxAverage.java)

