------테이블 생성과, 추가는 맨 아래 에 있습니다.------
--------------------------------------------------
------------------1장-----------------------------
--1번: 테이블
--2번: 로우,컬럼
--3번: select
--4번: DML
--5번: DDL
--6번: DCL
--7번: SQL
--8번: SQL*PLUS
--9번: 4.UNIQUE(유일무이값만 저장)
--------------------------------------------------

------------------2장-----------------------------
--1번: 3.LIKE
--2번: 3.BETWEEN
--3번: 2.OR
--4번: 2.WHERE
--5번: 1.ORDER BY
--6번: 1.IS NULL
--7번: ORDER BY EMPNO DESC
--8번: DISTINCT
--------------------------------------------------

------------------3장-----------------------------
---1번
SELECT * from emp where mod(empno,2) = 1;
---2번
SELECT hiredate,
substr(hiredate,0,2) 년도,
substr(hiredate,4,2) 월,
substr(hiredate,7,2) 일
from emp;
--3번
SELECT trunc(sysdate-hiredate) 근무일수 FROm emp;
--4번
SELECT empno, ename, NVL(to_char(mgr,'9999'),'ceo')as "직속 상관"
from emp
where mgr is null;
--5번 :DUAL
--6번
SELECT sysdate+100 from dual;
--7번 
SELECT LAST_DAY(SYSDATE) 마지막날 from dual;
--8번 NVL2(COMM,   SAL+COMM, SAL) : COMM을 검사하여
------그 결과가 null이 아니면 sla+comm을 ,
------null 이면 sal 을 반환하라.
--9번: case
--10번: sysdate
--------------------------------------------------

------------------4장-----------------------------
--1번: 3.groupby:그룹별로 구분
--2번: 1.having:특정조건을 기술
--3번: 3.그룹 함수 중 sum()을 제외한 모든 함수가 null값을 무시(x)
--4번: having
--5번: 1.max
--6번: case: 여러경우중 하나선택
--7번:
select count(*)
from emp
where comm is not null;
--8번
select max(hiredate)입사일, min(hiredate)입사일 
from emp;
--9번
select job, SUM(sal)
from emp
group by job
having sum(sal) >= 300;
--------------------------------------------------

------------------5장-----------------------------
--1번: 2.E-R모델
--2번: 2.
--3번: 4.속성
--4번: 4.일대일,일대다 관계만 표현(x)
--5번: 3. 부모관계
--6번: 1.엔티티집합-직사각형(x)
--7번: 3.직사각형(엔티티)
--------------------------------------------------

------------------7장-----------------------------
--1번: 2.modify(컬럼 속성수정)
--2번: 1.alter table(구조변경)
--3번: DDL(Data Defintion Language) 테이블의 구조 자체를생성,수정,제어하는 명령문
------ALTER, DROP, create, 등등
--------------------------------------------------

------------------8장-----------------------------
--1번: 3.insert into department values(60,'생산부','포천')
--2번: 1.insert into department(deptno,dname) values(70,'총부무')
--3번: 3.where
--4번: 2.commit
--5번: 3.update...to...where
--6번: 3.트랜잭션
--7번: DML(Data Manipulation Lanage) 데이터를입력,수정,조회,삭제 등등
--------------------------------------------------

------------------9장-----------------------------
--1번: 1.null
--2번: 2.디폴트 constraints는 컬럼당 하나 이상 사용할 수 있다.
--3번: 2.foreign key
--------------------------------------------------

------------------10장-----------------------------
--1번: 4. equi join이다.
--2번: 1. 어떤 ename을 출력하는지 모호하다
--3번: 3. alias를사용하지 않아도 된다(x)
--4번: 1.
--5번: 1.equi join(공통존재하는 컬럼의 값이 일치되는 행을 연결)
--6번: 3.innerJoin
--7번: 4.세개 이상의 테이블은 조인할 수 없다.(x)
--8번: 4.where가아니라 on이다.
--9번: 1.
--10번: 2.innerjoin을 사용하면 성능이 저하된다.
--11번: 
select e.ename, e.deptno, d.dname
from emp e
inner join dept d
 on e.deptno=d.deptno;
--12번
select e.ename, e.hiredate
from emp e, dept d
where e.deptno=d.deptno
and d.dname='경리부';
--13번
select e.ename, d.dname
from emp e, dept d
where e.deptno=d.deptno
and e.job='과장';
--14번
select work.ename, work.job
from emp work, emp manager
where work.mgr=manager.empno
and manager.ename='감우성';
--15번
select work.ename, friend.ename
from emp work, emp friend
where work.deptno=friend.deptno
and work.ename='감우성'
and friend.ename <> '감우성';
--------------------------------------------------

