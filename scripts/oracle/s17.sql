select manager_id
from employees;

select distinct manager_id
from employees;

select count (rowid)
from employees;

select manager_id
from employees;

select distinct manager_id
from employees;

select count (manager_id)
from employees; -- il nulla lo butta via infatti prima avevamo 107 righe ma ne conta 106

select count (distinct first_name)
from employees; --il select distinct toglie i dupplicati
