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