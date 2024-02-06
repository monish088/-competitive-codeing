# Write your MySQL query statement below
SELECT 
    machine_id,
    ROUND(AVG(process_time), 3) AS processing_time
FROM 
    (SELECT 
         machine_id,
         process_id,
         AVG(timestamp) AS end_time,
         (SELECT timestamp FROM Activity AS a2 WHERE a2.machine_id = a1.machine_id AND a2.process_id = a1.process_id AND a2.activity_type = 'start') AS start_time,
         AVG(timestamp) - (SELECT timestamp FROM Activity AS a2 WHERE a2.machine_id = a1.machine_id AND a2.process_id = a1.process_id AND a2.activity_type = 'start') AS process_time
     FROM 
         Activity AS a1
     WHERE 
         activity_type = 'end'
     GROUP BY 
         machine_id, process_id) AS process_times
GROUP BY 
    machine_id;
