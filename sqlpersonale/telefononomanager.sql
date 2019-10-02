create or replace view phones_view as
    select first_name, last_name, phone_number
    from hr.employees
    where employee_id not in(select manager_id from HR.employees where manager_id is not null);    
    
select * 
from phones_view;

