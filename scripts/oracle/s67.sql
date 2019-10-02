-- temporary
create table users (
    id integer,
    code integer,
    gender char(1)
);

insert into users 
values(92, 4, 'M');

insert into users 
values(32, 3, 'F');

insert into users 
values(31, 2, 'F');

insert into users 
values(14, 3, 'M');

select *
from users;

-- btree index
--gli alber in java erano nella ram
--in SQL invece le tabelle saranno sul disco fisso
--i btree invece servono per mettere un po' i valori sulla ram e un po' sull'hd
--gli indici sono una delle cose più variabili delle tabelle, infatti ci sono delle persone per sistemare gli indici, 
--attenzione gli indici rallentano molto le cose quindi bisogna stare attenti se o come inserirli

--indice semplice
create index users_id_ix 
on users(id);

--indice composto
create index users_id_code_ix 
on users(id, code);

drop index users_id_ix;


-- bitmap index

create bitmap index users_gender_ix 
on users(gender);

select * 
from users 
order by gender;

-- cleanup
drop table users;
