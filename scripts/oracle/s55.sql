insert into regions(region_id, region_name)
values (11, 'Antarctica');

select region_name
from regions;

insert into regions(region_id)
values (12);

select region_id
from regions;

--qua il null non è neccessario, ma se mettiamo il null allora dobbiamo metterlo per tutte le colonne
insert into regions
values (13, null);

select region_id, region_name
from regions;