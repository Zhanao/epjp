DESCRIBE regions;

select *
from regions; -- mostra tutte le colonne degli elementi nella tabella

select sysdate 
from dual;

select 4*5
from dual;

select region_name
from regions; -- mi mostra solo il nome delle regioni senza ID

SELECT region_name
FROM regions
WHERE region_id = 1;

select rowid, rownum, region_name
from regions;

select table_name
from user_tables;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';

describe jobs;

select 1+2, 3-4, 2*6, 5/2
from dual;

select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3 from dual;
select to_date('02-NOV-2019') - to_date('25-MAR-2019') as "How many days"
from dual;

select job_title, min_salary, min_salary + 2000 as "modified min salary", min_salary * 3 + 1000
from jobs;

select first_name || '  ' || last_name as "Employee's name"
from employees;

select first_name || '.' || last_name || '.@accenture.com' as "Employee's name"
from employees;

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) as "Annual commission"
from employees;

select 12 * salary * nvl(commission_pct, 0) as "Annual commission"
from employees
where employee_id=145;

select 12 * salary * nvl(commission_pct, 0) as "Annual commission"
from employees
where first_name = 'John' and last_name= 'Russell';

select count(rowid) -- conta tutte le righe dell employees
from employees;

select distinct manager_id -- elimina i duplicati e ci permette di lavorare su chiavi uniche
from employees;

select count(DISTINCT manager_id) -- per sapere quanti manager ci sono in tutto
FROM employees;

select *
from regions
where region_id > any(1, 2, 3);

select *
from regions
where region_id > all(1, 2, 3);

select last_name 
from employees 
where last_name like '_ul%'; -- pattern : _ un carattere + ul+ % caratteri fino alla fine

select * 
from employees 
where last_name 
like '_mith';

select * 
from employees 
where last_name like 'S%h';
select * 
from employees 
where last_name like 'S_o';

select * 
from employees 
where last_name like '___';

select * from regions
where region_id
not in (2, 3);

select * from regions
where region_id
not in (2, 3,null); -- attenzione che il null si mangia tutto

select *
from employees
where manager_id in (null); -- non funziona

select * from 
regions 
where region_id between 2 and 3;

select * from regions
where region_id
in (2, 3);

select * 
from employees
where salary < 3000 and employee_id > 195;

select * 
from employees
where salary > 20000 or last_name = 'King';

select *
from employees
where not department_id > 20;

select *
from employees
order by last_name; -- ordine naturale

select *
from employees
order by last_name desc, first_name asc;

select first_name, last_name
from employees
order by 2;

select first_name, last_name  
from employees
order by 1; --ordina per la prima colonna

select region_name 
from regions 
where region_id = 1;

select country_name 
from countries 
where region_id = 1;

select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id --and countries.region_id = 2
order by country_name;


select r.region_name, c.country_name -- alias legato allo statement
from regions r, countries c
where r.region_id = c.region_id;

select country_name, region_name
from regions join countries
using (region_id) -- 
order by 1;

select region_name, country_name
from regions natural join countries;

select region_name, country_name
from regions join countries
on(regions.region_id = countries.region_id);

select region_name, country_name
from regions r join countries c
on(r.region_id = c.region_id);

select region_name, country_name
from regions cross join countries;

select e.last_name as employee, m.last_name as manager
from employees e join employees m --nel caso della self join alias è d'obbligo
on (e.manager_id = m.employee_id);

