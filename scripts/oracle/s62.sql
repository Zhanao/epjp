-- -- connected as sysdba
-- -- when required, work on the required container
-- alter session set container=xepdb1;
-- grant select on hr.employees to me;

create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from hr.employees
    where department_id = 60;
    
--non abbiamo i privilegi per accedere alla tabella quindi da un errore quindi usiamo la riga di comando
--per avere i privilegi da terminale facciamo
--sqlplus / as sysdba
--grant select on hr.employees to me;

--questo comando cancella la tabella
drop table coders;

    
select *
from coders;