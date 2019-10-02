set serveroutput on


--i loop for incrementano solamente di 1 e non possiamo cambiare la cosa
declare
    v_x integer;
begin
    dbms_output.put_line('loop while');
    v_x := 0;
    while v_x < 3 loop
        dbms_output.put_line('loop on v_x = ' || v_x);
        v_x := v_x + 1;
    end loop;
    dbms_output.put_line('loop complete, v_x = ' || v_x || chr(10));

    dbms_output.put_line('loop for');
    for i in 1..5 loop
        dbms_output.put_line('for loop: ' || i);
    end loop;

    dbms_output.put_line('for loop completed, the loop variable is out of scope' || chr(10));

    dbms_output.put_line('reverse loop for');
    for i in reverse 1..5 loop
        dbms_output.put_line('for loop: ' || i);
    end loop;
end;
/