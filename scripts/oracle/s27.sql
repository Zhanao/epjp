-- join è inner per default
select region_name, country_name
from regions join countries
using(region_id);

select region_name, country_name
from regions join countries
using(region_id)
order by 1; -- ordina per la prima colonna in ordine alfabetico

select region_name, country_name
from regions join countries
using(region_id)
order by 2 desc; 

select region_name, country_name
from regions natural join countries;

