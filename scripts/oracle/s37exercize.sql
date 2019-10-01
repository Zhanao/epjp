select first_name, last_name, department_name
from employees left outer join departments
using(department_id);

select first_name, last_name, job_title
from employees left outer join jobs
using(job_id);

select first_name, last_name, job_title
from employees e left outer join jobs j
using(job_id)
where e.salary like j.min_salary or e.salary like j.max_salary;

select e.first_name, d.department_name, l.country_id
from employees e join departments d on d.department_id = e.department_id
join locations l on l.location_id = d.location_id
where l.country_id like 'UK';

select department_name, first_name, last_name
from departments d join employees e
on e.employee_id = d.manager_id;

select department_name, first_name, last_name
from departments d left outer join employees e
on e.employee_id = d.manager_id;

select department_name, first_name, last_name
from departments d left outer join employees e
on e.employee_id = d.manager_id
where d.manager_id is null;

select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id);

select distinct manager_id 
from employees 
where manager_id is not null;

select last_name, employee_id
from employees
where employee_id not in (
    select distinct manager_id 
    from employees 
    where manager_id is not null);
    
--al posto del count(*) si può mettere select count(rowid) con il * è da pigri
select count(*)
from employees
where employee_id not in (
    select distinct manager_id 
    from employees 
    where manager_id is not null);

