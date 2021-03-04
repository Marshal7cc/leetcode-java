## 题目描述

给你一个二维整数数组 envelopes ，其中 envelopes[i] = [wi, hi] ，表示第 i 个信封的宽度和高度。

当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。

请计算 最多能有多少个 信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。

注意：不允许旋转信封。

示例 1：
<br>输入：envelopes = [[5,4],[6,4],[6,7],[2,3]]
<br>输出：3
<br>解释：最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。

示例 2：
<br>输入：envelopes = [[1,1],[1,1],[1,1]]
<br>输出：1

提示：
<br>1 <= envelopes.length <= 5000
<br>envelopes[i].length == 2
<br>1 <= wi, hi <= 104

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/russian-doll-envelopes/solution/e-luo-si-tao-wa-xin-feng-wen-ti-by-leetc-wj68/)

## 代码

[MaxEnvelopes.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/dp/MaxEnvelopes.java)

