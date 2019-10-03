set serveroutput on

-- a procedure

create or replace procedure get_coder_salary(
    p_coder_id in coders.coder_id%type,
    p_salary out coders.salary%type) is
begin
    select salary
    into p_salary
    from coders
    where coder_id = p_coder_id;
end get_coder_salary;
/

-- run it
declare
    v_id coders.coder_id%type := 105;
    v_salary coders.salary%type;
begin
    get_coder_salary(v_id, v_salary);
    dbms_output.put_line('Salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

declare
    v_id coders.coder_id%type := 8000;
    v_salary coders.salary%type;
begin
    get_coder_salary(v_id, v_salary);
    dbms_output.put_line('Salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

-- just for demonstration
drop procedure get_coder_salary;
drop function increase_salary;
