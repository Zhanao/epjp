

select max(salary) as Maximum
from employees;

select min(salary) as Minimum
from employees;

select sum(salary) as Sum
from employees;

select avg(salary) as Average
from employees;

select job_id, max(salary) as Maximum
from employees
group by job_id;

select job_id, min(salary) as Minimum
from employees
group by job_id;

select job_id, sum(salary) as Sum
from employees
group by job_id;

select job_id, avg(salary) as Average
from employees
group by job_id;

select job_id, count(*)
from employees
group by job_id;

select job_id, count(*)
from employees
where job_id like 'IT_PROG'
group by job_id;

select count(*)
from (
    select distinct manager_id
    from employees
    where manager_id is not null );
    
select distinct manager_id
from employees
where manager_id is not null;

select (max(salary) - min(salary)) as Gap
from employees;

select job_id, (max(salary) - min(salary)) as Gap
from employees
group by job_id
having (max(salary) - min(salary)) > 0;

select manager_id, min(salary)
from employees
where employee_id not in (
    select distinct manager_id
    from employees
    where manager_id is not null )
group by manager_id
having min(salary) > 6000;