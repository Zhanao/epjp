select first_name,last_name,department_name
from employees join departments
using(department_id);

select first_name,last_name, job_title
from employees join jobs
using (job_id);

select first_name,last_name,job_title,salary
from employees join jobs
using (job_id)
where (salary=min_salary) or salary=max_salary;

select first_name,last_name,country_id
from employees join departments using (department_id)
join locations using (location_id)
where locations.country_id='UK';

select department_name, first_name||' '||last_name
from employees e join departments d
on(d.manager_id=e.employee_id);

select department_name, first_name||' '||last_name
from employees e right outer join departments d
on(d.manager_id=e.employee_id);

select department_name
from departments
where manager_id is null;

select e.first_name||' '||e.last_name as employee, m.first_name||' '||m.last_name as manager
from employees e join employees m
on (m.manager_id=e.employee_id)
order by 2;

--sbagliata
select e.first_name||' '||e.last_name as nomanager, e.employee_id
from employees e join employees m
on (e.manager_id = m.employee_id)
where m.employee_id not in (e.manager_id) or e.manager_id is not null;

select *
from employees
--where hire_date between '01-GEN-2005' and '31-DIC-2005';
where TRUNC(hire_date,'year') = '01-GEN-05';



