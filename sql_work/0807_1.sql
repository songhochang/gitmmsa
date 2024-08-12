-- 1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.
select count(*)
from employees;
select count(*)
from departments;

-- 2. Employees 테이블에 대한 employee_id, last_name, job_id, hire_date를 출력하세요.
select employee_id, last_name, job_title, hire_date
from employees, jobs
where employees.job_id = jobs.job_id;

-- 3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.
select last_name, salary
from employees
where salary >= 12000;

-- 4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 department_id를 last_name에 대하여 오름차순으로 출력하세요.
select last_name, department_name
from employees, departments
where (employees.department_id = 20 or employees.department_id = 50) and (employees.department_id = departments.department_id)
order by last_name;

-- 5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.
select last_name
from employees
where last_name like '__a%';

-- 6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
select count(*), job_id
from employees
group by job_id
having count(*) >= 2;

-- 7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.
select max(salary), min(salary), max(salary)-min(salary)
from employees;

-- 8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.
select e.last_name, j.job_title, d.department_id, d.department_name
from employees e, jobs j, departments d, locations l
where e.job_id = j.job_id and e.department_id = d.department_id and d.location_id = l.location_id and l.city = 'Toronto';

-- 1. 성(last name)이 Matos와 Taylor인 직원의 성, 직무 ID(job_id), 시작 날짜(start date)를 출력하는 보고서를 작성하세요. 쿼리를 시작 날짜 기준 오름차순으로 정렬하세요.
select e.last_name, e.job_id, e.hire_date
from employees e
where e.last_name = 'Matos' or e.last_name = 'Taylor'
order by e.hire_date;

-- 2. 1994년에 고용된 모든 직원의 성(last name)과 해고 날짜(hire date)를 출력하는 보고서가 인사부서에 필요합니다. ***
select e.last_name, e.hire_date
from employees e
where date_format(hire_date, '%Y') = '1994';
 
-- 3. 직무가 영업 대표(sales representative) 또는 재고 사원(stock clerk)인 모든 직원의 성(last name), 직무(job), 급여(salary)를 출력하며, 급여가 $2,500, $3,500 또는 $7,000가 아닌 직원들을 포함하세요.
 
 
-- 4. 매니저 수를 나열하지 않고 구하세요. 열 이름을 '매니저 수(Number of Managers)'로 표시하세요.
 
-- 5. 매니저의 번호(manager number)와 해당 매니저 밑에서 가장 낮은 급여를 받는 직원의 급여를 출력하는 보고서를 작성하세요. 매니저가 알려지지 않은 경우와 최소 급여가 $6,000 이하인 그룹은 제외하세요. 출력 값을 급여 내림차순으로 정렬하세요.

-- 6. 직원의 성(last name)과 직원 번호(employee number), 그리고 그들의 매니저의 성(last name)과 매니저 번호(manager number)를 함께 출력하는 보고서를 작성하세요. 열 이름은 각각 'Employee', 'Emp#', 'Manager', 'Mgr#'로 표시하세요.

-- 7. 주어진 직원과 같은 부서에서 일하는 모든 직원의 성(last name), 부서 번호(department number)를 출력하는 보고서를 인사부서에 작성하세요.
 
-- 8. 임원 부서(Executive department)에 있는 모든 직원의 부서 번호(department number), 성(last name), 직무 ID(job_id)를 출력하는 보고서를 작성하세요.

-- 9. King에게 보고하는 모든 직원의 성(last name)과 급여(salary)를 출력하는 보고서를 작성하세요.
 
-- 10. 'ST_CLERK' 직무 ID를 포함하지 않는 부서의 부서 ID 목록이 인사부서에 필요합니다.


select * from emp_details_view;

-- 0808

-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
select *
from employees
where length(first_name) + length(last_name) >= 8;

-- 2. 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.
select *
from employees
where substr(first_name, 1, 1) between 'A' and 'Z';

-- 3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
select concat(first_name, last_name), length(concat(first_name, last_name))
from employees
where last_name like '_c%';

