set serveroutput on

create or replace procedure tomorrow
    is
    begin
    dbms_output.put_line('La data di domani è ' || (sysdate+1));
    end tomorrow;
/

declare
v_nextday date;
    
begin
tomorrow();
--tomorrow(v_nextday);
--dbms_output.put_line('La data di domani è ' || v_nextday);
end;
/

create or replace procedure tomorrow1(
    p_name in varchar2) is
    begin
        
        dbms_output.put_line('Ciao '|| p_name || ' la data di domani è ' || (sysdate+1));
    end tomorrow1;
/

declare
v_name varchar2(20):='GIGI';
    begin

    tomorrow1(v_name);

end;
/

create or replace procedure get_coder(
p_id in coders.coder_id%type,
p_first_name out coders.first_name%type,
p_last_name out coders.last_name%type)is
begin
    select first_name,last_name
    into p_first_name,p_last_name
    from coders
    
    where coder_id=p_id;
    end get_coder;
    /

declare
v_id coders.coder_id%type:=110;
v_first coders.first_name%type;
v_last coders.last_name%type;
begin
get_coder(v_id,v_first,v_last);
dbms_output.put_line('Il nome e il cognome del dipendente: ' || v_id || ' è ' || v_first || ' ' || v_last);
exception
    when others then
    dbms_output.put_line('Non c è nessun dipendente con id: ' || v_id ||' associato');
end;
/
