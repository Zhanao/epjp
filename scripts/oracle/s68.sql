create sequence my_seq;

select my_seq.nextval 
from dual;

select my_seq.currval 
from dual;

alter sequence my_seq 
increment by 2;

drop sequence my_seq;

--

create sequence my_seq 
start with 201 increment by 2;

select my_seq.currval
from dual;

select my_seq.nextval
from dual;

insert into coders
values(my_seq.nextval, 'Bertrand', 'Meyer', SYSDATE, 8000);

insert into coders
values(my_seq.nextval, 'Bertrand', 'Russel', SYSDATE, 6000);

select *
from coders;

select *
from user_sequences;