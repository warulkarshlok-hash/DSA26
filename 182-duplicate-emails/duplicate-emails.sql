# Write your MySQL query statement below

-- SELECT email
-- FROM Person
-- GROUP BY email
-- HAVING COUNT(*)>1;

select email from person 
group by email
having count(email) > 1