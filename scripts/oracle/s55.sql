insert into regions(region_id, region_name)
values (11, 'Antarctica');

insert into regions(region_id) -- dato che hanno fatto la tab regions con region name nullable, posso evitare di mettere il nome
values (12); -- oracle metterà null nel campo region_name

insert into regions -- non avendo specificato il nome delle colonne ho duvot mettere null
values (13, null);
