describe regions; --permette di avere un descrizione rapida della tabella
DESCRIBE employees;

select * 
FROM regions;

select sysdate 
from dual;

select 4*5 
from dual;

select region_name 
from regions;

select * 
FROM regions 
where region_id = 1; --per righe

select *FROM regions where region_name = Europe;

SELECT rowid, rownum, region_name from regions; -- le virgole servono per dividere le colonne(i dati)

SELECT table_name
FROM user_tables;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS'; --tutte le informaioni in oracle sono organizzate in tabelle

select 1+2, 3-4, 2*6, 5/2
from dual;

select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3 from dual;
select to_date('02-NOV-2019') - to_date('25-MAR-2019') as "how many days" from dual; --abbiamo messo con "" perchè erano più parole, se una sola parola possiamo usare ' '

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

