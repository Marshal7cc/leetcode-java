## 题目描述
设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。

请实现 KthLargest 类：

KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
 

示例：

输入：
<br>["KthLargest", "add", "add", "add", "add", "add"]
<br>[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
<br>输出：
<br>[null, 4, 5, 5, 8, 8]

解释：
<br>KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
<br>kthLargest.add(3);   // return 4
<br>kthLargest.add(5);   // return 5
<br>kthLargest.add(10);  // return 5
<br>kthLargest.add(9);   // return 8
<br>kthLargest.add(4);   // return 8
 

提示：
<br>1 <= k <= 104
<br>0 <= nums.length <= 104
<br>-104 <= nums[i] <= 104
<br>-104 <= val <= 104
<br>最多调用 add 方法 104 次
<br>题目数据保证，在查找第 k 大元素时，数组中至少有 k 个元素

## 解法
[==>SOLUTION<==](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/solution/shu-ju-liu-zhong-de-di-k-da-yuan-su-by-l-woz8/)
## 代码
[KthLargest.java](https://github.com/Marshal1996/LeetCode-Java/blob/master/src/priorityqueue/KthLargest.java)

