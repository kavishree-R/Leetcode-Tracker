-- Last updated: 7/9/2026, 3:12:14 PM
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.ManagerId=m.Id
WHERE e.Salary>m.Salary;