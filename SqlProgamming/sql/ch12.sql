--행 순번 붙이기
select rownum, bno, btitle
from (select bno, btitle from board order by bno asc);

--최근 삽입된 행 5개를 가져와라
select rownum, bno, btitle
FROM (select bno, btitle from board order by bno desc)
where rownum<=5;

--방법1: 11~20번까지 출력--
select rn, bno, btitle
from(select rownum as rn, bno, btitle
    FROM (select bno, btitle from board order by bno desc)
    where rownum <= 20)
WHERE rn>=11;
--방법2: 11~20번까지 출력--
select rn, bno ,btitle
from(select rownum as rn, bno, btitle
     FROM (select bno, btitle
           from board
           order by bno desc))
WHERE rn BETWEEN 11 and 20;

--1페이지에 10개씩 구성하고, n페이지를 가져와라
select rn, bno, btitle
from(select rownum as rn, bno, btitle
    FROM (select bno, btitle from board order by bno asc)
    where rownum <=(3*10))
WHERE rn>=((3-1)*10+1);