------------------11장-----------------------------
--1번: 2.
--2번: 3.
--3번: 3.=
--4번: 4.gtou by문(x)
--5번: 3.deptno
--6번: 4.
--7번: 
create table emp06 as
select * from emp where 1=1;
--8번
SELECT ename, sal
from emp
where sal > any(select sal from emp where job='과장')
and job!='과장';
--9번
update EMP06
SET sal = sal+100
where deptno=(select deptno from dept where loc='인천');
select * from emp06;
--10번
delete from EMP06
where deptno = (select deptno
                from dept
                where dname='경리부');
SELECT * FROM emp;
--11번
select e.ename,e.deptno
from emp e
where e.deptno=(select deptno from emp where ename='이문세')
and ename!='이문세';
--12번
select *
from emp
where job=(select job from emp where ename='이문세')
and ename!='이문세';
--13번
select ename, sal
from emp
where sal>=(select sal from emp where ename='이문세')
and ename!='이문세';
--14번
select ename, deptno
from emp
where deptno=(select dept.deptno from dept where loc='인천');
--15번
select ename, sal, mgr
from emp
where mgr=(select empno from emp where ename='감우성');
--16번
SELECT empno, ename, sal, deptno
from emp
where sal in(SELECT max(sal) from emp GROUP by deptno);
--17번
select DISTINCT d.deptno, d.dname, d.loc
from emp e,dept d
where d.deptno=(select DISTINCT e.deptno from emp where e.job='과장');
--18번
select ename, sal, job
from emp
where sal>(SELECT max(sal) from emp where job='과장');
--------------------------------------------------
------------------13장-----------------------------
--1번: Sequence
--2번: currval(현재 시퀀스번호), nextval(다음 시퀀스번호)
--3번: 1.
--4번: index
--5번: 고유
--6번: drop index idx_emp_empno
--7번: drop sequence seq_empno

--------------------------------------------------
----------------테이블 삭제,추가,생성----------------
--------------------------------------------------
-- 부서 테이블 제거하기
DROP TABLE EMP;
-- 사원 테이블 제거하기
DROP TABLE DEPT;
-- 급여 테이블 제거하기
DROP TABLE SALGRADE;
-- 부서 테이블 제거하기
DROP TABLE EMPLOYEE;
-- 사원 테이블 제거하기
DROP TABLE DEPARTMENT;
-- 급여 테이블 제거하기
DROP TABLE SALGRADE;

-- 부서 테이블 생성하기
CREATE TABLE DEPT(
	 DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
	 DNAME VARCHAR2(14),
	 LOC   VARCHAR2(13) ) ;

-- 사원 테이블 생성하기
CREATE TABLE EMP( 
  	 EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
	 ENAME VARCHAR2(10),
 	 JOB   VARCHAR2(9),
	 MGR  NUMBER(4),
	 HIREDATE DATE,
	 SAL NUMBER(7,2),
	 COMM NUMBER(7,2),
	 DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT);

 -- 급여 테이블 생성하기
CREATE TABLE SALGRADE(
	 GRADE NUMBER,
	 LOSAL NUMBER,
	 HISAL NUMBER );

-- 사원 테이블에 샘플 데이터 추가하기
INSERT INTO DEPT VALUES(10, '경리부', '서울');
INSERT INTO DEPT VALUES(20, '인사부', '인천');
INSERT INTO DEPT VALUES(30, '영업부', '용인'); 
INSERT INTO DEPT VALUES(40, '전산부', '수원');

-- 부서 테이블에 샘플 데이터 추가하기
INSERT INTO EMP VALUES(1001, '김사랑', '사원', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '한예슬', '대리', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250,   80, 30);
INSERT INTO EMP VALUES(1003, '오지호', '과장', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500,  100, 30);
INSERT INTO EMP VALUES(1004, '이병헌', '부장', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '신동협', '과장', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450,  200, 30);
INSERT INTO EMP VALUES(1006, '장동건', '부장', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '이문세', '부장', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '감우성', '차장', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500,    0, 30);
INSERT INTO EMP VALUES(1009, '안성기', '사장', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '이병헌', '과장', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '조향기', '사원', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '강혜정', '사원', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '박중훈', '부장', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1014, '조인성', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);

-- 급여 테이블에 샘플 데이터 추가하기
INSERT INTO SALGRADE VALUES (1, 700,1200);
INSERT INTO SALGRADE VALUES (2, 1201,1400);
INSERT INTO SALGRADE VALUES (3, 1401,2000);
INSERT INTO SALGRADE VALUES (4, 2001,3000);
INSERT INTO SALGRADE VALUES (5, 3001,9999);
COMMIT;


