## 题目描述

给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。

 

示例 1：
<br>输入：num = 14
<br>输出：6
<br>解释：
<br>步骤 1) 14 是偶数，除以 2 得到 7 。
<br>步骤 2） 7 是奇数，减 1 得到 6 。
<br>步骤 3） 6 是偶数，除以 2 得到 3 。
<br>步骤 4） 3 是奇数，减 1 得到 2 。
<br>步骤 5） 2 是偶数，除以 2 得到 1 。
<br>步骤 6） 1 是奇数，减 1 得到 0 。

示例 2：
<br>输入：num = 8
<br>输出：4
<br>解释：
<br>步骤 1） 8 是偶数，除以 2 得到 4 。
<br>步骤 2） 4 是偶数，除以 2 得到 2 。
<br>步骤 3） 2 是偶数，除以 2 得到 1 。
<br>步骤 4） 1 是奇数，减 1 得到 0 。

示例 3：
<br>输入：num = 123
<br>输出：12

提示：
<br>0 <= num <= 10^6

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/solution/dai-ma-jian-bian-shuang-100-by-zjw1221/)

## 代码

[NumberOfSteps.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/iterative/NumberOfSteps.java)

