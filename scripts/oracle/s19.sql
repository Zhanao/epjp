select last_name
from employees
where last_name like '_ul%'; -- l'underscore sta a significare un carattere e solo uno, 'ul' per cercare dove c'è ul del nome e '%' sta a significare tanti caratteri e non solo uno

select last_name
from employees
where last_name like 'S%'; --trova quelli che iniziano per S

select last_name
from employees
where last_name like 'S%h'; --inizia per S e finisce per h

select last_name
from employees
where last_name like '___'; -- per nomi a tre lettere

select *
from regions
where region_id not in (2, 3); -- prende quelli non in 2 e 3

select *
from regions
where region_id in (2, 3); -- prende quelli in 2 e 3

-- !! NOT IN(..., NULL) -> FALSE !!
select *
from regions
where region_id not in (2, 3, null); --attenzione al null, infatti spacca tutto

select *
from regions
where region_id between 2 and 3; --questo per l'intervallo che in questo caso è chiuso

select *
from employees
where manager_id is null;
