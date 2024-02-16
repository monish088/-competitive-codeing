-- SELECT e.name
-- FROM Employee e
-- JOIN (
--     SELECT managerId
--     FROM Employee
--     WHERE managerId IS NOT NULL
--     GROUP BY managerId
--     HAVING COUNT(id) >= 5
-- ) AS managers ON e.id = managers.managerId;
# Write your MySQL query statement below
select e1.name
from Employee e1
join Employee e2 
on e1.id=e2.managerId
group by e1.id,e1.name
having count(e2.id)>=5