select *
from employees
where hire_date between '01-GEN-05' and '31-DIC-05';

select job_id
from employees;

select job_id
from employees
where job_id like '%CLERK%';

SELECT *
FROM employees
where commission_pct is not null;

SELECT *
FROM employees
where first_name like '%a%' or last_name like '%a%' or last_name like '%A%'or last_name like '%A%';

select *
from departments
order by department_name;

select *
from locations
where country_id like 'IT';

select *
from locations
where postal_code not like '0%' or postal_code is null; --ricordare che con il null bisogna mettere 'is' e 'is not'