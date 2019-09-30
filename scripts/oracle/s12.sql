select table_name
from user_tables;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS'; --tutte le informaioni in oracle sono organizzate in tabelle
