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
	TenNSX varchar(20) not null unique,
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
	foreign key (MaNSX) references NSX(MaNSX),
	check(SoLuong >0 and DonGia >0)
)
create table KhachHang
(
	Sdt varchar(10),
	primary key (Sdt),
	HoTen nvarchar(15) not null,
	Diachi nvarchar(10),
	check(Diachi='TPHCM' or Diachi='Đồng Nai' or Diachi='Long An' or Diachi='Tây Ninh')
)
create table HoaDon
(
	SoHoaDon int,
	primary key (SoHoaDon),
	NgayLap date default getDate(),
	MaKh varchar(10),
	constraint FK_KhachHang_HoaDon foreign key (MaKh) references KhachHang(Sdt),
)
create table Detail
(
	SoHoaDon int,
	MaXe varchar(10),
	primary key (SoHoaDon,MaXe),
	constraint FK_HoaDon_Detail foreign key (SoHoaDon) references HoaDon(SoHoaDon),
	constraint FK_Moto_Detail foreign key (MaXe) references Moto(MaXe),
)
--cau2
--a
alter table NSX add QuocGia nvarchar(30)
--b
alter table NSX add check (QuocGia = 'Nhật' or QuocGia = 'Hàn'or QuocGia = 'Mỹ'or QuocGia = 'Đức')
--c
alter table HoaDon add NgayGiaoHang date
--d
alter table HoaDon add check(NgayGiaoHang> NgayLap)
--e
--alter table KhachHang alter column Sdt int
--f
alter table HoaDon drop constraint FK_KhachHang_HoaDon
--g
alter table Detail drop constraint FK_HoaDon_Detail
alter table Detail drop constraint FK_Moto_Detail