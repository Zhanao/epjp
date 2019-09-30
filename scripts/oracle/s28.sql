select region_name, country_name
from regions join countries
on(regions.region_id = countries.region_id); --con join on diciamo esplicitamente come fare la join
-- primary key e foreign key
--sono natural join