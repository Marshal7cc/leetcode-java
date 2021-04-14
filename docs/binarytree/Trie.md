## 题目描述

Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。

请你实现 Trie 类：

<br>Trie() 初始化前缀树对象。
<br>void insert(String word) 向前缀树中插入字符串 word 。
<br>boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
<br>boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。

示例：
<br>输入
<br>["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
<br>[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
<br>输出
<br>[null, null, true, false, true, null, true]

解释
<br>Trie trie = new Trie();
<br>trie.insert("apple");
<br>trie.search("apple"); // 返回 True
<br>trie.search("app"); // 返回 False
<br>trie.startsWith("app"); // 返回 True
<br>trie.insert("app");
<br>trie.search("app"); // 返回 True

提示：
<br>1 <= word.length, prefix.length <= 2000
<br>word 和 prefix 仅由小写英文字母组成
<br>insert、search 和 startsWith 调用次数 总计 不超过 3 * 104 次

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/implement-trie-prefix-tree/solution/shi-xian-trie-qian-zhui-shu-by-leetcode-ti500/)

## 代码

[Trie.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/binarytree/Trie.java)

