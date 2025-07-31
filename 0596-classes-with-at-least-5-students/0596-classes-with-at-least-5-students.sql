-- # Write your MySQL query statement below
-- select class from courses  count(student)>=5 group by class;
# Write your MySQL query statement below
select class from courses  group by class  having count(student)>=5 ;