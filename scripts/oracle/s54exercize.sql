select street_address || ', ' || country_name as Address
from locations join countries 
using(country_id);

select last_name || ' is at ' || city
from employees join departments 
using(department_id)
join locations using(location_id)
where city like 'Toronto';

select last_name
from employees
where hire_date > (
    select hire_date
    from employees
    where first_name like 'David' and last_name like 'Lee');
    
select hire_date
from employees
where first_name like 'David' and last_name like 'Lee';


select last_name
from employees
where hire_date > (
    select distinct hire_date
    from employees
    where manager_id is not null );

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