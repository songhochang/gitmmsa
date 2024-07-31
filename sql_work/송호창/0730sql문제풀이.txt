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