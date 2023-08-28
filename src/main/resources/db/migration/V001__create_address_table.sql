CREATE SEQUENCE address_table_sequence START 4 INCREMENT 1;

CREATE TABLE if not exists address_table
(
    id          int8 primary key not null,
    city        varchar,
    street      varchar,
    date_create timestamp
);

insert into address_table(id, city, street, date_create)
values (1, 'Moscow', 'Nevsky', null),
       (2, 'Vladimir', 'Lenina', null),
       (3, 'Kaliningrad', 'Lukashova', null);