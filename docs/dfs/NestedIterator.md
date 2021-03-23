## 题目描述

给你一个嵌套的整型列表。请你设计一个迭代器，使其能够遍历这个整型列表中的所有整数。

列表中的每一项或者为一个整数，或者是另一个列表。其中列表的元素也可能是整数或是其他列表。

 

示例 1:
<br>输入: [[1,1],2,[1,1]]
<br>输出: [1,1,2,1,1]
<br>解释: 通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,1,2,1,1]。

示例 2:
<br>输入: [1,[4,[6]]]
<br>输出: [1,4,6]
<br>解释: 通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,4,6]。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/flatten-nested-list-iterator/solution/bian-ping-hua-qian-tao-lie-biao-die-dai-ipjzq/)

## 代码

[NestedIterator.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/dfs/NestedIterator.java)

