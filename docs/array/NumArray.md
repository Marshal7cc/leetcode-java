## 题目描述

给定一个整数数组 nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。

实现 NumArray 类：

<br>NumArray(int[] nums) 使用数组 nums 初始化对象
<br>
<br>int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])
）

示例：
<br>输入：
<br>["NumArray", "sumRange", "sumRange", "sumRange"]
<br>[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
<br>输出：
<br>[null, 1, -1, -3]

解释：
<br>NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
<br>numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
<br>numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
<br>numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))

提示：
<br>0 <= nums.length <= 104
<br>-105 <= nums[i] <= 105
<br>0 <= i <= j < nums.length
<br>最多调用 104 次 sumRange 方法

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/range-sum-query-immutable/solution/qu-yu-he-jian-suo-shu-zu-bu-ke-bian-by-l-px41/)

## 代码

[NumArray.java](https://github.com/Marshal7cc/LeetCode-Java/blob/master/src/array/NumArray.java)

