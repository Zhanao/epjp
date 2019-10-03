set serveroutout on

drop function increase_salary_function

create or replace function increase_salary_function(
    p_coder_id in coders.coder_id%type,
    p_increase in coders.salary%type)
return number as
    v_salary_increased coders.salary%type;
begin    
    update coders 
    set salary = salary + p_increase
    where coder_id = p_coder_id;
    
    select salary
    into v_salary_increased
    from coders
    where coder_id = p_coder_id;
    return v_salary_increased;
end increase_salary_function;
/


declare
    v_id coders.coder_id%type := 105;
    v_increase coders.salary%type := 1000;
    v_salary coders.salary%type;
begin
    v_salary := increase_salary_function(v_id, v_increase);
    dbms_output.put_line('The increased salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

commit;