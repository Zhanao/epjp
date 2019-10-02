set serveroutput on

declare
    cursor phone_cursor is
        select first_name, last_name, phone_number from phones_view;
begin
    for v_cur in phone_cursor loop
        dbms_output.put_line(
        v_cur.first_name||' '||v_cur.last_name||' '||v_cur.phone_number);
    end loop;

end;
/

declare
    cursor phone_cursor is
        select first_name, last_name, phone_number from phones_view order by 1,2;
begin
    for v_cur in phone_cursor loop
        if  regexp_like(v_cur.first_name,'^[A]') or regexp_like(v_cur.last_name,'^[A]') then
        dbms_output.put_line(
        v_cur.first_name||' '||v_cur.last_name||' '||v_cur.phone_number);
        end if;
    end loop;

end;
/