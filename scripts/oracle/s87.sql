set serveroutput on

-- output table
create table coder_salaries (
    coder_id number(6, 0)
        references coders(coder_id),
    old_salary number(8, 2),
    new_salary number(8, 2),
    date_increment date
);

-- a trigger
create or replace trigger salary_update
before update of salary on coders
for each row
begin
    insert into coder_salaries values(:old.coder_id, :old.salary, :new.salary, sysdate);
end salary_update;
/

-- use the trigger
update coders
set salary = salary * 1.3
where coder_id = 106;

-- show trigger results
select *
from coder_salaries;


-- example cleanup
drop trigger salary_update;
drop table coder_salaries;
