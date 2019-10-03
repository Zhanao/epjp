set serveroutput on

-- a function

create or replace function get_salary(
    p_coder_id in coders.coder_id%type)
return number as
    v_salary coders.salary%type;
begin
    select salary
    into v_salary from coders
    where coder_id = p_coder_id;
    return v_salary;
end get_salary;
/

-- run it
declare
    v_id coders.coder_id%type := 105;
    v_salary coders.salary%type;
begin
    v_salary := get_salary(v_id);
    dbms_output.put_line('Salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

-- just for demonstration
drop function get_salary;

--voglio screivere una procedura a cui passando id, increase_salary e mi sputa fuori un nuovo salario, modificiando
--anche il valore della tabella

create or replace PROCEDURE increase_salary(
        p_coder_id in coders.coder_id%type,
        p_salaryincrement in coders.salary%type,
        p_newsalary out coders.salary%type) is
    begin 
        update coders
        set salary = salary + p_salaryincrement
        where coder_id = p_coder_id;
        
        select salary
        into p_newsalary
        from coders
        where coder_id = p_coder_id;
    end increase_salary;
/

-- run it

declare
    v_id coders.coder_id%type := 105;
    v_increment coders.salary%type := 100;
    v_salary coders.salary%type;
begin
    increase_salary(v_id,v_increment,v_salary);
    dbms_output.put_line('New salary for ' || v_id ||' is ' || v_salary);
    exception
        when others then
            dbms_output.put_line('Can''t change salary for ' || v_id);    
end;
/

create or replace function inc_salary(
     p_coder_id in coders.coder_id%type,
     p_salaryincrement in coders.salary%type)
    return number as
     p_newsalary coders.salary%type;
    begin
     update coders
     set salary = salary + p_salaryincrement
     where coder_id = p_coder_id;
     
     select salary
     into p_newsalary from coders
     where coder_id=p_coder_id;
     return p_newsalary;
    end inc_salary;
/

declare
    v_id coders.coder_id%type := 105;
    v_increment coders.salary%type := 100;
    v_salary coders.salary%type;
begin
    v_salary:=inc_salary(v_id,v_increment);
    dbms_output.put_line('New salary for ' || v_id ||' is ' || v_salary);
    exception
        when others then
            dbms_output.put_line('Can''t change salary for ' || v_id);    
end;
/

--commint;
    
