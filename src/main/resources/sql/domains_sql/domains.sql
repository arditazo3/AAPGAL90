-- 31.01.2016

create table domains (

  id_domain INT NOT NULL AUTO_INCREMENT,
  code_domains VARCHAR(50),
  value_dom VARCHAR(100),
  description VARCHAR(100),
  create_date DATE,
  PRIMARY KEY ( id_domain )
);

insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'TR', 'Tirana', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'EL', 'Elbasan', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'PG', 'Pogradec', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'KO', 'Korce', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'SH', 'Shkoder', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'DR', 'Durres', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'FR', 'Fier', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'GJ', 'Gjirokaster', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'VL', 'Vlore', now());
insert into domains (code_domains, value_dom, description,create_date) values ('patient.cities.list', 'KU', 'Kukes', now());