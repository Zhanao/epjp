select first_name, last_name, department_name
from employees left outer join departments
using(department_id);

select first_name, last_name, job_title
from employees left outer join jobs
using(job_id);

select first_name, last_name, job_title
from employees e left outer join jobs j
using(job_id)
where e.salary between j.min_salary and j.max_salary;