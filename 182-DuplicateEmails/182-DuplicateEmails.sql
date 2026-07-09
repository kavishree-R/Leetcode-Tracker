-- Last updated: 7/9/2026, 3:12:10 PM
SELECT Email
FROM Person
GROUP BY Email
HAVING Count(*)>1;
