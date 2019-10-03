set serveroutput on

-- a procedure to get tomorrow's date
create or replace procedure get_tomorrow_date is
begin
    dbms_output.put_line('Tomorrow is ' || (sysdate + 1));
end get_tomorrow_date;
/
drop procedure get_tomorrow_date;

begin
    get_tomorrow_date();
end;
/

-- a procedure to get tomorrow's date with week day
create or replace procedure get_tomorrow_name(
    p_name in varchar2) is
begin
    dbms_output.put_line('Tomorrow is ' || p_name || ' and the date is ' || (sysdate + 1));
end get_tomorrow_name;
/

declare
    v_name varchar2(20) := 'friday';
begin
    get_tomorrow_name(v_name);
exception
    when others then
        dbms_output.put_line('Can''t get tomorrow of ' || sysdate);
end;
/

drop procedure get_tomorrow_date;


-- a procedure to get the date in a certain integer of days
create or replace procedure get_next_date(
    p_next in integer) is
begin
    dbms_output.put_line('The date in ' || p_next || ' days is ' || (sysdate + p_next));
end get_next_date;
/

declare
    v_next integer := 20;
begin
    get_next_date(v_next);
end;
/

drop procedure get_next_date;

--a procedure to get the name and last name of the coder associated to the code_id
create or replace procedure get_coder(
    p_coder_id in coders.coder_id%type) is
    p_first_name coders.first_name%type;
    p_last_name coders.last_name%type;
begin
    select first_name, last_name
    into p_first_name, p_last_name
    from coders
    where coder_id = p_coder_id;
    dbms_output.put_line('The complete name is ' || p_first_name || ' ' || p_last_name);
end get_coder;
/

-- run it
declare
    v_id coders.coder_id%type := 105;
begin
    get_coder(v_id);
exception
    when others then
        dbms_output.put_line('Can''t get name for' || v_id);
end;
/

drop procedure get_coder;


select sysdate
from dual;

