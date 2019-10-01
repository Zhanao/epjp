update regions
set region_name = 'Region ' || region_id
where region_id > 10;
--se non metto il where lo fa dappertutto

select region_name
from regions;
