select *
from coders;

delete from coders
where coder_id = 201;

delete from coders
where coder_id = 202;

drop sequence my_seq;

drop sequence seq_coder;

create sequence seq_coder
start with 201;

insert into coders
values(seq_coder.nextval, 'Maria', 'Rossi', sysdate, 5000);
insert into coders
values(seq_coder.nextval, 'Franco', 'Bianchi', sysdate, 4500);

select *
from coders;

update coders set first_name = 'Mariangela' where first_name = 'Maria';

update coders set salary = (salary + 500) where salary < 6000;

delete from coders
where first_name = 'Franco' and last_name = 'Bianchi';

commit;

