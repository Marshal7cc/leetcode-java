## 题目描述

给你一个由 无重复 正整数组成的集合 nums ，请你找出并返回其中最大的整除子集 answer ，子集中每一元素对 (answer[i], answer[j]) 都应当满足： answer[i] % answer[j] == 0 ，或
answer[j] % answer[i] == 0 如果存在多个有效解子集，返回其中任何一个均可。

 

示例 1：
<br>输入：nums = [1,2,3]
<br>输出：[1,2]
<br>解释：[1,3] 也会被视为正确答案。

示例 2：
<br>输入：nums = [1,2,4,8]
<br>输出：[1,2,4,8]

提示：
<br>1 <= nums.length <= 1000
<br>1 <= nums[i] <= 2 * 109
<br>nums 中的所有整数 互不相同

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/largest-divisible-subset/solution/zui-da-zheng-chu-zi-ji-by-leetcode-solut-t4pz/)

## 代码

[LargestDivisibleSubset.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/dp/LargestDivisibleSubset.java)

