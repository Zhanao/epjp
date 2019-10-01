select max(salary)max ,MIN(salary) min, sum(salary) sum, round(avg(salary)) avg 
from employees;

select job_id, max(salary)max ,MIN(salary) min, sum(salary) sum, round(avg(salary)) avg 
from employees
group by job_id
order by 1;

select job_id, count (rowid)
from employees
group by job_id
order by 2;

select job_id, count (rowid) count
from employees
group by job_id
having job_id='IT_PROG'
order by 2;

select count(distinct (manager_id)) numeromanager
from employees;

select (MAX(salary)-min(salary))
from employees;

select job_id,(MAX(salary)-min(salary)) difsal
from employees
group by job_id
having (MAX(salary)-min(salary))!=0;

select min(salary)
from employees
group by manager_id
having manager_id is not null and min(salary)>=6000;

select street_address, country_name
from locations join countries 
using (country_id);

select first_name, department_name
from employees join departments
using (department_id);

select first_name, department_name
from employees join departments
using (department_id) join locations using (location_id)
where locations.city='Toronto';

select first_name||' '||last_name, employee_id
from employees
where hire_date>(select hire_date from employees where first_name='David' and last_name='Lee');

select first_name||' '||last_name, employee_id
from employees
where hire_date>(select e.hire_date from employees e join employees m on (e.manager_id=m.employees) where e.hire_date>e.hire_date );

select e.first_name||' '||e.last_name employer,e.hire_date hiree,m.hire_date hirem, m.first_name||' '||m.last_name manager
from employees e join employees m 
on (e.manager_id=m.employee_id) 
where e.hire_date<m.hire_date ;

select first_name||' '||last_name
from employees
where manager_id=(select manager_id from employees where first_name='Lisa' and last_name='Ozer');

select first_name||' '||last_name, department_id
from employees
where department_id in (select department_id from employees where REGEXP_LIKE(last_name,'[u]','i'));

select first_name||' '||last_name, department_name
from employees join departments
using(department_id)
where departments.department_name='Shipping';

select first_name||' '||last_name
from employees
where manager_id in(select employee_id from employees where first_name='Steven' and last_name='King');

