1# Write your MySQL query statement below
2SELECT w1.id
3FROM Weather w1
4CROSS JOIN Weather w2
5WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1
6AND w1.temperature > w2.temperature;