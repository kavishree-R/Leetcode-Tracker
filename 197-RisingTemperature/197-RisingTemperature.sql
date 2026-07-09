-- Last updated: 7/9/2026, 3:11:43 PM
SELECT today.id
FROM Weather yesterday
CROSS JOIN Weather today
WHERE DATEDIFF(today.recordDate,yesterday.recordDate)=1
AND today.temperature>yesterday.temperature
;