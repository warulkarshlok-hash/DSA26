# Write your MySQL query statement below
WITH rankedResults AS (
    SELECT 
    d.name AS Department,
    e.name AS Employee,
    salary as Salary,
    DENSE_RANK() OVER(
        PARTITION BY d.name
        ORDER BY salary DESC
    ) as ranked
    FROM Employee AS e
    JOIN Department AS d
    ON e.departmentId =  d.id

)

SELECT Department,Employee,Salary
FROM rankedResults
WHERE ranked <= 3;