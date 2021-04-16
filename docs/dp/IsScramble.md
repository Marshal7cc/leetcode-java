## 题目描述

使用下面描述的算法可以扰乱字符串 s 得到字符串 t ：
<br>如果字符串的长度为 1 ，算法停止
<br>如果字符串的长度 > 1 ，执行下述步骤：
<br>在一个随机下标处将字符串分割成两个非空的子字符串。即，如果已知字符串 s ，则可以将其分成两个子字符串 x 和 y ，且满足 s = x + y 。
<br>随机 决定是要「交换两个子字符串」还是要「保持这两个子字符串的顺序不变」。即，在执行这一步骤之后，s 可能是 s = x + y 或者 s = y + x 。
<br>在 x 和 y 这两个子字符串上继续从步骤 1 开始递归执行此算法。
<br>给你两个 长度相等 的字符串 s1 和 s2，判断 s2 是否是 s1 的扰乱字符串。如果是，返回 true ；否则，返回 false 。

 

示例 1：
<br>输入：s1 = "great", s2 = "rgeat"
<br>输出：true
<br>解释：s1 上可能发生的一种情形是：
<br>"great" --> "gr/eat" // 在一个随机下标处分割得到两个子字符串
<br>"gr/eat" --> "gr/eat" // 随机决定：「保持这两个子字符串的顺序不变」
<br>"gr/eat" --> "g/r / e/at" // 在子字符串上递归执行此算法。两个子字符串分别在随机下标处进行一轮分割
<br>"g/r / e/at" --> "r/g / e/at" // 随机决定：第一组「交换两个子字符串」，第二组「保持这两个子字符串的顺序不变」
<br>"r/g / e/at" --> "r/g / e/ a/t" // 继续递归执行此算法，将 "at" 分割得到 "a/t"
<br>"r/g / e/ a/t" --> "r/g / e/ a/t" // 随机决定：「保持这两个子字符串的顺序不变」
<br>算法终止，结果字符串和 s2 相同，都是 "rgeat"
<br>这是一种能够扰乱 s1 得到 s2 的情形，可以认为 s2 是 s1 的扰乱字符串，返回 true 示例 2：

<br>输入：s1 = "abcde", s2 = "caebd"
<br>输出：false 示例 3：

<br>输入：s1 = "a", s2 = "a"
<br>输出：true

提示：
<br>s1.length == s2.length
<br>1 <= s1.length <= 30
<br>s1 和 s2 由小写英文字母组成

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/scramble-string/solution/gong-shui-san-xie-yi-ti-san-jie-di-gui-j-hybk/)

## 代码

[IsScramble.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/dp/IsScramble.java)

