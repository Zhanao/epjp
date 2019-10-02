delete from coders
where coder_id=201;
drop sequence coders_sq;
create sequence coders_sq start with 201 increment by 1;


insert into coders
values(coders_sq.nextval, 'Maria', 'Rossi', sysdate, 5000);

insert into coders
values(coders_sq.nextval, 'Franco', 'Bianchi', sysdate, 4500);

update coders
set first_name = 'Mariangela'
where first_name = 'Maria';

update coders
set salary=salary+500
where salary<6000;

delete from coders
where first_name='Franco' and last_name='Bianchi';

commit;

