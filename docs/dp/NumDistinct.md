## 题目描述

给定一个字符串 s 和一个字符串 t ，计算在 s 的子序列中 t 出现的个数。

字符串的一个 子序列 是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE" 的一个子序列，而 "AEC" 不是）

题目数据保证答案符合 32 位带符号整数范围。

 

示例 1：
<br>输入：s = "rabbbit", t = "rabbit"
<br>输出：3
<br>解释：
<br>如下图所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。
<br>(上箭头符号 ^ 表示选取的字母)
<br>rabbbit
<br>^^^^ ^^
<br>rabbbit
<br>^^ ^^^^
<br>rabbbit
<br>^^^ ^^^

示例 2：
<br>输入：s = "babgbag", t = "bag"
<br>输出：5
<br>解释：
<br>如下图所示, 有 5 种可以从 s 中得到 "bag" 的方案。
<br>(上箭头符号 ^ 表示选取的字母)
<br>babgbag
<br>^^ ^
<br>babgbag
<br>^^ ^
<br>babgbag
<br>^ ^^
<br>babgbag
<br>^ ^^
<br>babgbag
<br>^^^

提示：

<br>0 <= s.length, t.length <= 1000
<br>s 和 t 由英文字母组成

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/distinct-subsequences/solution/dong-tai-gui-hua-by-powcai-5/)

## 代码

[NumDistinct.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/dp/NumDistinct.java)

