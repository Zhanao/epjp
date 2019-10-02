drop table courses;
drop table trainees;

create table details (
    detail_id integer
        constraint detail_pk primary key
        constraint detail_id_ck check (mod(detail_id, 2) = 1),
    status char default 'A'
        constraint detail_status_ck check (status in ('A', 'B', 'X')),
    name varchar2(20),
        -- constraint detail_name_nn not null,
        -- constraint detail_name_uq unique,
    coder_id integer
        constraint detail_coder_id_fk references coders(coder_id) on delete cascade,

    constraint detail_name_status_uq unique(name, status)
);

--con unique non possimao inserire due volte lo stesso valore
--con 'constraint detail_coder_id_fk' introduciamo la foreign key
--con 'constraint detail_pk'introduciamo la primary key che deve essere unica e non può essere 'null'
--la ',' serve  per concludere le istanze delle colonne dove definiziamo le sue proprietà

select *
from details;

--creo la tabella per le persone che assistono ai corsi
create table trainees (
    trainee_id integer
        constraint trainee_pk primary key,
    first_name varchar2(20)
        constraint trainee_first_name_nn not null
        constraint trainee_first_name_uq unique,
    last_name varchar2(20)
        constraint trainee_last_name_nn not null
        constraint trainee_last_name_uq unique,
    course_id integer
        constraint trainee_course_id_fk references courses(course_id) on delete cascade
        );

--creo la tabella per i corsi
create table courses (
    course_id integer
        constraint course_pk primary key,
    course_name varchar2(20)
        constraint course_course_name_nn not null
        constraint course_course_name_uq unique
        );
        
select *
from trainees;

select *
from courses;

insert into courses values(101, 'Ethical Hacking');
insert into courses values(102, 'Java Programming');
insert into courses values(103, 'Machine Learnig');
insert into courses values(104, 'AI');


insert into trainees values(01, 'Giovanni', 'Maggi', 101);
insert into trainees values(02, 'Ilaria', 'Maggiolini', 101);
insert into trainees values(03, 'Chiara', 'Saporito', 103);
insert into trainees values(04, 'Marco', 'Blanco', 102);
insert into trainees values(05, 'Antonio', 'Scarfone', 101);
insert into trainees values(06, 'Luciana', 'Uggetti', 104);
insert into trainees values(07, 'Paolo', 'Riva', 104);
insert into trainees values(08, 'Edoardo', 'Errani', 103);
insert into trainees values(09, 'Alessandro', 'Armato', 103);
insert into trainees values(10, 'Zhanao', 'Wu', 102);
insert into trainees values(11, 'Sergio', 'Evangelista', 101);

select *
from trainees;

select last_name, course_name
from trainees join courses
using(course_id);

select last_name, course_name
from trainees right outer join courses
using(course_id);

select last_name, course_name
from trainees left outer join courses
using(course_id);


--aggiungo la colonna per la città di provenienza
alter table trainees 
add city varchar2(20);

select *
from trainees;

update trainees set city = 'Verona' where trainee_id = 1;
update trainees set city = 'Bari' where trainee_id = 2;
update trainees set city = 'Cosenza' where trainee_id = 3; 
update trainees set city = 'Messina' where trainee_id = 4;
update trainees set city = 'Palermo' where trainee_id = 5;
update trainees set city = 'Potenza' where trainee_id = 6;
update trainees set city = 'Saragoza' where trainee_id = 7;
update trainees set city = 'Bologna' where trainee_id = 8;
update trainees set city = 'Catanzaro' where trainee_id = 9;
update trainees set city = 'Milano' where trainee_id = 10;
update trainees set city = 'Bologna' where trainee_id = 11;

select last_name, city
from trainees
order by city;

select *
from trainees;

select *
from courses;

select course_name, last_name
from courses left outer join trainees
using(course_id);

select course_name, count(*)
from courses left outer join trainees
using(course_id)
group by course_name;

select course_name, count(*)
from courses right outer join trainees
using(course_id)
group by course_name;

drop sequence seq_trainee;
drop sequence seq_course;

create sequence seq_trainee
start with 1001;

create sequence seq_course
start with 105;

select *
from trainees;

select *
from courses;

update trainees set trainee_id = seq_trainee.nextval where trainee_id = 1;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 2;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 3;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 4;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 5;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 6;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 7;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 8;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 9;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 10;
update trainees set trainee_id = seq_trainee.nextval where trainee_id = 11;

insert into courses values(seq_course.nextval, 'Slow Cooking');

select *
from courses;

insert into trainees values(seq_trainee.nextval, 'Brigitta', 'Lollobrigida', seq_course.currval, 'Pattaya');