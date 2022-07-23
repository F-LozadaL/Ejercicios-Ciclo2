CREATE TABLE Editorial(
	editorial_nombre varchar(100) primary key
);

CREATE TABLE Sucursal(
	sucursal_codigo integer primary key,
	sucursal_domicilio varchar(100),
	sucursal_telefono varchar(50) not null,
	editorial_nombre_e varchar(100),
	FOREIGN KEY (editorial_nombre_e) REFERENCES Editorial(editorial_nombre)	
	
);

CREATE TABLE Revista(
	revista_titulo varchar(75) not null,
	revista_nreg integer primary key,
	revista_tipo varchar(25),
	revista_periodicidad varchar(25),
	sucursal_codigo_r integer not null,
	FOREIGN KEY (sucursal_codigo_r) REFERENCES Sucursal(sucursal_codigo)
	
);

CREATE TABLE Empleado(
	empleado_dni integer primary key,
	empleado_telefono varchar(50) not null,
	empleado_datos varchar(100),
	sucursal_codigo_em integer,
	FOREIGN KEY (sucursal_codigo_em) REFERENCES Sucursal(sucursal_codigo)	
);

CREATE TABLE Periodista(
	periodista_dni integer primary key,
	periodista_telefono varchar(50) not null,
	periodista_datos varchar(100),
	periodista_especialidad varchar(50),
	editorial_nombre_pe varchar(100),
	FOREIGN KEY (editorial_nombre_pe) REFERENCES Editorial(editorial_nombre)
);

CREATE TABLE Numero(
	numero_numero integer,
	revista_nreg_n integer ,
	numero_fecha varchar(15),
	numero_paginas integer,
	numero_vendidos integer,
	PRIMARY KEY (numero_numero,revista_nreg_n),
	FOREIGN KEY (revista_nreg_n) REFERENCES Revista(revista_nreg)
);

CREATE TABLE Articulo(
	revista_nreg_art integer,
	numero_numero_art integer,
	periodista_dni_art integer,
	FOREIGN KEY (revista_nreg_art) REFERENCES Revista(revista_nreg),
	FOREIGN KEY (numero_numero_art) REFERENCES Numero(numero_numero),
	FOREIGN KEY (periodista_dni_art) REFERENCES Periodista(periodista_dni),
	PRIMARY KEY (revista_nreg_art, numero_numero_art, periodista_dni_art)
);

