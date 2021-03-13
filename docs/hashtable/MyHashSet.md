## 题目描述

不使用任何内建的哈希表库设计一个哈希集合（HashSet）。

实现 MyHashSet 类：

void add(key) 向哈希集合中插入值 key 。
<br>bool contains(key) 返回哈希集合中是否存在这个值 key 。
<br>void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。

示例：
<br>输入：
<br>["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
<br>[[], [1], [2], [1], [3], [2], [2], [2], [2]]
<br>输出：
<br>[null, null, null, true, false, null, true, null, false]

解释：
<br>MyHashSet myHashSet = new MyHashSet();
<br>myHashSet.add(1); // set = [1]
<br>myHashSet.add(2); // set = [1, 2]
<br>myHashSet.contains(1); // 返回 True
<br>myHashSet.contains(3); // 返回 False ，（未找到）
<br>myHashSet.add(2); // set = [1, 2]
<br>myHashSet.contains(2); // 返回 True
<br>myHashSet.remove(2); // set = [1]
<br>myHashSet.contains(2); // 返回 False ，（已移除）

提示：
<br>0 <= key <= 106
<br>最多调用 104 次 add、remove 和 contains 。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/design-hashset/solution/she-ji-ha-xi-ji-he-by-leetcode-solution-xp4t/)

## 代码

[MyHashSet.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/hashtable/MyHashSet.java)


