set serveroutput on
set serveroutput off

begin
    dbms_output.put_line('Hello PL/SQL');
end;
/

--solitamente si usa il v_ per iniziare le varaibili, dove v sta per variable
--solitamente le variabili si inizializzano del declare
--in PL/SQL si possono usare anche i BOOLEAN
--la divisione tra interi fa un round
declare
    v_width integer;
    v_height integer := 3;
    v_area integer := 10;
begin
    v_width := v_area / v_height;
    dbms_output.put_line('v_width = ' || v_width);
end;
/

declare
    v_width float;
    v_height integer := 3;
    v_area integer := 10;
begin
    v_width := v_area / v_height;
    dbms_output.put_line('v_width = ' || v_width);
end;
/