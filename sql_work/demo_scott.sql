use madangdb;

drop table emp;
drop table dept;
drop table salgrade;

CREATE TABLE IF NOT EXISTS DEPT (
  DEPTNO integer NOT NULL,
  DNAME varchar(14),
  LOC varchar(13),
  PRIMARY KEY (DEPTNO)
);

INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(40, 'OPERATIONS', 'BOSTON');

CREATE TABLE IF NOT EXISTS EMP (
  EMPNO integer NOT NULL PRIMARY KEY,
  ENAME varchar(10),
  JOB varchar(9),
  MGR integer,
  HIREDATE date,
  SAL integer,
  COMM integer,
  DEPTNO integer,
  FOREIGN KEY (DEPTNO) REFERENCES Dept(DEPTNO)
);

INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17 00:00:00', 800, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20 00:00:00', 1600, 300, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22 00:00:00', 1250, 500, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02 00:00:00', 2975, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28 00:00:00', 1250, 1400, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01 00:00:00', 2850, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09 00:00:00', 2450, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17 00:00:00', 5000, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08 00:00:00', 1500, 0, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23 00:00:00', 1100, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03 00:00:00', 950, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23 00:00:00', 1300, NULL, 10);

CREATE TABLE IF NOT EXISTS SALGRADE(
	GRADE INTEGER,
	LOSAL INTEGER,
	HISAL INTEGER
	);

INSERT INTO SALGRADE VALUES (1, 700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

select * from EMP;

-- 1) 사원의 이름과 직위를 출력하세요. 단 사원의 이름은 '사원이름', 직위는 '사원직위' 머리글이 나오도록 출력하세요
select ENAME '사원이름', JOB '사원직위'
from EMP;

-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력하세요
select ENAME '사원이름', SAL '급여'
from EMP
where DEPTNO = 30;

-- 3) 사원번호와 이름, 현재 급여, 증가한 급여분('증가액'), 10% 인상된 급여('인상된 급여')를 사원번호순 출력
select EMPNO '사원번호', ENAME '사원이름', SAL '급여', SAL*0.1 '증가액', SAL+SAL*0.1 '인상된 급여'
from EMP
order by EMPNO;

-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요
select ENAME '사원이름', DEPTNO '부서번호'
from EMP
where ENAME like 'S%';

-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여 출력 열이름('MAX', 'MIN', 'SUN', 'AVG') 소수점 이하는 반올림해서 정수로 출력
select max(SAL) 'MAX', min(SAL) 'MIN', sum(SAL) 'SUM', round(avg(SAL)) 'AVG'
from EMP;

-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력 열이름('업무', '업무별 사원수')

-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력
select max(SAL) 'MAX', min(SAL) 'MIN', max(SAL)-min(SAL) '차액'
from EMP;

-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계화 평균 츌력
select count(*) '구성원 수', sum(SAL) '급여 합계', round(avg(SAL)) '평균'
from EMP
where DEPTNO = 30;

-- 9) 평균 급여가 가장 높은 부서의 번호를 출력


-- 10) 세일즈맨을 제외하고 업무별 사원의 급여가 3,000 이상인 업무에 대해서 업무명과 업무별 평균 급여 출력 평균급여는 내림차순


-- 11) 전체 사원 가운데에 직속상관이 있는 사원의 수를 출력하세요
select count(*)
from EMP
where MGR is not null;

-- 12) EMP 테이블에서 이름, 급여, 커미션 금액, 총액을 구하여 총액이 많은 순서대로 출력(커미션이 null인 사람은 제외)
select ENAME '이름', SAL '급여', COMM '커미션', SAL+COMM '총액'
from EMP
where COMM is not null
order by SAL+COMM desc;

-- 13) 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요


-- 14) 사원이 한 명도 없는 부서의 이름을 출력하시오
select DNAME
from DEPT, EMP
where (DEPT.DEPTNO = EMP.DEPTNO);