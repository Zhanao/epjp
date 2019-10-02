set serveroutput on

declare
    v_a integer; 
begin
    v_a:= 9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999;
    if v_a > 0 then
        dbms_output.put_line('v_a is positive');
    elsif v_a = 0 then
        dbms_output.put_line('v_a is zero');
    else
        dbms_output.put_line('v_a is negative');
    end if;
    exception
    when others then
    dbms_output.put_line('Exception!');
end;
/