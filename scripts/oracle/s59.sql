insert into regions(region_id, region_name)
values (11, 'Antarctica');

select *
from regions;

savepoint sp;

insert into regions(region_id, region_name)
values (12, 'Oceania');

select *
from regions;

-- keep Antarctica, rollback Oceania
rollback to sp;

select *
from regions;

-- persist Antarctica
commit

select *
from regions;

-- select * from regions;

-- back to orginal status
-- delete from regions where region_id = 11;