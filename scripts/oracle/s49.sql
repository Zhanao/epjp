select manager_id, trunc(avg(salary))
from employees
where salary < 8000 -- filtro il salario riga per riga
group by manager_id -- faccio la media nei rispettivi gruppi
having avg(salary) > 6000 -- è uguale a where ma si usa dopo il group by, faccio vedere solo medie di salari sopra 6000
order by 2 desc;
