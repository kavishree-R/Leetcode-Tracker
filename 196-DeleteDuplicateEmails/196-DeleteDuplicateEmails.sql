-- Last updated: 7/9/2026, 3:11:45 PM
DELETE FROM Person
WHERE id NOT IN(
    SELECT id FROM(
        SELECT MIN(id) AS id 
        FROM Person 
        GROUP BY email
    )AS temp
);