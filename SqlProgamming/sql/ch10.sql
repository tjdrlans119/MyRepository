--Section 03 Equi Join(=Inner Join)
--조인 대상이 되는 두 테이블에서 공통으로 존재하는 컬럼의 값이
--일치하는 행을 연결하여 결과를 생성하는 조인 방법

--101번 사원의 부서 이름은?
select department_name
from departments d, employees e
where employee_id=101
and d.department_id=e.department_id;
--위 방법과 같게 사용되지만
--아래는 ANSI 방식의 SQL문을 작성하는 방법이다.
--AnSI inner Join 문법
select department_name
from departments d
inner join employees e
on d.department_id=e.department_id
where employee_id=101;
---------------------------------------------
--Sales 부서가 있는 도시는?
SELECT department_name, city
from departments d, locations l
where d.location_id=l.LOCATION_ID
 and department_name='Sales';
 --ANSI Inner join 문법
 SELECT department_name, city
from departments d
inner join locations l
on d.location_id=l.LOCATION_ID
where department_name='Sales';
---------------------------------------------
--101번 사원의 부서 번호와 부서 이름은?
SELECT e.department_id, department_name
 from EMPLOYEES e, DEPARTMENTS d
 where d.department_id = e.department_id
 and EMPLOYEE_ID=101;
--ANSI Inner Join 문법
 SELECT e.department_id, department_name
 from EMPLOYEES e
 inner join DEPARTMENTS d
 on d.department_id=e.department_id
 where EMPLOYEE_ID=101;
---------------------------------------------
--101번 사원의 근무 도시는?
SELECT l.CITY
 from EMPLOYEES e, LOCATIONS l, DEPARTMENTS d
 where e.DEPARTMENT_ID=d.DEPARTMENT_Id 
        and d.LOCATION_ID=l.LOCATION_ID
        and e.EMPLOYEE_ID=101;
--ANSI Inner Join 문법
SELECT l.CITY
 from EMPLOYEES e
  inner join DEPARTMENTS d 
     on e.DEPARTMENT_ID=d.DEPARTMENT_Id
  inner join LOCATIONS l 
     on d.LOCATION_ID=l.LOCATION_ID
 where e.EMPLOYEE_ID=101;
 ---------------------------------------
 --101번 사원의 사번, first_name, 부서번호, 부서이름, 나라, 도시
 select e.EMPLOYEE_ID, e.FIRST_NAME, d.DEPARTMENT_ID, d.DEPARTMENT_NAME, c.COUNTRY_NAME, l.CITY
 from EMPLOYEES e, LOCATIONS l, DEPARTMENTS d, COUNTRIES c
 where e.EMPLOYEE_ID=101
        and e.DEPARTMENT_ID=d.DEPARTMENT_Id 
        and d.LOCATION_ID=l.LOCATION_ID
        and c.COUNTRY_ID=l.COUNTRY_ID;
--ANSI Inner Join
 select e.EMPLOYEE_ID, e.FIRST_NAME, d.DEPARTMENT_ID, d.DEPARTMENT_NAME, c.COUNTRY_NAME, l.CITY
 from EMPLOYEES e
  inner join DEPARTMENTS d
      on e.DEPARTMENT_ID=d.DEPARTMENT_Id
  inner join LOCATIONS l
      on d.LOCATION_ID = l.LOCATION_ID
  inner join COUNTRIES c
      on l.COUNTRY_ID = c.COUNTRY_ID
where e.EMPLOYEE_ID=101;

--Section 04 Self join(=Inner Join)
--101번 사원의 관리자 이름은?
select e2.first_name
from employees e1, employees e2
where e1.manager_id = e2.employee_id
      and e1.employee_id=101;
---------------------------------------------
--5.3 ANSI outer Join
create table member(
mid varchar(10) primary key,
mname varchar(10) not null
);

create table board(
bno number(5) primary key,
btitle varchar(100) not null,
bwriter varchar(10) references member(mid)
);

insert into member values('user1','사용자1');
insert into member values('user2','사용자2');
insert into member values('user3','사용자3');
insert into member values('user4','사용자4');
insert into member values('user5','사용자5');

insert into board values(1,'제목1','user1');
insert into board values(2,'제목2','user2');
insert into board values(3,'제목3','user3');

--게시물을 한번도 작성하지 않은 멤버의 mid, mname 는?
SELECT mid, mname, bno, btitle
from member
LEFT outer join board
on board.BWRITER = member.MID;
--board에는 잇고 member에는 없는건 null처리된다.
SELECT mid, mname, bno, btitle
from member
right outer join board
on board.BWRITER = member.MID;
---left outer join
SELECT mid, mname, bno, btitle
from member
LEFT outer join board
on board.BWRITER = member.MID
where bno is null;
---Right outer join
SELECT mid, mname, bno, btitle
from board
RIGHT outer join member
on board.BWRITER = member.MID
where bno is null;
--left Outter Join
SELECT mid, mname, bno, btitle
from member,board
where member.mid=board.bwriter(+);
--Right Outter Join
SELECT mid, mname, bno, btitle
from board,member
where board.bwriter(+)=member.mid;

--Full Outter Join
SELECT mid, mname, bno, btitle
from member
FULL outer join board
on board.BWRITER = member.MID;
-----------------------------------








