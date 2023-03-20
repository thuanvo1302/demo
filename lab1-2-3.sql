--52100588_VoMinhThuan
---lab1
use master
if exists (select * from sysdatabases where name ='credatabase')
	drop database credatabase
go
create database  credatabase
go
use credatabase
go
if exists (select * from sysobjects where name= 'Dep')
	drop table Dep
create table Dep
(
	did varchar(10),
	dname nvarchar(30) not null,
	dyear int not null,
	primary key (did)
)
if exists (select * from sysobjects where name= 'Student')
	drop table Student
create table Student(
	sid varchar(10),
	name nvarchar(30) not null,
	Birthday Date,
	did varchar(10),

	primary key(sid),
	foreign key (did) references Dep(did),
)
if exists (select * from sysobjects where name= 'Courses')
	drop table Courses
create table Courses(
	cid varchar(10) not null,
	cname nvarchar(30) not null,
	credit int,
	did varchar(10),
	primary key(cid),
	foreign key (did) references Dep(did),

)
if exists (select * from sysobjects where name= 'Condition')
	drop table Condition
create table Condition(
	cid varchar(10),
	precid varchar(10),
	primary key(cid,precid),
	foreign key (cid) references Courses(cid),
	foreign key (precid) references Courses(cid),


)
if exists (select * from sysobjects where name= 'Result')
	drop table Result
create table Result(
	sid varchar(10)not null,
	cid varchar(10)not null,
	score float not null,
	primary key(sid,cid) ,
	foreign key (sid) references Student(sid),
	foreign key (cid) references Courses(cid),
)
---lab2

insert into dbo.Dep values('IT','Information Technology',2012);
insert into dbo.Dep values('ET','Electronic Technology',1997);
insert into dbo.Dep values('BT','Biotechnology',1997);
insert into dbo.Dep values('FL','Foreign languege',2000);

insert into dbo.Student values('S01', 'Phước Trần', '1990-02-24','IT')
insert into dbo.Student values('S02', 'Timothy', '2000-12-12','IT')
insert into dbo.Student values('S03', 'Kaily', '2001-10-01','IT')
insert into dbo.Student values('S04', 'Tâm Nguyễn', '1998-12-20','IT')
insert into dbo.Student values('S05', 'Lee Nguyễn', '1999-02-28','IT')




insert into dbo.Courses values('OOP', 'Object oriented Programming', 4,'IT')
insert into dbo.Courses values('PM', 'Programming method', 4,'IT')
insert into dbo.Courses values('DBS', 'Database system', 4,'IT')
insert into dbo.Courses values('SE', 'Software engineering', 4,'IT')
insert into dbo.Courses values('CN', 'Computer network', 3,'IT')


insert into dbo.Condition values('OOP', 'PM')
insert into dbo.Condition values('DBS', 'PM')
insert into dbo.Condition values('DBS', 'OOP')
insert into dbo.Condition values('SE', 'OOP')
insert into dbo.Condition values('SE','DBS')

insert into dbo.Result values('S01', 'PM',9.5)
insert into dbo.Result values('S01', 'OOP',10.0)
insert into dbo.Result values('S02', 'PM',4.5)
insert into dbo.Result values('S02', 'DBS',6.0)
insert into dbo.Result values('S03', 'DBS',8.0)

--cau2a
update Student
set Birthday = '1999-02-20'
where sid = 'S01'
--cau2b
update Result
set score=score+1
where sid='S02' and cid ='PM'
--cau2c
delete from Result 
where score <5
--cau3a
alter table Student 
add phone int;
--cau3b
alter table Student 
alter column phone varchar(10)
--cau3c
alter table Student add phone varchar(10) not null, default '0'
--cau3d
alter table Result
add primary key (sid)
alter table Result
add primary key (cid)

--cau3e
--i
alter table Result
add foreign key (sid) references Student(sid)
--ii
alter table Result
add foreign key (cid) references Courses(cid)
--cau3f
--i
alter table Result
add check (score>=0 and score<=10)
--ii
alter table Courses
add check (credit >=1 and credit<=12)
--iii
alter table Courses 
alter column cname nvarchar(30) not null
--cau3g
alter table Student drop column phone
--cau3h
alter table Courses
drop constraint credit
---lab3
--cau1
select * from Student
where did='IT'
--cau2
select *from Dep
where 2022-dyear>20
--cau3 
select *from Courses
where credit >=5 and did='IT'
--cau4
select precid from Condition
where cid='DBS'
--cau5
select Result.sid,cname, Result.cid, cname, score from Student, Courses,Result
where Student.sid=Result.sid and Courses.cid=Result.cid and Courses.did='IT'
--cau6
select Student.name, score from Student
left join Result on Student.sid=Result.sid
order by Student.name
--cau7
select cid from Condition
where precid = null
--cau8
select d.dname, count(s.name) as student_count
from Student s
left join Dep d
on s.did=d.did
group by dname
order by d.dname
--cau9
select d.dname, count(c.cname )course_count
from Courses c
left join Dep d
on c.did=d.did
group by dname
order by d.dname
--cau10
select dname from Dep
inner join Student on Dep.did=Student.did
group by dname
having count(*) >10
--cau 11
select Courses.cname from Courses
inner join Result on Result.cid=Courses.cid
group by cname
having count(*) >10
--cau12
select name,round(avg(Result.score),2) as avg_score from Student, Result
where Student.sid=Result.sid
group by Student.name
--cau13
select max(avg_sc) 
from (select Student.name, avg(Result.score) 
as avg_sc 
from Student, Result
where Student.sid=Result.sid
group by Student.name) 
as max_avg
--cau14
select min(avg_sc) 
from (select Student.name, avg(Result.score) 
as avg_sc 
from Student, Result
where Student.sid=Result.sid
group by Student.name) as min_avg_score