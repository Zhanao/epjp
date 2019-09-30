select *
from employees
where salary < 3000 and employee_id > 195; --in sql gli and e gli or si scrivono esplicitamente

select *
from employees
where salary > 20000 or last_name = 'King';

select *
from employees
where not department_id > 20;
