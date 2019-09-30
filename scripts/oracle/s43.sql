select to_char(12345.67), to_char(12345.67, '99,999.99')
from dual;

select to_char(2019, 'RN')
from dual;
    
select to_number('970.13') * 2
from dual;

select cast('05-APR-19' as date) + 2
from dual;

select cast(12345.678 as number(10,2))
from dual;
