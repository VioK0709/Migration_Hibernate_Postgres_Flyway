CREATE SEQUENCE apartment_table_sequence START 4 INCREMENT 1;

CREATE TABLE if not exists apartment_table(
    id int8 primary key not null,
    room_count int4,
    price int4,
    total_rating int4,
    address_id int8 references address_table(id)
);

insert into apartment_table(id,room_count,price,total_rating, address_id)
values (1, 4, 20000, null, 3),
       (2, 6, 149900, null, 2),
       (3, 1, 36700, null, 1);
