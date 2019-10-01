select department_id, trunc(avg(salary))
from employees
group by department_id
order by 1;


select department_id, trunc(avg(salary))
from employees
group by department_id
order by 2 desc;