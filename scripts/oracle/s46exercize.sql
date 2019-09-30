select last_name, salary, salary*1.085, ABS(salary*1.085-salary) as Delta
from employees;

SELECT *
FROM employees
where regexp_like(first_name, '*[Aa].*') or regexp_like(last_name, '*[Aa].*');


select last_name, TRUNC(MONTHS_BETWEEN(sysdate, hire_date), 3) as MonthsElapsed
from employees;

select last_name, lpad(length(salary/1000)
from employees;


select last_name, commission_pct
from employees
where commission_pct is null;