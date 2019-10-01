create table items (
item_id integer primary key,
status char,
name varchar2(20),
coder_id integer);

create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60; -- mi darà errore perchè non ho i privilegi da amministratore per accedere ad hr
--sqlplus / as sysdba
--grant select on hr.employees to me;
--ora ho i privilegi
create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

select *
from coders;

alter table items add counter number(38, 0);

select *
from items;

alter table items drop column counter;

select *
from items;

alter table items add constraint items_status_ck check(status in ('A', 'B', 'X'));

select *
from items;

INSERT into items
values (1,'A','mela',123);

select *
from items;

INSERT into items
values (2,'z','pera',123); -- non me lo inserisce perche ho messo il constraint

alter table coders add constraint coders_name_uq unique(first_name, last_name);

alter table items modify name constraint items_name_nn not null;

alter table coders add constraint coders_pk primary key(coder_id);

alter table items drop constraint items_name_nn;