-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역을 출력하세요.
select street_address
from locations
where length(trim(street_address)) in (select min(length(trim(street_address))) from locations);

-- 5. 이름이 'A', 'J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.
select concat(first_name, last_name), length(concat(first_name, last_name))
from employees
where substr(first_name, 1, 1) in ('A', 'J', 'M');

-- 1. 1987년에 입사한 사원의 이름을 출력하세요.
select concat(first_name, last_name), hire_date
from employees
where date_format(hire_date, '%Y') = 1987;

-- 2. 사원의 이름, 입사년도, 근무년수를 출력하세요.
select concat(first_name, last_name), hire_date, timestampdiff(year, hire_date, curdate())
from employees;

-- 3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.
select concat(first_name, last_name), hire_date
from employees
where hire_date between '1987-06-01' and '1987-07-30';

-- 4. 6월에 입사한 사원의 이름과 성을 출력하세요.
select first_name, last_name, hire_date
from employees
where date_format(hire_date, '%m') = 6;

-- 5. 부서별, 연도별 입사한 사원의 수를 구하세요. 
select count(*), department_id
from employees
group by department_id;
select count(*), hire_date
from employees
group by date_format(hire_date, '%Y')
order by hire_date;

-- 1. 사원정보(employees) 테이블에서 사원번호, 이름, 급여, 업무, 입사일, 상사의 사원번호를 출력하세요.
-- 단, 이름은 성과 이름을 연결하여 Name이라는 별칭으로 출력하세요. (107행)
select employee_id

-- 2. 사원정보(employees) 테이블에서 사원의 성과 이름은 Name, 업무는 Job, 급여는 Salary, 연봉에 $100 보너스를 추가하여 
-- 계산한 값은 Increased Ann_Salary, 급여에 $100 보너스를 추가하여 계산한 연봉은 Increased Salary라는 별칭으로 출력하세요.
-- (107행)


-- 3. 사원 정보(employees) 테이블에서 모든 사원의 이름(last_name)과 연봉을 '이름: 1 Year Salary = $연봉'형식으로 출력하고, 
-- 1 Year Salary라는 별칭을 붙여 출력하세요. (107행)

-- 4. 부서별로 담당하는 업무를 한 번씩만 출력하세요. (20행)

-- 5. 사원 정보(employees) 테이블에서 급여가 $7,000 ~ $10,000 범위 이외인 사람의 성과 이름(Name으로 별칭) 및 급여를 
-- 급여가 작은 순서대로 출력하세요. (75행)

-- 6. 사원의 성 (last_name) 중에 'e' 및 'o'글자가  포함된 사원을 출력하세요.  이때 머리글은 e AND o Name이라고 출력하세요. (10행)

-- 7. 현재 날짜 타입을 날짜 함수를 통해 확인하고, 1995년 5월 20일부터 1996년 5월 20일 사이에 고용된 사원들의 이름(Name으로 별칭), 
-- 사원번호, 고용일자를 출력하세요. 단 입사일이 빠른 순으로 정렬하세요. (8행)

-- 8. 수당을 받는 모든 사원의 성과 이름(Name으로 별칠), 급여(salary), 업무, 수당률(commission_pct)을 출력하세요. 
-- 급여가 큰 순서대로 정렬하되, 급여가 같으면 수당률이 큰 순서대로 정렬하세요. (35행)

-- 9. 60번 IT부서 사원의 급여를 12.3% 인상하여 정수만(반올림) 표시하여 출력하세요. 출력형식은 사번, 이름과 성(Name으로 별칭), 급여,
-- 인상된 급여(Increased Salary로 별칭)순으로 출력하세요. (5행)

-- 10. 이름이 's'로 끝나는 각 사원의 이름과 업무를 다음의 예시와 같이 출력하세요. (예시 : Sigal Tobias is a PU_CLERK)
-- 출력 시 성과 이름은 첫 글자를 대문자로, 업무는 모두 대문자로 출력하고 머리글은 Employee JOBs로 표시하세요. (18행)