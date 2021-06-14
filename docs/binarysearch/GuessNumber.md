## 题目描述

猜数字游戏的规则如下：

<br>每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
<br>如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
<br>你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：

<br>-1：我选出的数字比你猜的数字小 pick < num
<br>1：我选出的数字比你猜的数字大 pick > num
<br>0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
<br>返回我选出的数字。

 

示例 1：
<br>输入：n = 10, pick = 6
<br>输出：6

示例 2：
<br>输入：n = 1, pick = 1
<br>输出：1

示例 3：
<br>输入：n = 2, pick = 1
<br>输出：1

示例 4：
<br>输入：n = 2, pick = 2
<br>输出：2

提示：
<br>1 <= n <= 231 - 1
<br>1 <= pick <= n

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/guess-number-higher-or-lower/solution/cai-shu-zi-da-xiao-by-leetcode-solution-qdzu/)

## 代码

[GuessNumber.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/binarysearch/GuessNumber.java)

