select manager_id, trunc(avg(salary))
from employees
where salary < 8000
group by manager_id -- 'gruop by' ci dice di raggruppare per un certo valore
having avg(salary) > 6000 --'having' ci dice di tenere quelli con il salario maggiore 6000 in media
order by 2 desc;

select manager_id, trunc(avg(salary))
from employees
where salary < 8000
group by manager_id;

select manager_id, trunc(avg(salary))
from employees
group by manager_id;