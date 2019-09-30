-- questo è l'assert join e ci stampa la relazione

select e.last_name as employee, m.last_name as manager -- questa è una selfjoin
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 1;

select e.last_name as employee, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;