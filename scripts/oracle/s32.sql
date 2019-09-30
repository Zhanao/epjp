select employee_id, city, department_name
from employees e join departments d on d.department_id = e.department_id
join locations l on d.location_id = l.location_id;
-- qua ci sono due join per collegare due tabelle

select employee_id, city, department_name
from employees join departments using(department_id)
join locations using (location_id);
--tutti e fanno la setssa cosa ma stiamo usando gli 'using'

select employee_id, city, department_name
from employees e, departments d, locations l
where d.department_id = e.department_id and d.location_id = l.location_id;
