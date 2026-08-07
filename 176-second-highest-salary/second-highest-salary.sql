-- O(N)
-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM Employee
-- WHERE salary < (SELECT MAX(salary) FROM Employee);

-- IFNULL(value, NULL) converts the missing value into SQL NULL, producing exactly one row
-- COALEASE CAN ALSO USED JUST REPLACED IFNULL

SELECT IFNULL(
    (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET 1
    ),
    NULL
) AS SecondHighestSalary;

