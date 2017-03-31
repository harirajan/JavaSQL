-- Joins in SQL -- Oracle

-- Join Types -- Inner, Left Outer, Right Outer, Full Outer 

-- Join conditions - Natural, On, Using (attributes)

-- Inner Join - discard all unmatched tupes

-- Left Outer Join - Include unmatched tuples from left side relationship

-- Right Outer Join - Include unmatched tuples from right side relationship

-- Full Outer - Include all unmatched tuples from right and left relationship

-- Conditions 

-- Using (- , -) - removes all the specified attributes only once, apply equality 
-- condition on specified attributes

-- Natural - Include all the common attributes only once, apply equality condition
-- on all common attributes

-- On(0)- No attribute elemination, apply the given condition. 

--------------------------------------------------------
--  File created - Friday-March-31-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table R2
--------------------------------------------------------

  CREATE TABLE "R2" ("B" NUMBER(*,0), "C" VARCHAR2(20), "D" VARCHAR2(20))
--------------------------------------------------------
--  DDL for Table R1
--------------------------------------------------------

  CREATE TABLE "R1" ("A" VARCHAR2(20), "B" NUMBER(*,0), "C" VARCHAR2(20))

REM INSERTING into MITEST.R2
SET DEFINE OFF;
Insert into MITEST.R2 (B,C,D) values (1,'c1','d1');
Insert into MITEST.R2 (B,C,D) values (1,'c2','d2');
Insert into MITEST.R2 (B,C,D) values (2,'c2','d3');
REM INSERTING into MITEST.R1
SET DEFINE OFF;
Insert into MITEST.R1 (A,B,C) values ('a1',1,'c1');
Insert into MITEST.R1 (A,B,C) values ('a2',2,'c2');
Insert into MITEST.R1 (A,B,C) values ('a3',3,'c3');




select * from R1 natural join R2;

select * from R1 inner join R2
on R1.B < R2.B;

select * from R1 natural left outer join R2;

select * from R1 natural inner join R2;

select * from R1 inner join R2 on R1.B <= R2.B;



