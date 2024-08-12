create database foodcourt;
use foodcourt;

create table corner(
corner_id varchar(6) primary key,
corner_name varchar(20) not null
);

create table menu(
menu_id varchar(6) primary key,
menu_name varchar(20) not null,
price integer not null,
corner_id varchar(6),
foreign key (corner_id) references corner(corner_id)
);

create table orders(
order_id varchar(6),
menu_id varchar(6),
cnt integer not null,
order_date datetime,
order_status char(1) null, -- 접수중, 픽업대기, 픽업완료
saleprice integer,
foreign key(menu_id) references menu(menu_id),
primary key(order_id, menu_id, order_date)
);

