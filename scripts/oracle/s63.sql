alter table items
add counter number(38, 0);

select *
from items;

select *
from coders;

alter table items
drop column counter;

select *
from items;

insert into items
values (105, 'A', 'Diana', 105);

insert into items
values (001, 'Y', 'Bill', 110);

insert into items
values (975, 'Y', 'Merlino', 142);

insert into items
values (561, 'X', 'Tunk', 143);

--qua gli stiamo dicendo che non può fare alcune cose, nello specifico che non si possono mettere A, B, X
alter table items
add constraint items_status_ck check(status in ('A', 'Y', 'X'));

--qua stiamo dicendo che per i nomi e i cognomi sono uniche
alter table coders
add constraint coders_name_uq unique(first_name, last_name);

select *
from coders;

insert into coders(coder_id, first_name, last_name, hire_rate, salary)
values (108, 'Dianas', 'Patty', 01-SET-19, 5000);


--qua staimo dicendo che non si possono mettere dei null
alter table items
modify name constraint items_name_nn not null;

alter table coders
add constraint coders_pk primary key(coder_id);

alter table items
drop constraint items_name_nn;
