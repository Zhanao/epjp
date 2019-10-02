alter table items add counter number(38, 0);

alter table items drop column coder_id;

alter table items add constraint items_coder_id_fk
coder_id references coders(coder_id);

