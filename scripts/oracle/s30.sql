select region_name, country_name
from regions, countries;

select region_name, country_name
from regions cross join countries; --per fare meglio il prodotto cartesiano, il cross join dice effettivamente che si fa il prodotto cartesiano
