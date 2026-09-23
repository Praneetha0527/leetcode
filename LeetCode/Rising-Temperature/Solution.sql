1# Write your MySQL query statement below
2select w1.id FROM Weather w1 CROSS JOIN Weather w2 
3WHERE DATEDIFF(w1.recorddate,w2.recordDate)=1
4AND w1.temperature>w2.temperature;