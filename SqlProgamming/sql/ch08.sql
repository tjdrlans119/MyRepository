--Ch08:DML(Data Manupulation Language) - 데이터 관련된 명령어
--        :저장(insert), 수정(update), 삭제(delete), 조회(select),...
--     DDL(Data Definition Language)-데이터베이스 객체(Object)와 관련된 명령어
--        :데이블 생성(create),테이블 삭제(dtop), 테이블수정(alter), 인덱스 생성,...
--     DCL(Data Control Language) - 권한 및 사용자와 관련된 명령어
--        :권한할당(grant), 권한삭제(revoke), 작업반영(commit), 작업취소(rollback)

--Section01 테이블에 내용을 추가하는 INSERT 문
insert into member(mid, mname, mage, mbirth)values('user3','사용자3',10,'2006/5/15');
insert into member(mid, mname)values('user4','사용자4');
insert into member values('user5','사용자5',null,null);
INSERT into board(bno,btitle,bcontent,bwriter,bhitcount,bdate) values(3,'제목','내용','문',2,'2016.10.10');

insert into board(bno, btitle, bcontent, bwriter, bhitcount, bdate)
values(6, '제목6', '내용6', 'user1',0,sysdate);
--insert into board values(7, '제목7', '내용7', 'user3',0,sysdate);

--Section02 테이블의 내용을 수정하는 UPDATE문(DML)
UPDATE member set mage=10 where mid='user4';
UPDATE member set mage=20, mbirth='2001.08.10' where mid='user5';
UPDATE member set mage=mage+1 where mid='user4';

--Section03 테이블의 내용을 삭제하는 DELETE문
DELETE member where mid='user4';
DELETE member where mage<=20;

--Section04 트랜잭션 관리
create table account(
	ano varchar(20) not null,
	abalance number(10) null
);
INSERT into account(ano,abalance) values('111-111',1000000);
INSERT into account(ano,abalance) values('111-112',0);
commit;

--계좌이체: 출금작업 + 입금작업 --> 트랜잭션 작업 = All or Nothung
  --출금작업
  update account set abalance = abalance-10000 where ano='111-111';
  SELECT * FROM account;
  --입금작업
  update account set abalance = abalance+10000 where ano='111-113';
--출금은 성공했으니, 입금이 실패했기 때문에 전체를 실패처리해야함
rollback;
--출금, 입금 둘다 성공했다면, 전체를 영구반영 처리해야함
commit;



select bno, btitle, bcontent, bwriter from board where bno=100;







