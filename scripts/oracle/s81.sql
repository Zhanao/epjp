set serveroutput on

--versione di cursor più compatta
declare
    cursor v_coder_cursor is
        select last_name, hire_date from coders;
begin
    for v_cur in v_coder_cursor loop
        dbms_output.put_line('[' || v_cur.last_name || ', ' || v_cur.hire_date || ']');
    end loop;
end;
/

declare
    cursor v_view_cursor is
        select first_name, last_name, phone_number 
        from phone_nomanager_employee_view
        where last_name like 'A%' or first_name like 'A%'
        order by 1, 2;
begin
    for v_cur in v_view_cursor loop
        dbms_output.put_line('[' || v_cur.first_name || ', ' || v_cur.last_name || ', ' || v_cur.phone_number || ']');
    end loop;
end;
/