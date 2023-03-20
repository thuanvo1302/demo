use master
if exists (select * from sysdatabases where name ='credatabase')
	drop database final
go
create database  final
go
use final
go
if exists (select * from sysobjects where name= 'NXS')
	drop table NXS
create table NSX
(
	MaNSX varchar(10),
	TenNSX varchar(20) not null,
	primary key(MaNSX),
)
create table XeMay
(
	MaXe varchar(10),
	TenXe varchar(10) not null,
	SoLuong int,
	DonGia int,
	MaNSX varchar(10),
	primary key (MaXe),
	constraint FK_Moto_NSX foreign key (MaNSX) references NSX(MaNSX),
)
create table KhachHang
(
	Sdt varchar(10),
	primary key (Sdt),
	HoTen nvarchar(15) not null,
	Diachi nvarchar(10),
)
create table HoaDon
(
	SoHoaDon varchar(10),
	primary key (SoHoaDon),
	NgayLap date default getDate(),
	MaKh varchar(10),
	constraint FK_HoaDon_KhachHang foreign key (MaKh) references KhachHang(Sdt),
)
create table Detail
(
	SoHoaDon varchar(10),
	MaXe varchar(10),
	primary key (SoHoaDon,MaXe),
	constraint FK_Detail_HoaDon foreign key (SoHoaDon) references HoaDon(SoHoaDon),
	constraint FK_Detail_Moto foreign key (MaXe) references XeMay(MaXe),
)
insert into KhachHang values('0382652149',N'Nguyễn Văn A',N'Long An')
insert into KhachHang values('0193213462',N'Nguyễn Văn B',N'Đồng Nai')
insert into KhachHang values('0382683647',N'Nguyễn Văn C',N'TPHCM')

insert into NSX values('YMH','Yamaha')
insert into NSX values('HD','Honda')
insert into NSX values('SUZ','Suzuki')

insert into XeMay values('YMH01','Sirius',3, 20000000,'YMH')
insert into XeMay values('YMH02','Exciter',2, 40000000,'YMH')
insert into XeMay values('YMH03','Jupiter',1, 25000000,'YMH')

insert into XeMay values('HD01','Air Blade',4, 15000000,'HD')
insert into XeMay values('HD02','Lead',2, 30000000,'HD')
insert into XeMay values('HD03','SH Mode',3, 40000000,'HD')

insert into XeMay values('SUZ01','Satria',2, 55000000,'SUZ')
insert into XeMay values('SUZ02','Raider',3, 5000000,'SUZ')
insert into XeMay values('SUZ03','GSX-R150',0, 720000000,'SUZ')


insert into HoaDon values('SHD01','2020-1-22','0382652149')
insert into HoaDon values('SHD02','2020-9-29','0382652149')
insert into HoaDon values('SHD03','2020-10-1','0193213462')
insert into HoaDon values('SHD04','2020-10-1','0193213462')

insert into Detail values('SHD01','YMH01')
insert into Detail values('SHD02','HD03')
insert into Detail values('SHD03','YMH02')
insert into Detail values('SHD04','YMH02')
select *from NSX
select *from XeMay
select *from KhachHang
select *from HoaDon
select *from Detail

select * from KhachHang, HoaDon
where KhachHang.Diachi=N'TPHCM'
and year(HoaDon.NgayLap)=2020
and datepart(quarter, HoaDon.NgayLap)=3

select * from XeMay, KhachHang, Detail, NSX
where NSX.TenNSX=N'Yamaha'
and Detail.MaXe=XeMay.MaXe
and KhachHang.Diachi=N'TPHCM'
and NSX.MaNSX=XeMay.MaNSX



select max(result) from(select (Count(MaXe)) as result from Detail
inner join HoaDon on Detail.SoHoaDon=HoaDon.SoHoaDon
and year(HoaDon.NgayLap)=2020
group by Maxe) as result


select MaXe  as result from Detail
inner join HoaDon on Detail.SoHoaDon=HoaDon.SoHoaDon
and year(HoaDon.NgayLap)=2020
group by Maxe

if exists (select * from sysobjects where name='AUTO_SoHoaDon')
begin
	drop function AUTO_SoHoaDon
end
go
CREATE FUNCTION AUTO_SoHoaDon(@NgayLap date)
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(SoHoaDon) FROM HoaDon) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(SoHoaDon, 3)) FROM HoaDon
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN convert(char,@NgayLap)+'00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN convert(char, @NgayLap)+'0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
go