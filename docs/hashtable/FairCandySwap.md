## 题目描述
爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
<br>因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
<br>返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
<br>如果有多个答案，你可以返回其中任何一个。保证答案存在。
<br><br>示例 1：
<br>输入：A = [1,1], B = [2,2]
<br>输出：[1,2]
<br><br>示例 2：
<br>输入：A = [1,2], B = [2,3]
<br>输出：[1,2]
<br><br>示例 3：
<br>输入：A = [2], B = [1,3]
<br>输出：[2,3]
<br><br>示例 4：
<br>输入：A = [1,2,5], B = [2,4]
<br>输出：[5,4]
<br><br>提示：
<br>1 <= A.length <= 10000
<br>1 <= B.length <= 10000
<br>1 <= A[i] <= 100000
<br>1 <= B[i] <= 100000
<br>保证爱丽丝与鲍勃的糖果总量不同。
<br>答案肯定存在。
## 解法
总体思路：当sumA−x+y=sumB+x−y时，得到结果
### 1 暴力破解
两次遍历获取结果<br>
时间复杂度：O(i*j)<br>
空间复杂度：0
### 2 哈希表
记爱丽丝的糖果棒的总大小为sumA，鲍勃的糖果棒的总大小为sumB。<br>
则有如下等式：sumA−A[i]+B[j]=sumB+A[i]-B[j]<br>
化简为：A[i]=B[j]+(sumA-sumB)/2<br>
将B存入HashSet,遍历A数组，判断HashSet中是否有元素b使得当前A数组元素a满足a=b+(sumA-sumB)/2即可。
<br>时间复杂度：O(i+j)
<br>空间复杂度：O(i)或O(j)
## 代码
[FairCandySwap.java](https://github.com/Marshal7cc/leetcode-java/blob/master/src/hashtable/FairCandySwap.java)

