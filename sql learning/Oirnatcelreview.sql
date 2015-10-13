 select d.dname, count(e.empno) from emp e, dept d
 where e.deptno=d.deptno
 group by d.dname;
 
 select distinct  e1.ename, count(*) from emp e1, emp e2
 where e1.empno = e2.mgr group by e1.ename ;
 
 select d.dname, avg(e.sal) from emp e, dept d
 where e.deptno=d.deptno group by d.dname having avg(e.sal) > 2000;
 
select d.dname, e2.sal from (select e1.ename,e1.deptno, e1.sal from emp e1
 order by e1.sal desc) e2, dept d where e2.deptno = d.deptno and rownum <=5;
 
 select * from dept where deptno not in(select deptno from emp);
 
select k.dname from  (select * from emp e right outer join dept d on e.deptno = d.deptno) k where k.empno is null;
 
 
 -------------------------------
 
 SELECT d.dname,
  DECODE( COUNT(e.empno), 0, 0, COUNT(e.empno))
FROM dept d
LEFT OUTER JOIN emp e
ON d.deptno = e.deptno
GROUP BY d.dname;

SELECT DISTINCT e1.ename,
  COUNT(e2.mgr)
FROM emp e1,
  emp e2
WHERE e1.empno = e2.mgr
GROUP BY e1.ename;

select d1.dname, round(avg(e1.sal))
from emp e1, dept d1
where e1.deptno = d1.deptno
group by d1.dname 
having avg(e1.sal)>2000;

select k.* from (select e1.ename, d1.dname, e1.sal 
from emp e1, dept d1
where e1.deptno = d1.deptno
order by sal desc) k where rownum <=5;

select d.dname from dept d where d.deptno not in( select e.deptno from emp e);

select d.dname from dept d left outer join emp e on d.deptno = e.deptno where e.deptno is null;

 select a,b, decode(count(1),1,'SINGLE','MULTIPLE') from TEST group by a,b;