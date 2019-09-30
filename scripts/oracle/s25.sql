select region_name
from regions;

select region_name
from regions
where region_id = 1;

select country_name
from countries
where region_id = 1;

-- ...

select region_name
from regions
where region_id = 4;

select country_name
from countries
where region_id = 4;

-- JOIN qua le scriviamo noi esplicitamente nella slide 27 ci sono le inner join che fa tutto da solo
select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id;

select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id and countries.region_id = 4
order by countries.country_name;

select first_name, department_name
from employees, departments
where employees.department_id = departments.department_id;
