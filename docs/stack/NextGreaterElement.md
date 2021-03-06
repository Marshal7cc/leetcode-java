## 题目描述

给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。

请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。

nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。

 

示例 1:
<br>输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
<br>输出: [-1,3,-1]
<br>解释:
<br>对于 num1 中的数字 4 ，你无法在第二个数组中找到下一个更大的数字，因此输出 -1 。
<br>对于 num1 中的数字 1 ，第二个数组中数字1右边的下一个较大数字是 3 。
<br>对于 num1 中的数字 2 ，第二个数组中没有下一个更大的数字，因此输出 -1 。

示例 2:
<br>输入: nums1 = [2,4], nums2 = [1,2,3,4].
<br>输出: [3,-1]
<br>解释:
<br>对于 num1 中的数字 2 ，第二个数组中的下一个较大数字是 3 。
<br>对于 num1 中的数字 4 ，第二个数组中没有下一个更大的数字，因此输出 -1 。

提示：
<br>1 <= nums1.length <= nums2.length <= 1000
<br>0 <= nums1[i], nums2[i] <= 104
<br>nums1和nums2中所有整数 互不相同
<br>nums1 中的所有整数同样出现在 nums2 中

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/next-greater-element-i/solution/xia-yi-ge-geng-da-yuan-su-i-by-leetcode/)

## 代码

[NextGreaterElement.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/stack/NextGreaterElement.java)

