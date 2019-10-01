select last_name, salary, salary*1.085, ABS(salary*1.085-salary) as Delta
from employees;

SELECT *
FROM employees
where regexp_like(first_name, '*[Aa].*') or regexp_like(last_name, '*[Aa].*');


select last_name, TRUNC(MONTHS_BETWEEN(sysdate, hire_date), 3) as MonthsElapsed
from employees;

select last_name, lpad('*', salary/1000, '*'), salary
from employees;

select last_name, lpad('*', round(salary/1000), '*'), salary
from employees;

select last_name, salary/1000
from employees;

select last_name, nvl(to_char(commission_pct, 'FM90.99'), 'no value')
from employees;

select last_name, nvl(to_char(commission_pct), 'no value')
from employees;

select 
    to_char(num, 'FM99.99') wrong_leading_period,
    to_char(num, 'FM90.99') wrong_trailing_period,
    rtrim(to_char(num, 'FM90.99'), '.') correct
from (
  select num from (select 0.25 c1, 0.1 c2, 1.2 c3, 13 c4, -70 c5 from dual)
  unpivot (num for dummy in (c1, c2, c3, c4, c5))
) sampledata;