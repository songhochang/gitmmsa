-- DB : highschool

create database HighSchool;
use HighSchool;

create table student (
s_id integer auto_increment primary key,
s_year char(4) not null,
s_grade integer(2) not null,
s_class integer(2) not null,
s_num integer(2) not null,
s_name varchar(20) not null,
s_pass varchar(20) not null default '0000'
);

create table teacher (
t_id varchar(15) primary key,
t_pass varchar(20) not null,
t_name varchar(20) not null,
t_subject varchar(20) not null,
t_type int(1) null default 9
);

create table lesson (
l_id integer auto_increment primary key,
t_id varchar(15) not null,
l_name varchar(30) not null,
l_year char(4) not null,
l_grade varchar(2) not null,
l_semester char(1) not null,
-- l_class varchar(2) null,
l_day char(1) not null,
l_time varchar(2) not null,
l_room varchar(20) null,
foreign key(t_id) references teacher(t_id)
);

create table s_list (
s_id integer not null,
l_id integer not null,
primary key (s_id, l_id),
foreign key(s_id) references student(s_id),
foreign key(l_id) references lesson(l_id)
);

create table test (
t_id integer auto_increment primary key,
t_title varchar(100) not null,
t_type char(1) not null,
t_content tinytext not null,
t_standard varchar(100) null,
t_startdate date not null,
t_enddate date not null,
l_id integer not null,
foreign key(l_id) references lesson(l_id)
);

create table result (
r_id integer auto_increment primary key,
s_id integer not null,
t_id integer not null,
r_score integer not null,
r_stat char(1) null,
r_enddate date null,
foreign key(s_id) references student(s_id),
foreign key(t_id) references test(t_id)
);