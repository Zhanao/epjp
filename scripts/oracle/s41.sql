select lpad('tom', 30, '.') tom,
	rpad('tim', 30, '_- -_') tim
from dual;

select ltrim(' Hi!'), -- cancella lo spazio a sinistra
	rtrim('Hi!abab', 'ab'), -- cancella da destra tutti gli ab, continua finche' vedi il pattern
	trim('0' from '00Hi!000')-- cancella da ambi i lati il valore 0
from dual;

select employee_id, nvl(commission_pct, 0) -- converte il valori nulli in valore in questo caso '0'
from employees;

select employee_id, nvl2(commission_pct, 'value', 'no value') 
from employees;

select replace('Begin here', 'Begin', 'End'),
	substr('ABCDEFG',3,4) -- estrai una sottostringa dalla posizione 3 e lunga 4
from dual;

select substr(12345678, 3, 4)
from dual;
