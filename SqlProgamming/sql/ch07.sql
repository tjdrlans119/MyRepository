--Section01 테이블 구조를 만드는 CREATE TABLE문
create table member(
mid varchar(10) not null,
mname varchar(10) not null,
mage number(3,0) null,
mbirth date not null
);

create table board (
bno number(10) not null,
btitle varchar(100) not null,
bcontent varchar(4000) not null,
bwriter varchar(10) not null,
bhitcount number(5) null,
bdate date null
);