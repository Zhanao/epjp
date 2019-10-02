-- -- sysdba
-- alter session set container=xepdb1;
-- grant create view to me; bisogna garantire il permesso a me di creare la view

create or replace view odd_coders_view as
select * from coders
where mod(coder_id, 2) = 1
with read only;

select *
from odd_coders_view;

drop view odd_coders_view;


--di seguito creiamo la view per vedere i numeri di telefono per i dipendenti che non sono manager
create or replace view phone_noManager_employee_view as
select first_name, last_name, phone_number from hr.employees
where employee_id not in (
    select distinct manager_id 
    from hr.employees 
    where manager_id is not null)
with read only;

select *
from phone_nomanager_employee_view;

drop view phone_nomanager_employee_view;
