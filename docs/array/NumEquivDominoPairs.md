## 题目描述

给你一个由一些多米诺骨牌组成的列表 dominoes。

如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。

形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。

在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。

 

示例：
<br>输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
<br>输出：1

提示：
<br>1 <= dominoes.length <= 40000
<br>1 <= dominoes[i][j] <= 9

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/solution/deng-jie-duo-mi-nuo-gu-pai-dui-de-shu-li-yjlz/)

## 代码

[NumEquivDominoPairs.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/array/NumEquivDominoPairs.java)

