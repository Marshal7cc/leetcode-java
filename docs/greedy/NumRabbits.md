## 题目描述

森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在 answers 数组里。

返回森林中兔子的最少数量。

示例:
<br>输入: answers = [1, 1, 2]
<br>输出: 5
<br>解释:
<br>两只回答了 "1" 的兔子可能有相同的颜色，设为红色。
<br>之后回答了 "2" 的兔子不会是红色，否则他们的回答会相互矛盾。
<br>设回答了 "2" 的兔子为蓝色。
<br>此外，森林中还应有另外 2 只蓝色兔子的回答没有包含在数组中。
<br>因此森林中兔子的最少数量是 5: 3 只回答的和 2 只没有回答的。

<br>输入: answers = [10, 10, 10]
<br>输出: 11

<br>输入: answers = []
<br>输出: 0

说明:
<br>answers 的长度最大为1000。
<br>answers[i] 是在 [0, 999] 范围内的整数。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/rabbits-in-forest/solution/sen-lin-zhong-de-tu-zi-by-leetcode-solut-kvla/)

## 代码

[NumRabbits.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/greedy/NumRabbits.java)

