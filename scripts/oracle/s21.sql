select *
from employees
order by last_name; --ordina in ordine alfabetico considerando il cognome

select *
from employees
order by last_name desc, first_name asc; --così ordina prima dal cognoome al contrario e poi dal nome in maniera ascendente

select first_name, last_name
from employees
order by 2;
