# Write your MySQL query statement below
SELECT 
    t1.id AS Id
FROM 
    Weather t1
JOIN 
    Weather t2 ON DATEDIFF(t1.recordDate, t2.recordDate) = 1
WHERE 
    t1.temperature > t2.temperature