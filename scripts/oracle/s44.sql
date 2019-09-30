select add_months(sysdate, 3)
from dual;

select months_between(sysdate, '01-FEB-2019')
from dual;

select last_day(sysdate)
from dual;

select next_day(sysdate, 'mon')
from dual;

select round(sysdate, 'year'), round(sysdate, 'month')
from dual;

select trunc(sysdate, 'year'), trunc(sysdate, 'month')
from dual;