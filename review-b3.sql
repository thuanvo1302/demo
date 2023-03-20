use master
if exists (select * from sysdatabases where name ='Review')
	drop database Review
go
create database  Review
go
use Review
go
if exists (select * from sysobjects where name= 'NSX')
	drop table NSX
create table NSX
(
	MaNSX varchar(10),
	TenNSX varchar(20) not null,
	primary key(MaNSX),
)
create table Moto
(
	MaXe varchar(10),
	TenXe varchar(10) not null,
	SoLuong int,
	DonGia int,
	MaNSX varchar(10),
	primary key (MaXe),
	constraint FK_Moto_NSX foreign key (MaNSX) references NSX(MaNSX),
	check(SoLuong >=0 and DonGia >0)
)
create table KhachHang
(
	Sdt varchar(10),
	primary key (Sdt),
	HoTen nvarchar(20) not null,
	Diachi nvarchar(30),
	check(Diachi=N'TPHCM' or Diachi=N'Đồng Nai' or Diachi=N'Long An' or Diachi=N'Tây Ninh')
)
create table HoaDon
(
	SoHoaDon varchar(10),
	primary key (SoHoaDon),
	NgayLap date default getDate() ,
	MaKh varchar(10),
	constraint FK_HoaDon_KhachHang foreign key (MaKh) references KhachHang(Sdt),
)
create table Detail
(
	SoHoaDon varchar(10),
	MaXe varchar(10),
	primary key (SoHoaDon,MaXe),
	constraint FK_Detail_HoaDon foreign key (SoHoaDon) references HoaDon(SoHoaDon),
	constraint FK_Detail_Moto foreign key (MaXe) references Moto(MaXe),
)
--cau3
--a
insert into KhachHang values('0382652149',N'Nguyễn Văn A',N'Long An')
insert into KhachHang values('0193213462',N'Nguyễn Văn B',N'Đồng Nai')
insert into KhachHang values('0382683647',N'Nguyễn Văn C',N'TPHCM')

insert into NSX values('YMH','Yamaha')
insert into NSX values('HD','Honda')
insert into NSX values('SUZ','Suzuki')

insert into MoTo values('YMH01','Sirius',3, 20000000,'YMH')
insert into MoTo values('YMH02','Exciter',2, 40000000,'YMH')
insert into MoTo values('YMH03','Jupiter',1, 25000000,'YMH')

insert into MoTo values('HD01','Air Blade',4, 15000000,'HD')
insert into MoTo values('HD02','Lead',2, 30000000,'HD')
insert into MoTo values('HD03','SH Mode',3, 40000000,'HD')

insert into MoTo values('SUZ01','Satria',2, 55000000,'SUZ')
insert into MoTo values('SUZ02','Raider',3, 5000000,'SUZ')
insert into MoTo values('SUZ03','GSX-R150',0, 720000000,'SUZ')


insert into HoaDon values('SHD01','2022-1-22','0382652149')
insert into HoaDon values('SHD02','2022-9-29','0382652149')
insert into HoaDon values('SHD03','2022-10-1','0193213462')

insert into Detail values('SHD01','YMH01')
insert into Detail values('SHD02','HD03')
insert into Detail values('SHD03','YMH02')

select *from NSX
select *from MoTo
select *from KhachHang
select *from HoaDon
select *from Detail

--b
update Moto
set SoLuong=SoLuong+10
where MaXe='YMH01'
select *from MoTo
--c
update KhachHang
set DiaChi='TPHCM'
where Sdt = '0193213462'
select *from KhachHang
--d

update MoTo
set DonGia=case 
when DonGia>10000000  then 20000000
else DonGia+10000000
end
where MaXe='HD01'

--e
update MoTo
set SoLuong=case
when SoLuong>=5 and SoLuong<=15 then 15
when SoLuong>15 then SoLuong
else SoLuong+15
end
--where(select SoHoaDon from Detail where SoHoaDon='SHD01') and MaXa='YMH01'

--g
delete from Moto
where SoLuong=0
select *from Moto
--cau4
--a
select MaXe, TenXe from MoTo
inner join NSX on NSX.MaNSX=MoTo.MaNSX and TenNSX='Yamaha'
--b
select Sdt, HoTen from KhachHang
where Diachi='TPHCM'
--c
select *from KhachHang
inner join HoaDon on HoaDon.MaKh=KhachHang.Sdt and (month(HoaDon.NgayLap)=1 or month(HoaDon.NgayLap)=2 or month(HoaDon.NgayLap)=3 )
--d
select MaXe, TenXe from MoTo
inner join Detail on Detail.SoHoaDon=MoTo.SoHoaDon
