create database MadangUniversity;
use madanguniversity;

create table professor (
p_ssn varchar(20) not null,
p_name varchar(40) not null,
p_age integer null,
p_rank varchar(20) not null,
speciality varchar(20) not null,
primary key (p_ssn)
);

create table department (
dno integer primary key,
dname varchar(40) not null,
office varchar(10) not null,
p_ssn varchar(20) not null,
foreign key(p_ssn) references professor(p_ssn)
);

create table graduate (
g_ssn varchar(20) primary key,
g_name varchar(40) not null,
g_age integer null,
deg_prog char(4) not null,
dno integer not null,
advisor varchar(20) null,
foreign key(dno) references department(dno),
foreign key(advisor) references graduate(g_ssn)
);

create table project (
pid integer primary key,
sponsor varchar(30) null,
start_date date not null,
end_date date not null,
budget varchar(20) not null,
manager varchar(20) not null,
foreign key(manager) references professor(p_ssn)
);

create table work_dept (
p_ssn varchar(20) not null,
dno integer not null,
pct_time integer not null,
primary key (p_ssn, dno),
foreign key(p_ssn) references professor(p_ssn),
foreign key(dno) references department(dno)
);

create table work_in(
pid integer not null,
p_ssn varchar(20) not null,
foreign key(pid) references project(pid),
foreign key(p_ssn) references professor(p_ssn),
primary key(pid, p_ssn)
);

create table work_prog(
pid integer not null,
g_ssn varchar(20) not null,
foreign key(pid) references project(pid),
foreign key(p_ssn) references graduate(g_ssn),
primary key(pid, g_ssn)
);

show databases;
use mysql;
show tables;
describe user;

create user madang@localhost identified by '12345678';

create user mdguest@localhost identified by 'mdguest';

select * from user;

drop user mdguest@localhost;

create user mdguest2 identified by 'mdguest2';

grant all privileges on madanguniversity.* to madang@localhost with grant option;
flush privileges;
show grants for madang@localhost;