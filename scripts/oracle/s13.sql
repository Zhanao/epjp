select 1+2, 3-4, 2*6, 5/2
from dual;

select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3
from dual;

select to_date('02-NOV-2019') - to_date('25-MAR-2019')
from dual; --abbiamo messo con "" perchè erano più parole, se una sola parola possiamo usare ' '

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;
