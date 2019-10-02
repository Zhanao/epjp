select *
from items;

-- plain FK
alter table items
drop column coder_id;

select *
from items;

alter table items
add constraint items_coder_id_fk coder_id references coders(coder_id);

select *
from items;

-- FK remove orphans
alter table items
drop column coder_id;

select *
from items;

alter table items
add constraint items_coder_id_fk coder_id references coders(coder_id) on delete cascade;

select *
from items;

-- FK remove relation
alter table items
drop column coder_id;

alter table items
add constraint items_coder_id_fk coder_id references coders(coder_id) on delete set null;
