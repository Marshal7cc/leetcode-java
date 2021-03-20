## 题目描述

你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警
。

给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。

 

示例 1：
<br>输入：nums = [2,3,2]
<br>输出：3
<br>解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。

示例 2：
<br>输入：nums = [1,2,3,1]
<br>输出：4
<br>解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
<br>偷窃到的最高金额 = 1 + 3 = 4 。

示例 3：
<br>输入：nums = [0]
<br>输出：0

提示：
<br>1 <= nums.length <= 100
<br>0 <= nums[i] <= 1000

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/house-robber-ii/solution/213-da-jia-jie-she-iidong-tai-gui-hua-jie-gou-hua-/)

## 代码

[RobTwo.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/dp/RobTwo.java)

