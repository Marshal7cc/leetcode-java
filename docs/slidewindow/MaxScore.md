## 题目描述
几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。

每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。

你的点数就是你拿到手中的所有卡牌的点数之和。

给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。

 

示例 1：
<br>输入：cardPoints = [1,2,3,4,5,6,1], k = 3
<br>输出：12
<br>解释：第一次行动，不管拿哪张牌，你的点数总是 1 。但是，先拿最右边的卡牌将会最大化你的可获得点数。最优策略是拿右边的三张牌，最终点数为 1 + 6 + 5 = 12 。

<br>示例 2：
<br>输入：cardPoints = [2,2,2], k = 2
<br>输出：4
<br>解释：无论你拿起哪两张卡牌，可获得的点数总是 4 。

<br>示例 3：
<br>输入：cardPoints = [9,7,7,9,7,7,9], k = 7
<br>输出：55
<br>解释：你必须拿起所有卡牌，可以获得的点数为所有卡牌的点数之和。

<br>示例 4：
<br>输入：cardPoints = [1,1000,1], k = 1
<br>输出：1
<br>解释：你无法拿到中间那张卡牌，所以可以获得的最大点数为 1 。 

<br>示例 5：
<br>输入：cardPoints = [1,79,80,1,1,1,200,1], k = 3
<br>输出：202
 

提示：
<br>1 <= cardPoints.length <= 10^5
<br>1 <= cardPoints[i] <= 10^4
<br>1 <= k <= cardPoints.length

## 解法
[==>SOLUTION<==](https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards/solution/ke-huo-de-de-zui-da-dian-shu-by-leetcode-7je9/)
## 代码
[MaxScore.java](https://github.com/Marshal7cc/LeetCode-Java/blob/master/src/slidewindow/MaxScore.java)

