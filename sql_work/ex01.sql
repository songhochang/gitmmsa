INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구 아는 여자', '나무수', 13000);
insert into Book values(3, '축구의 이해', '대한미디어', 22000);
insert into Book values(4, '골프 바이블', '대한미디어', 35000);
insert into Book values(5, '피겨 교본', '굿스포츠', 8000);
insert into Book values(6, '배구 단계별기술', '굿스포츠', 6000);
insert into Book values(7, '야구의 추억', '이상미디어', 20000);
insert into Book values(8, '야구를 부탁해', '이상미디어', 13000);
insert into Book values(9, '올림픽 이야기', '삼성당', 7500);
insert into Book values(10, 'Olympic Champions', 'Pearson', 13000);

insert into Customer values(1, '박지성', '영국 맨체스타', '000-5000-0001');
insert into Customer values(2, '김연아', '대한민국 서울', '000-6000-0001');
insert into Customer values(3, '김연경', '대한민국 경기도', '000-7000-0001');
insert into Customer values(4, '추신수', '미국 클리블랜드', '000-8000-0001');
insert into Customer values(5, '박세리', '대한민국 대전', NULL);

INSERT INTO Orders VALUES (1, 1, 1, 6000, STR_TO_DATE('2024-07-01','%Y-%m-%d'));
INSERT INTO Orders VALUES (2, 1, 3, 21000, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Orders VALUES (4, 3, 6, 6000, STR_TO_DATE('2024-07-04','%Y-%m-%d'));
INSERT INTO Orders VALUES (5, 4, 7, 20000, STR_TO_DATE('2024-07-05','%Y-%m-%d'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, STR_TO_DATE('2024-07-07','%Y-%m-%d'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, STR_TO_DATE( '2024-07-07','%Y-%m-%d'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, STR_TO_DATE('2024-07-08','%Y-%m-%d'));
INSERT INTO Orders VALUES (9, 2, 10, 7000, STR_TO_DATE('2024-07-09','%Y-%m-%d'));
INSERT INTO Orders VALUES (10, 3, 8, 13000, STR_TO_DATE('2024-07-10','%Y-%m-%d'));

select * from Book;
select bookname, publisher from Book;

select * from Orders;

select bookname, publisher from Book where bookname Like '%축구%';
select bookname, publisher from Book where bookname like '축구의 역사';
select bookname, publisher from Book where bookname like '축구%';
select bookname, publisher from Book where bookname like '%축구';
select bookname, publisher from Book where bookname like '축구';

select name, phone from Customer where name Like '%김연아%';
select phone from customer where name like '%김연아%';
select name, phone from customer where address like '%서울%';
select name, phone from customer where address like '%대한민국%';
select name, phone from customer where custid like '1';
select name, phone from customer where custid like '2';
select name, phone from customer where custid like '3';
select name, phone from customer where custid like '4';
select name, phone from customer where custid like '5';
select name, phone, custid from customer where address like '%대한민국%';

select * from book;
select * from orders;

select bookname, publisher from book where price >= 10000;
select bookname, publisher, price from book where price >= 10000;

select bookname, publisher from book where price >= 10000 and price <= 20000;
select bookname, publisher, price from book where price >= 10000 && price <=20000;

select publisher
from book;

select distinct publisher
from book;

select name
from customer
where phone is null;

select name
from customer
where phone is not null;

select bookname
from book
where (publisher like '굿스포츠') and (price between 10000 and 19999);

select *
from book
where publisher = '굿스포츠' and price between 10000 and 19999;

select *
from book
where publisher = '굿스포츠';

select *
from book
where publisher = '굿스포츠' or publisher = '대한미디어';

select *
from book
where publisher like '굿스포츠' or publisher like '대한미디어';

select *
from book
where publisher in ('굿스포츠', '대한미디어');

select *
from book
where publisher not in ('굿스포츠', '대한미디어');

select *
from book
where bookname like '_구%';

update book
set bookname = '그 여자의 축구'
where bookid = 2;

select * from book;

select *
from book
where bookname like '_구%';

delete from book
where bookid = 2;

select *
from book
order by bookname asc;

select *
from book
order by bookname desc;

select *
from book
order by price asc;

select *
from book
order by price desc;

select *
from book
order by price;

select *
from book
order by price, bookname;

select *
from book
order by price;

select count(saleprice)
from orders;

select sum(saleprice)
from orders;

select max(saleprice)
from orders;

select sum(saleprice) as Total,
avg(saleprice) as Average,
min(saleprice) as Minimum,
max(saleprice) as Maximum
from orders;

select custid,
count(saleprice) as '총수량',
sum(saleprice) as '총판매액'
from orders group by custid;

select *
from customer;

select *
from orders
where saleprice >= 8000
order by custid;

select custid, count(*)
from orders
where saleprice >= 8000
group by custid;

select * from customer, orders
where customer.custid = orders.custid;

select name, saleprice
from customer, orders
where customer.custid = orders.custid;

select name, count(*) as '도서수량'
from customer, orders
where (saleprice >= 8000) and customer.custid = orders.custid
group by customer.name;

select customer.name, book.bookname
from customer, book, orders
where (customer.custid = orders.custid) and (book.bookid = orders.bookid)
order by book.bookname;

select customer.name, book.bookname
from customer, book, orders
where (customer.custid = orders.custid) and (book.bookid = orders.bookid) and (book.price >= 20000)
order by book.bookname;
-- 1
select bookname
from book
where bookid = 1;
-- 2
select bookname
from book
where price >= 20000;
-- 3
select customer.name, sum(saleprice)
from customer, orders
where (customer.name = '박지성') and (customer.custid = orders.custid);
-- 4
select customer.name, count(bookid)
from customer, orders
where (customer.name = '박지성') and (customer.custid = orders.custid);
-- 5
select customer.name, count(publisher)
from customer, orders, book
where (customer.name = '박지성') and (customer.custid = orders.custid) and (book.bookid = orders.bookid);
-- 6
select customer.name, book.bookname, book.price, book.price - orders.saleprice as '정가 - 판매가'
from customer, orders, book
where (customer.name = '박지성') and (customer.custid = orders.custid) and (book.bookid = orders.bookid);
-- 7
select book.bookname
from orders, book, customer
where (customer.name != '박지성') and (customer.custid = orders.custid) and (book.bookid = orders.bookid);
-- 8
select count(bookname)
from book;
-- 9
select count(distinct publisher)
from book;
-- 10
select name, address
from customer;
-- 11
select book.bookname
from orders, book
where (orderdate between ('24-07-04') and ('24-07-07')) and (book.bookid = orders.bookid);
-- 12
select name, address
from customer
where name like ('김%');
-- 13
select name, address
from customer
where name like ('김%') and name like ('%아');
-- 14
select sum(saleprice), avg(saleprice)
from orders;
-- 15
select customer.name, sum(saleprice)
from customer, orders
where (customer.custid = orders.custid)
group by customer.name;
-- 16
select customer.name, book.bookname
from customer, orders, book
where (customer.custid = orders.custid) and (book.bookid = orders.bookid)
order by customer.name;

-- 가장 비싼 도서의 이름
select bookname from book
where price = (select max(price) from book);

-- 도서를 구매한 이력이 있는 고객명 서브쿼리
select name from customer
where custid in (select distinct custid from orders);
-- 도서를 구매한 이력이 있는 고객명 join
select distinct customer.name
from customer, orders
where customer.custid = orders.custid;

select book.bookname
from orders, book, customer
where (customer.name != '박지성') and (customer.custid = orders.custid) and (book.bookid = orders.bookid);

select book.bookname
from orders, book, customer
where (customer.name <> '박지성') and (customer.custid = orders.custid) and (book.bookid = orders.bookid);

select book.bookname
from orders, book, customer
where (customer.name not in ('박지성')) and (customer.custid = orders.custid) and (book.bookid = orders.bookid);

select customer.name, book.publisher
from customer, orders, book
where (customer.custid = orders.custid) and (book.bookid = orders.bookid);

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름 ... join
select name
from customer, orders, book
where (book.publisher = '대한미디어') and (customer.custid = orders.custid) and (book.bookid = orders.bookid); 
-- 대한미디어에서 출판한 도서를 구매한 고객의 이름 ... 서브쿼리
select customer.name
from customer
where custid in (select custid from orders where bookid in (select bookid from book where publisher = '대한미디어'));

select C.name, B.bookname
from customer C, book B, orders O
where C.custid = O.custid and B.bookid = O.bookid
order by C.name;

select C.name, B.bookname
from book B, customer C
where (C.custid, B.bookid) in (select custid, bookid from orders)
order by C.name;

select C.name, B.bookname
from customer C, book B
where C.custid in (select custid from orders) and B.bookid in (select bookid from orders)
order by C.name;

select name
from customer
group by name
having count(name) >= 2;

SELECT YEAR(orderdate), COUNT(*) as Amount
FROM Sales.Orders
GROUP BY YEAR(orderdate) 
HAVING Amount>1;

-- 대한민국에 거주하시는 고객리스트 출력
select name
from customer
where address like '대한민국%';

-- 도서를 주문한 고객리스트 출력 -> 서브쿼리 사용
select name
from customer
where custid in (select custid from orders);

-- 대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 출력하세요
select name
from customer
where address like '대한민국%'
union
select name
from customer
where custid in (select custid from orders);

select name
from customer
where address like '대한민국%'
union all
select name
from customer
where custid in (select custid from orders);

select name
from customer
where address like '대한민국%'
union
select address
from customer
where custid in (select custid from orders);

select *
from customer
union all
select *
from book;

select name, address
From customer cs
where exists (select * from orders od where cs.custid = od.custid);

create table NewBook (
bookid integer primary key,
bookname varchar(20),
publisher varchar(20),
price integer
);

-- code table
-- id_1 : 대분류
-- id_2 : 중분류
-- id_3 : 소분류
-- msg : 출력될 내용
create table tblCode(
id_1 char(2) not null,
id_2 char(2) not null,
id_3 char(2) not null,
msg varchar(60) not null,
primary key (id_1, id_2, id_3)
);

create table NewCustomer(
custid integer primary key,
name varchar(40),
address varchar(40),
phone varchar(30)
);

create table NewOrders (
orderid integer,
custid integer not null,
bookid integer not null,
saleprice integer,
orderdate date
);

drop table NewOrders;

create table NewOrders (
orderid integer,
custid integer not null,
bookid integer not null,
saleprice integer,
orderdate date,
primary key(orderid), foreign key(custid) references NewCustomer(custid) on delete CASCADE);

drop table tblcode;

describe newbook;
-- 추가
alter table NewBook add isbn varchar(13);

describe newbook;
-- 수정
alter table newbook modify isbn integer;
-- 삭제
alter table newbook drop isbn;
-- 수정
alter table newbook modify bookname varchar(20) not null;

alter table newbook add primary key (bookname, publisher);

drop table newbook;

-- delete from newbook where bookid = '1';

insert into Book(bookid, bookname, publisher, price)
values (11, '스포츠 의학', '한솔의학서적', 90000);

select name, publisher
from customer, book, orders
where (customer.custid = orders.custid) and (book.bookid = orders.bookid);

-- 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select name
from customer
where custid in (select custid from orders where bookid in (select bookid from book where publisher = (select publisher from book where bookid = '1')));

-- 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name, count(distinct publisher) as C_publisehr
from customer, orders, book
where customer.custid = orders.custid and book.bookid = orders.bookid
group by name
having C_publisher >= 2;

select bookname
from orders, book
where book.bookid = orders.bookid
order by bookname;

-- 전체 고객의 30%이상이 구매한 도서
select bookname, count(name) as C_name
from customer, orders, book
where customer.custid = orders.custid and book.bookid = orders.bookid
group by bookname
having C_name > 1;

select abs(-18), abs(+18);

select round(3.141592, 2);
select round(3.151592);
select round(6);

select avg(saleprice)
from orders;

select name, avg(saleprice)
from customer, book, orders
where customer.custid = orders.custid and book.bookid = orders.bookid
group by name;

select round(avg(saleprice)/1000) * 1000
from orders;

select name, round(avg(saleprice)/100)*100
from customer, book, orders
where customer.custid = orders.custid and book.bookid = orders.bookid
group by name;

select concat('마당', '서점');

select lower('MR.SCOTT');

select lpad('Page 1', 10, "*");

select replace('jack & jue', 'j', 'bl');

select substr('ABCDEFG', 3, 4);

-- 도서 제목에 야구가 포홤된 도서를 농구로 변경한 후 도서 목록 출력
select bookid, replace(bookname, '야구', '농구')
from book;

-- 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 출력
select bookname, char_length(bookname), length(bookname)
from book
where publisher = '굿스포츠';

-- 마당서점의 고객 중에서 성이 같은 사람이 몇명이나 되는지 알고 싶다
select substr(name,1,1) '성', count(*) '인원'
from customer
group by 성;

select adddate('2024-07-01', interval -5 day) before5,
adddate('2024-07-01', interval 5 day) after5;

-- 마당서점은 주문일로부터 10일 후에 매출을 확정한다. 각 주문의 확정일자를 구하세요
select orderdate '주문일', adddate(orderdate, interval 10 day) '주문 확정일'
from orders;

-- 2024년 7월 7일 주문받은 도서를 모두 나타내시오, 단 주문일은 240704 형태로
select orderid '주문번호', date_format(orderdate, '%y%m%d') '주문날짜', custid '고개ID', bookid '책ID'
from orders
where orderdate = str_to_date('2024-07-07', '%Y-%m-%d');
-- 2024년 7월 7일 주문받은 도서를 모두 나타내시오, 단 주문일은 jul 04 2024 형태로
select orderid '주문번호', date_format(orderdate, '%b %d %Y') '주문날짜', custid '고개ID', bookid '책ID'
from orders
where orderdate = str_to_date('2024-07-07', '%Y-%m-%d');
-- 2024년 7월 7일 주문받은 도서를 모두 나타내시오, 단 주문일은 24-07-04 thu 형태로
select orderid '주문번호', date_format(orderdate, '%y-%m-%d %a') '주문날짜', custid '고개ID', bookid '책ID'
from orders
where orderdate = str_to_date('2024-07-07', '%Y-%m-%d');

create view Vorders
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
from Customer C, Orders O, Book B
where C.custid = O.custid and B.bookid = O.bookid;

select * from Vorders;

drop view vw_Customer;

-- 대한민국에 거주하는 고객들로 구성된 뷰를 생성후 조회
create view vw_Customer
as select *
from customer
where address like ('%대한민국%');

select * from vw_Customer;

drop view vw_Orders;

-- orders 테이블에서 고객명과 도서명을 확인 할 수 있는 뷰를 생성후 김연아 고객이 구입한 도서의 주문번호, 도서명, 주문액을 출력
create view vw_Orders
as select name, bookname, orderid, saleprice
from Customer, Orders, Book
where Customer.custid = Orders.custid and Book.bookid = Orders.bookid;

select orderid '주문번호', bookname '도서명', saleprice '주문액'
from vw_Orders
where name = '김연아';

select count(phone)
from customer;

create table Mybook (
bookid integer primary key,
price integer null
);

insert into Mybook(bookid, price) values('1', '10000');
insert into Mybook(bookid, price) values('2', '20000');
insert into Mybook(bookid, price) values('3', null);
insert into Mybook(bookid) values(4);

select *
from Mybook;

select price+100
from Mybook
where bookid = 3;

select sum(price), avg(price), count(*), count(price)
from Mybook;

select sum(price), avg(price), count(*), count(price)
from Mybook
where bookid >= 4;

select *
from Mybook
where price is null;

select count(*) from mybook
where price is null;

select * from mybook
where price = 0;

select name '이름', ifnull(phone, '연락처없음') '연락처'
from customer;

select bookid '책ID', ifnull(price, '가격미입력') '가격'
from mybook;

select count(*), count(price) from mybook;
select sum(price) from mybook;