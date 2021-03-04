## 题目描述

外国友人仿照中国字谜设计了一个英文版猜字谜小游戏，请你来猜猜看吧。

字谜的迷面 puzzle 按字符串形式给出，如果一个单词 word 符合下面两个条件，那么它就可以算作谜底：

单词 word 中包含谜面 puzzle 的第一个字母。 单词 word 中的每一个字母都可以在谜面 puzzle 中找到。 例如，如果字谜的谜面是 "abcdefg"，那么可以作为谜底的单词有 "faced", "cabbage",
和 "baggage"；而 "beefed"（不含字母 "a"）以及 "based"（其中的 "s" 没有出现在谜面中）都不能作为谜底。 返回一个答案数组 answer，数组中的每个元素 answer[i] 是在给出的单词列表 words
中可以作为字谜迷面 puzzles[i] 所对应的谜底的单词数目。

 

示例：
<br>输入：
<br>words = ["aaaa","asas","able","ability","actt","actor","access"],
<br>puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
<br>输出：[1,1,3,2,4,0]
<br>解释：
<br>1 个单词可以作为 "aboveyz" 的谜底 : "aaaa"
<br>1 个单词可以作为 "abrodyz" 的谜底 : "aaaa"
<br>3 个单词可以作为 "abslute" 的谜底 : "aaaa", "asas", "able"
<br>2 个单词可以作为 "absoryz" 的谜底 : "aaaa", "asas"
<br>4 个单词可以作为 "actresz" 的谜底 : "aaaa", "asas", "actt", "access"
<br>没有单词可以作为 "gaswxyz" 的谜底，因为列表中的单词都不含字母 'g'。

提示：
<br>1 <= words.length <= 10^5
<br>4 <= words[i].length <= 50
<br>1 <= puzzles.length <= 10^4
<br>puzzles[i].length == 7
<br>words[i][j], puzzles[i][j] 都是小写英文字母。
<br>每个 puzzles[i] 所包含的字符都不重复。

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/number-of-valid-words-for-each-puzzle/solution/zhi-dao-liao-ru-he-mei-ju-yi-ge-er-jin-z-2rph/)

## 代码

[FindNumOfValidWords.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/hashtable/FindNumOfValidWords.java)


