set serveroutout on

drop procedure increase_salary

create or replace procedure increase_salary(
    p_coder_id in coders.coder_id%type,
    p_increase in coders.salary%type,
    p_salary_increased out coders.salary%type) is
begin    
    update coders 
    set salary = salary + p_increase
    where coder_id = p_coder_id;
    
    select salary
    into p_salary_increased
    from coders
    where coder_id = p_coder_id;
end increase_salary;
/


declare
    v_id coders.coder_id%type := 105;
    v_increase coders.salary%type := 1000;
    v_salary coders.salary%type;
begin
    increase_salary(v_id, v_increase, v_salary);
    dbms_output.put_line('The increased salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/
    
commit;
    