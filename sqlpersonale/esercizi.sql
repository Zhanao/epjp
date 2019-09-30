-- Esercizi
select first_name, last_name,email,phone_number,hire_date
from employees
order by 2,1;

select first_name
from employees
where first_name='David' or first_name='Peter';

select *
from employees
where department_id in (60);

select *
from employees
where department_id in (30,50);

select first_name,last_name,salary
from employees
where salary>=10000;

select first_name,last_name,salary
from employees
where salary<4000 or salary>15000;

select first_name,last_name,salary,department_id
from employees
where (salary<4000 or salary>15000)and department_id in (50,80);

select first_name,last_name,hire_date
from employees
where hire_date like '%05';

select DISTINCT job_id
FROM employees
order by job_id;

select first_name||' '||last_name , commission_pct
from employees
where commission_pct is not null;

select first_name||' '||last_name , employee_id
from employees
--where first_name like ('%a%') or first_name like ('A%') or last_name like ('%a%') or last_name like ('A%')
where regexp_like(last_name,'[Aa].*')
order by (1);

select department_name
from departments
order by 1;

select *
from locations
where country_id='IT';

select job_id
from jobs
where job_title like '%Clerk%';

select street_address, postal_code
from locations
where postal_code not like ('0%') or postal_code is null
order by 1;



