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
on (e.manager_id=m.employee_id)
order by 2;



select e.last_name, e.employee_id
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.employee_id not in (m.manager_id)
--where m.manager_id != e.employee_id and m.manager_id is not null
order by 2;

select first_name||' '||last_name, employee_id
from employees 
where employee_id not in
(select manager_id from employees where manager_id is not null);
-- perche' non vengono uguali?!?

select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id);

select *
from employees
--where hire_date between '01-GEN-2005' and '31-DIC-2005';
where TRUNC(hire_date,'year') = '01-GEN-05';

select employee_id,first_name||' '||last_name as employer, lpad('*',round(salary/1000), '*') salary
from employees
order by 1;

select employee_id,first_name||' '||last_name as employer, nvl2(commission_pct,to_char(commission_pct,'0.99'),'no value')
-- 0.99 è il formato che voglio dare
from employees
order by 1;


