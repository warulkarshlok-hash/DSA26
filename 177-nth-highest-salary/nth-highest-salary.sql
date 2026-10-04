CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      WITH CTE AS (
        SELECT Salary,
        DENSE_RANK() OVER(
        ORDER BY salary DESC
        ) AS `rank`
        FROM Employee
      )

      SELECT DISTINCT Salary AS getNthHighestSalary
      FROM CTE
      WHERE `rank`=N

  );
END