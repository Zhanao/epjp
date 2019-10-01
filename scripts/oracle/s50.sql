--qua prende il nome e il cognome del manager con il manager_id trovare dalla subquery
--qua prende il manager_id con il cognome Chen
select first_name, last_name
from employees 
where employee_id = (
	select manager_id 
	from employees
	where last_name = 'Chen');
--questa è la subquery     
select manager_id 
from employees
where last_name = 'Chen';

--stampa la tabella raggruppata per dipartimenti delle medie di stpendio che è minore della media trovata nella subquery
-- la subquery trova la media media degli stipendi
select department_id, trunc(avg(salary)) 
from employees
group by department_id having avg(salary) < ( 
    select max(avg(salary))
    from employees
    group by department_id);  
--questa è la subquery 
select max(avg(salary))
from employees
group by department_id;

--questa select crea una tabella temporanea da usare per la subquery
select employee_id
from (
	select employee_id
	from employees
	where employee_id between 112 and 115);
--questa è la subquery    
select employee_id
from employees
where employee_id between 112 and 115;


