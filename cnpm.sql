
DROP TABLE IF EXISTS taikhoan;
go;
CREATE TABLE taikhoan(
id_taikhoan INT IDENTITY(1,1) PRIMARY KEY,
taikhoan VARCHAR(50),
matkhau VARCHAR(50),
gmail VARCHAR(50),
quyen VARCHAR(10) DEFAULT 'user'
);
go;

DROP TABLE IF EXISTS baiviet;
go;
CREATE TABLE baiviet(
id_baiviet INT IDENTITY(1,1) PRIMARY KEY,
id_tacgia INT,
baiviet VARBINARY(MAX),
danhmuc NVARCHAR(50),
danhgia INT,
tinhtrang NVARCHAR(50),
binhluan NVARCHAR(1000));
go;
DROP TABLE IF EXISTS Folow;
go;
CREATE TABLE Folow(
id_dangfolow INT,
id_duocfolow INT);
go;


DROP TABLE IF EXISTS baiviet_chinhsua;
go;
CREATE TABLE baiviet_chinhsua(
id_baiviet INT IDENTITY(1,1) PRIMARY KEY,
id_tacgia INT,
baiviet VARBINARY(MAX),
danhmuc NVARCHAR(50),
tinhtrang NVARCHAR(50),

go;
