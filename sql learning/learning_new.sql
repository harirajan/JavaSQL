SELECT s.sid,
  s.sname
FROM sailors s
WHERE s.sid IN
  (SELECT r.sid
  FROM boats b,
    reserves r
  WHERE b.bid  = r.bid
  AND b.color != 'red'
  );
SELECT MIN(s.age), s.rating FROM sailors s GROUP BY s.rating;
CREATE TABLE neg_pos
  (num NUMBER
  );
INSERT INTO neg_pos VALUES
  (-1
  );
INSERT INTO neg_pos VALUES
  (-2
  );
INSERT INTO neg_pos VALUES
  (-3
  );
INSERT INTO neg_pos VALUES
  (-4
  );
INSERT INTO neg_pos VALUES
  (1
  );
INSERT INTO neg_pos VALUES
  (2
  );
INSERT INTO neg_pos VALUES
  (3
  );
INSERT INTO neg_pos VALUES
  (4
  );
COMMIT;
SELECT * FROM neg_pos;
SELECT SUM(
  CASE
    WHEN num < 0
    THEN num
  END) AS neg,
  SUM(
  CASE
    WHEN num > 0
    THEN num
  END) AS pos
FROM neg_pos;
CREATE TABLE col_to_rows
  (
    stu_name VARCHAR2(30),
    subject  VARCHAR2(10),
    marks    NUMBER
  );
INSERT INTO col_to_rows VALUES
  ('GEORGE','ECO',77
  );
INSERT INTO col_to_rows VALUES
  ('GEORGE','HIS',99
  );
INSERT INTO col_to_rows VALUES
  ('GEORGE','MAT',64
  );
INSERT INTO col_to_rows VALUES
  ('GEORGE','GEO',85
  );
INSERT INTO col_to_rows VALUES
  ('GEORGE','SCI',98
  );
INSERT INTO col_to_rows VALUES
  ('ROBERT','ECO',71
  );
INSERT INTO col_to_rows VALUES
  ('ROBERT','HIS',90
  );
INSERT INTO col_to_rows VALUES
  ('ROBERT','MAT',84
  );
INSERT INTO col_to_rows VALUES
  ('ROBERT','GEO',95
  );
INSERT INTO col_to_rows VALUES
  ('ROBERT','SCI',58
  );
INSERT INTO col_to_rows VALUES
  ('TIMOTHY','ECO',56
  );
INSERT INTO col_to_rows VALUES
  ('TIMOTHY','HIS',55
  );
INSERT INTO col_to_rows VALUES
  ('TIMOTHY','MAT',67
  );
INSERT INTO col_to_rows VALUES
  ('TIMOTHY','GEO',54
  );
INSERT INTO col_to_rows VALUES
  ('TIMOTHY','SCI',45
  );
COMMIT;
SELECT stu_name,
  MAX(
  CASE
    WHEN subject='ECO'
    THEN marks
    ELSE 0
  END) ECO,
  MAX(
  CASE
    WHEN subject='HIS'
    THEN marks
    ELSE 0
  END) HIS,
  MAX(
  CASE
    WHEN subject='MAT'
    THEN marks
    ELSE 0
  END) MAT,
  MAX(
  CASE
    WHEN subject='GEO'
    THEN marks
    ELSE 0
  END) GEO,
  MAX(
  CASE
    WHEN subject='SCI'
    THEN marks
    ELSE 0
  END) SCI
FROM col_to_rows
GROUP BY stu_name;
SELECT * FROM col_to_rows;
CREATE TABLE MATCH
  (team VARCHAR2(5),result VARCHAR2(4)
  );
INSERT INTO MATCH VALUES
  ('A','WIN'
  );
INSERT INTO MATCH VALUES
  ('A','LOSS'
  );
INSERT INTO MATCH VALUES
  ('A','WIN'
  );
INSERT INTO MATCH VALUES
  ('B','WIN'
  );
INSERT INTO MATCH VALUES
  ('B','LOSS'
  );
INSERT INTO MATCH VALUES
  ('C','WIN'
  );
