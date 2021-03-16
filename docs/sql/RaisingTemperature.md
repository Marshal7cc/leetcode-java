## 题目描述

表 Weather

| Column Name | Type |
|----|----|
| id        | int |
| recordDate | date |
| temperature | int |

<br>id 是这个表的主键
<br>该表包含特定日期的温度信息

编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 id 。

返回结果 不要求顺序 。

查询结果格式如下例：

Weather

| id | recordDate | Temperature |
|----|----|----|
| 1 | 2015-01-01 | 10 |
| 2 | 2015-01-02 | 25 |
| 3 | 2015-01-03 | 20 |
| 4 | 2015-01-04 | 30 |

Result table:

| id |
|----|
| 2 |
| 4 |

<br>2015-01-02 的温度比前一天高（10 -> 25）
<br>2015-01-04 的温度比前一天高（20 -> 30）

## 解法

[==>SOLUTION<==](https://leetcode-cn.com/problems/rising-temperature/solution/shang-sheng-de-wen-du-by-leetcode/)

## 代码

SELECT weather.id AS 'Id'
<br>FROM weather
<br>JOIN weather w ON DATEDIFF(weather.recordDate, w.recordDate) = 1 AND weather.Temperature > w.Temperature ;
