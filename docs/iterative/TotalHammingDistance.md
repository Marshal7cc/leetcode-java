## 题目描述

两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。

计算一个数组中，任意两个数之间汉明距离的总和。

示例:
<br>输入: 4, 14, 2
<br>输出: 6

<br>解释: 在二进制表示中，4表示为0100，14表示为1110，2表示为0010。（这样表示是为了体现后四位之间关系）
<br>所以答案为：
<br>HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.

注意:
<br>数组中元素的范围为从 0到 10^9。
<br>数组的长度不超过 10^4。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/total-hamming-distance/solution/yi-ming-ju-chi-zong-he-by-leetcode-solut-t0ev/)

## 代码

[HammingWeight.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/iterative/TotalHammingDistance.java)

