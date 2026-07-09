-- Last updated: 7/9/2026, 3:12:22 PM
# Write your MySQL query statement below
SELECT p.firstName,
       p.lastName,
       a.city,
       a.state
       FROM person p
       LEFT JOIN Address a
       ON p.personId=a.personId
