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

