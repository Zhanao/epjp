select region_name, country_count
from regions natural join (
    select region_id, count(rowid) country_count
    from countries
    group by region_id);

select region_id, count(rowid) country_count
from countries
group by region_id;