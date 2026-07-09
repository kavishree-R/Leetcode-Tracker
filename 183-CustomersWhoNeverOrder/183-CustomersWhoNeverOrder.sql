-- Last updated: 7/9/2026, 3:12:12 PM
SELECT c.Name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.Id=o.CustomerId
WHERE o.Id IS null;