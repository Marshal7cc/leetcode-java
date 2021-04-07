## 题目描述

已知存在一个按非降序排列的整数数组 nums ，数组中的值不必互不相同。

在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转 ，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1],
..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,4,4,5,6,6,7] 在下标 5 处经旋转后可能变为 [4,5,6,6,7,0,1,2,4,4] 。

给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。

 

示例 1：
<br>输入：nums = [2,5,6,0,0,1,2], target = 0
<br>输出：true

示例 2：
<br>输入：nums = [2,5,6,0,0,1,2], target = 3
<br>输出：false

提示：

<br>1 <= nums.length <= 5000
<br>-104 <= nums[i] <= 104
<br>题目数据保证 nums 在预先未知的某个下标上进行了旋转
<br>-104 <= target <= 104

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/solution/sou-suo-xuan-zhuan-pai-xu-shu-zu-ii-by-l-0nmp/)

## 代码

[Search2.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/binarysearch/Search2.java)