INSERT INTO MATCH VALUES
  ('C','DRAW'
  );
INSERT INTO MATCH VALUES
  ('D','LOSS'
  );
INSERT INTO MATCH VALUES
  ('E','DRAW'
  );
SELECT * FROM MATCH;
SELECT team, result, COUNT(*) FROM MATCH GROUP BY team ,result;
SELECT team,
  win,
  loss,
  draw ,
  win+loss+draw AS total
FROM
  (SELECT team,
    SUM(
    CASE
      WHEN result='WIN'
      THEN 1
      ELSE 0
    END) AS win,
    SUM(
    CASE
      WHEN result='LOSS'
      THEN 1
      ELSE 0
    END) AS loss,
    SUM(
    CASE
      WHEN result='DRAW'
      THEN 1
      ELSE 0
    END) AS draw
  FROM MATCH
  GROUP BY team
  ORDER BY team
  );
CREATE TABLE dept_cap
  (dept VARCHAR2(5),capacity NUMBER
  );
INSERT INTO dept_cap VALUES
  ('D1',5
  );
INSERT INTO dept_cap VALUES
  ('D2',5
  );
INSERT INTO dept_cap VALUES
  ('D3',5
  );
SELECT k.dept
FROM
  ( SELECT s.dept, COUNT(*)AS val FROM stu_dept s GROUP BY s.dept
  ) k
WHERE k.val not in
  ( SELECT capacity FROM dept_cap WHERE dept = k.dept
  );
  
  
  
  select count(*) from sailors s where exists (select sid from reserves r where r.sid = s.sid);
  
  
  
  
  create table big as select * from all_objects;
  
  
  select count(subobject_name)
  from big
 where object_id in ( select object_id from small );
  
    insert /*+ append */ into big select * from big;commit;
    create index big_idx on big(object_id);
    
    create table small as select * from all_objects where rownum < 100;
    
    create index small_idx on small(object_id);
    
    
    
    select * from B where rowid in (select decode(mod(rownum,2),0,rowid,null) from B);
    
    
    select max(rating) from (select * from sailors order by rating asc) t where rownum <=3;
    
    select * from nls_session_parameters;
    
    select job, deptno, count(*)
    from emp group by job, deptno;
    
    select job, 
           max(decode(deptno,10,cnt,null)) dept10,
           max(decode(deptno,20,cnt,null)) dept20,
           max(decode(deptno,30,cnt,null)) dept30,
           max(decode(deptno,3,cnt,null)) dept3,
           max(decode(deptno,4,cnt,null)) dept4
           from 
           (select job, deptno, count(*) cnt
           from emp group by job, deptno)
           group by job;
		   
		   
		   
		   
		   =============
		   SELECT cg.name
FROM account a ,
  customer c ,
  poster_output po,
  customer_group cg
WHERE a.account_number = po.account_number
AND c.cust_id          = a.cust_id
AND c.parent_id        = cg.group_id
AND EXISTS
  (SELECT NULL
  FROM customer_group cg
  WHERE cg.group_id = c.parent_id
  AND cg.config     ='b'
  );
UPDATE poster_output po
SET po.customer_name =
  (SELECT (
    CASE
      WHEN cg.config='b'
      THEN cg.name
      ELSE c.cust_name
    END)
  FROM account a ,
    customer c,
    customer_group cg
  WHERE po.account_number = a.account_number
  AND a.cust_id           = c.cust_id
  AND c.parent_id         = cg.group_id
  );
SELECT rownum,cust_id FROM customer;
SELECT *
FROM emp
WHERE rowid IN
  (SELECT DECODE(mod(rownum,2),0,rowid, NULL) FROM emp
  );
===========================================================================;
SELECT table_b.bkey_a,
  max(DECODE(table_b.bcode,'T',bcode,NULL)) T_,
  max(DECODE(table_b.bcode,'A',bcode,NULL)) A_,
  max(DECODE(table_b.bcode,'L',bcode,NULL)) L_
FROM a table_a,
  b table_b
WHERE table_a.key_1 = table_b.bkey_a
GROUP BY table_b.bkey_a;
=============================================================================;
