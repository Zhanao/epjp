drop table trainees;
drop table courses;

create table courses(
    course_id integer
        CONSTRAINT courses_pk primary key,
    course_name varchar2(20),
    city varchar2(20));

create table trainees(
    trainee_id integer
        constraint trainees_pk primary key,
    first_name varchar2(20)
        constraint trainee_firstname not null,
    last_name varchar2(20)
        constraint trainee_lastname not null,
    email varchar2(40)
        constraint trainee_email unique,
    phone_number integer
        constraint trainee_phone unique,
    course_id integer
        constraint trainee_course_id_fk references courses(course_id) on delete set null,
        constraint trainee_first_last_name unique(first_name,last_name));

insert into courses
values (01,'Birreristica','Pavia');

insert into courses
values (2,'Risottistica','Milano');

insert into courses
values (3,'Arancinistica','Pavia');

insert into courses
values (4,'Gondolieria','Venezia');

insert into courses
values (5,'Pizza','Napoli');

insert into courses
values (6,'Mozzarellistica','Salerno');

insert into trainees
values (10001,'Luciana', 'Uggetti','luciana.uggetti@accenture.it',3920000001, 4);

insert into trainees
values (10002,'Zhanao', 'Wu','zhanao.wu@accenture.it',3920000002, 2);

insert into trainees
values (10003,'Ilaria', 'Maggiolino','ilaria.maggiolino@accenture.it',3920000003, 4);

insert into trainees
values (10004,'Chiara', 'Saporito','chiara.saporito@accenture.it',3920000004, 6);

insert into trainees
values (10005,'Antonino', 'Scarfone','antonino.scarfone@accenture.it',3920000005, 3);

insert into trainees
values (10006,'Marco', 'Blanco','marco.blaco@accenture.it',3920000006, 3);

insert into trainees
values (10007,'Giovanni', 'Maggi','giovanni.maggi@accenture.it',3920000007, 1);

insert into trainees
values (10008,'Sergio', 'Evangelista','sergio.evangelista@accenture.it',3920000008, 1);

insert into trainees
values (10009,'Paolo', 'Riva','paolo.riva@accenture.it',3920000009, 2);

insert into trainees
values (10010,'Edoardo', 'Errani','edoardo.errani@accenture.it',3920000010, 5);

insert into trainees
values (10011,'Alessandro', 'Armato','alessandro.armato@accenture.it',3920000011, 5);


COMMIT;