select street_address || ', ' || country_name as Address
from locations join countries 
using(country_id);

select last_name || ' is at ' || city as Employee_at
from employees join departments 
using(department_id)
join locations using(location_id)
where city like 'Toronto';

select last_name, hire_date
from employees 
where hire_date > (
    select hire_date
    from employees
    where first_name like 'David' and last_name like 'Lee');

select e.last_name as Employee, e.hire_date as Employee_Hiring, m.hire_date as Manager_Hiring, m.last_name as Manager
from employees e join employees m
on(e.manager_id = m.employee_id)
where e.hire_date < m.hire_date;

--questa mi da le date di assunzione degli employee
select manager_id, hire_date
from employees
where employee_id not in(    
    select distinct manager_id
    from employees
    where manager_id is not null);

--questa mi da le date di assunzione dei manager  
select employee_id, hire_date
from employees
where employee_id in(    
    select distinct manager_id
    from employees
    where manager_id is not null);
    
select e.last_name as Employee , m.last_name as Manager
from employees e join employees m
on(e.manager_id = m.employee_id)
where e.manager_id like (
    select manager_id
    from employees
    where last_name like 'Ozer');   
    
    select manager_id
    from employees
    where last_name like 'Ozer';
    
select e.last_name as Employee, d.department_name as Department
from employees e join departments d
on (d.department_id = e.department_id)
where e.department_id in (
    select distinct department_id
    from employees
    where last_name like '%u%' or last_name like '%U%'); 
    
select e.last_name as Employee, d.department_name as Department
from employees e join departments d
on (d.department_id = e.department_id)
where d.department_name like 'Shipping';

select e.last_name as Employee, m.last_name as Manager
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.manager_id like (
    select employee_id
    from employees
    where last_name like 'King' and first_name like 'Steven');
