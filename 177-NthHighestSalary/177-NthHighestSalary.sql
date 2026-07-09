-- Last updated: 7/9/2026, 3:12:19 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET n=n-1;

  RETURN (
      SELECT DISTINCT salary
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 OFFSET n

  );
END