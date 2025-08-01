# Write your MySQL query statement below
select man.employee_id,man.name,count(emp.employee_id)as reports_count,round(avg(emp.age)) as average_age
from employees emp join employees man
on emp.reports_to=man.employee_id
group by employee_id
order by employee_id;