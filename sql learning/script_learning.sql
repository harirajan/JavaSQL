-- find name of sailors who reseverd boat 103

select s.sname from sailors s , reserves r where s.sid = r.sid and r.bid='103';

----find the sids of sailors who have reserved red boat.

select distinct r.sid from boats b, reserves r 
where r.bid = b.bid and b.color='red';

--find name of sailors who have reserved a red boat

select distinct s.sname from sailors s, boats b, reserves r
where s.sid=r.sid and b.bid = r.bid and b.color='red';

--find the colors of boats reserved by lubber
select distinct b.color from sailors s, boats b, reserves r
where s.sid=r.sid and b.bid = r.bid and s.sname='Lubber';

-- find the names of sailors who have reserved atleast one boat
select distinct s.sname from sailors s, reserves r where s.sid=r.sid;

-- compute the name and rating of sailors who have sailed two different boats on the same day

select distinct s.sname, s.rating from sailors s, reserves r1, reserves r2 
where s.sid = r1.sid and r1.bid != r2.bid and r1.day  = r2.day and r1.sid =r2.sid;

--find the ages of sailors whose name begins and ends with B and has atleast 3 characters
select s.age from sailors s where s.sname like 'A%y';

--find the name of sailors who reserved a red or a green boat

select distinct s.sname from sailors s,boats b, reserves r 
where r.bid = b.bid 
and s.sid = r.sid
and (b.color='red' or b.color='green');

--find the names of sailors who have reserved both a red and green boat

select * from boats b, reserves r
where b.bid = r.bid
and b.color ='red'
union
select * from boats b, reserves r
where b.bid =r.bid
and b.color ='green';

-- find the name of sailors who have reserved a red boat but not a green boat

select r1.sid from boats b1, reserves r1
where b1.bid = r1.bid and b1.color='red' 
minus
select r2.sid from boats b2, reserves r2 where b2.bid = r2.bid and b2.color ='green';

--find sids of all sailors who have a rating of 10 or reserved boat 104
select s.sid from sailors s
where s.rating =10
UNION
select r.sid from reserves r
where r.bid=104;

---------------Nested Queries----------------------

--Find the names of sailors who have reserved boat 103

select sname from sailors where sid in(select r.sid from boats b, reserves r
where b.bid =r.bid and
b.bid='103');

--find the names of sailors who  have reserved a red boat

select s.sname from sailors s
where s.sid in(select r.sid from boats b, reserves r 
where b.bid = r.bid and b.color='red');

-- find the names of sailors who have not reserved a red boat
select s.sid, s.sname from sailors s
where s.sid in(select r.sid from boats b, reserves r 
where b.bid = r.bid and b.color != 'red');

--Pind the names of sailors who have reserved boat number 103.



