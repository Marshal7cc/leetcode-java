## 题目描述

罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。

<br>字符 数值
<br>I 1
<br>V 5
<br>X 10
<br>L 50
<br>C 100
<br>D 500
<br>M 1000

<br>例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为
IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和
900。 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

 

示例 1:
<br>输入: "III"
<br>输出: 3

示例 2:
<br>输入: "IV"
<br>输出: 4

示例 3:
<br>输入: "IX"
<br>输出: 9

示例 4:
<br>输入: "LVIII"
<br>输出: 58
<br>解释: L = 50, V= 5, III = 3.

示例 5:
<br>输入: "MCMXCIV"
<br>输出: 1994
<br>解释: M = 1000, CM = 900, XC = 90, IV = 4.

提示：
<br>1 <= s.length <= 15
<br>s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
<br>题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
<br>题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
<br>IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
<br>关于罗马数字的详尽书写规则，可以参考 罗马数字 - Mathematics 。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/roman-to-integer/solution/luo-ma-shu-zi-zhuan-zheng-shu-by-leetcod-w55p/)

## 代码

[RomanToInt.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/unclassified/RomanToInt.java)

