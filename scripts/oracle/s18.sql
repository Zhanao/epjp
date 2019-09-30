select *
from regions
where region_id = 1;

select *
from regions
where region_id != 2;

select *
from regions
where region_id < 3;

select *
from regions
where region_id <= 3;

select *
from regions
where region_id > any(1, 2, 3); -- any significa almeno uno

select *
from regions
where region_id > all(1, 2, 3); -- all significa tutti quanti
