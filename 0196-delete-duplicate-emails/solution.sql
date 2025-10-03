# Write your MySQL query statement b
DELETE p1
FROM Person p1
right JOIN Person p2
  ON p1.email = p2.email and p1.id > p2.id;
