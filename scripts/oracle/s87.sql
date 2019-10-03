set serveroutput on

--questa è una tabella senza una primary key
--il coder_id è una foreign key della primary key della tabella coders, se nella tabella coders coder_id non è una primary key si ha un errore
-- output table
create table coder_salaries (
    coder_id number(6, 0)
        references coders(coder_id),
    old_salary number(8, 2),
    new_salary number(8, 2)
);

--number(8,2) significa che ho un numero ad 8 cifre in totale con 2 cifre dopo la virgola

select *
from coder_salaries;

-- a trigger
create or replace trigger salary_update
before update of salary on coders
for each row
begin
    insert into coder_salaries values(:old.coder_id, :old.salary, :new.salary);
end salary_update;
/

-- use the trigger
update coders
set salary = salary * 1.3
where coder_id > 103;

-- show trigger results
select *
from coder_salaries;

select *
from coders;


-- example cleanup
drop trigger salary_update;
drop table coder_salaries;
