drop table trainees;
drop table courses;
drop SEQUENCE trainee_sq;
drop SEQUENCE course_sq;

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

create SEQUENCE trainee_sq start with 1000 increment by 1;
create SEQUENCE course_sq start with 100 increment by 1;

insert into courses
values (course_sq.nextval,'Birreristica','Pavia');

insert into courses
values (course_sq.nextval,'Risottistica','Milano');

insert into courses
values (course_sq.nextval,'Arancinistica','Pavia');

insert into courses
values (course_sq.nextval,'Gondolieria','Venezia');

insert into courses
values (course_sq.nextval,'Pizza','Napoli');

insert into courses
values (course_sq.nextval,'Mozzarellistica','Salerno');

insert into trainees
values (trainee_sq.nextval,'Luciana', 'Uggetti','luciana.uggetti@accenture.it',3920000000+trainee_sq.nextval, 104);

insert into trainees
values (trainee_sq.nextval,'Zhanao', 'Wu','zhanao.wu@accenture.it',3920000000+trainee_sq.nextval, 102);

insert into trainees
values (trainee_sq.nextval,'Ilaria', 'Maggiolino','ilaria.maggiolino@accenture.it',3920000000+trainee_sq.nextval, 104);

insert into trainees
values (trainee_sq.nextval,'Chiara', 'Saporito','chiara.saporito@accenture.it',3920000000+trainee_sq.nextval, 106);

insert into trainees
values (trainee_sq.nextval,'Antonino', 'Scarfone','antonino.scarfone@accenture.it',3920000000+trainee_sq.nextval, 103);

insert into trainees
values (trainee_sq.nextval,'Marco', 'Blanco','marco.blaco@accenture.it',3920000000+trainee_sq.nextval, 103);

insert into trainees
values (trainee_sq.nextval,'Giovanni', 'Maggi','giovanni.maggi@accenture.it',3920000000+trainee_sq.nextval, 101);

insert into trainees
values (trainee_sq.nextval,'Sergio', 'Evangelista','sergio.evangelista@accenture.it',3920000000+trainee_sq.nextval, 101);

insert into trainees
values (trainee_sq.nextval,'Paolo', 'Riva','paolo.riva@accenture.it',3920000000+trainee_sq.nextval, 102);

insert into trainees
values (trainee_sq.nextval,'Edoardo', 'Errani','edoardo.errani@accenture.it',3920000000+trainee_sq.nextval, 105);

insert into trainees
values (trainee_sq.nextval,'Alessandro', 'Armato','alessandro.armato@accenture.it',3920000000+trainee_sq.nextval, 105);




COMMIT;