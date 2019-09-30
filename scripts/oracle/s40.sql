select ascii('A') as A, chr(90) as "90"
from dual;

select concat(first_name, last_name)
from employees;

select initcap('a new thing') as initcap, lower('LOWER') low, upper('UPPER') up
from dual;

--fornisce la prima posizione in cui trova il pezzo di stringa nella stringa madre. se metto un numero: cerca l'occorenza dopo quella
--posizione (compresa), se metto due numeri contigui: es. 3,4 significa che voglio trovare dove si ripete per la quarta volta
select instr('crab', 'ba') as "not found", instr('crab abba rabid cab', 'ab', 2,3) as pos 
from dual;

select instr(sysdate, '19') as pos, sysdate
from dual;

select length('name'), length(42000)
from dual;
