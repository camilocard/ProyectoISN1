
USE viajes_nacionales
;

SET FOREIGN_KEY_CHECKS=0;




CREATE TABLE Aerolineas
(
	Id_aerolinea INTEGER NOT NULL AUTO_INCREMENT,
	Nombre_aerolinea VARCHAR(50),
	PRIMARY KEY (Id_aerolinea),
	UNIQUE UQ_Aerolinea_Id_aerolinea(Id_aerolinea)
) 
;


CREATE TABLE Clientes
(
	Id_Cliente INTEGER NOT NULL AUTO_INCREMENT,
	Nombre VARCHAR(50),
	Apellido2 VARCHAR(50),
	Direccion VARCHAR(50),
	Contacto INTEGER,
	PRIMARY KEY (Id_Cliente)
) 
;


CREATE TABLE Empleados
(
	Id_empleado INTEGER NOT NULL AUTO_INCREMENT,
	nombre_empleado VARCHAR(50),
	apellido VARCHAR(50),
	cargo VARCHAR(50),
	direccion VARCHAR(50),
	PRIMARY KEY (Id_empleado)
) 
;


CREATE TABLE Itinerarios
(
	Id_Itinerario INTEGER NOT NULL,
	nombre_itinerario VARCHAR(50),
	PRIMARY KEY (Id_Itinerario)
) 
;


CREATE TABLE Planes
(
	Id_plan INTEGER NOT NULL AUTO_INCREMENT,
	nombre_plan VARCHAR(50),
	costo_plan VARCHAR(50),
	PRIMARY KEY (Id_plan),
	UNIQUE UQ_Planes_Id_plan(Id_plan)
) 
;


CREATE TABLE Reservas
(
	Id_reserva INTEGER NOT NULL AUTO_INCREMENT,
	Num_reserva INTEGER AUTO_INCREMENT,
	Cliente_que_reserva INTEGER AUTO_INCREMENT,
	plan_escogido INTEGER,
	Aerolinea INTEGER,
	fecha_salida VARCHAR(50),
	fecha_regreso VARCHAR(50),
	factura_reserva INTEGER,
	PRIMARY KEY (Id_reserva),
	UNIQUE UQ_Reservas_Id_reserva(Id_reserva),
	KEY (Aerolinea),
	KEY (Cliente_que_reserva),
	KEY (plan_escogido)
) 
;


CREATE TABLE Tiquetes
(
	Id_Tiquete INTEGER NOT NULL,
	Valor CHAR(50),
	Id_Cliente INTEGER,
	Fecha_Salida CHAR(50),
	Fecha_regreso CHAR(50),
	Id_Intinerario INTEGER,
	plan INTEGER,
	PRIMARY KEY (Id_Tiquete)
) 
;



SET FOREIGN_KEY_CHECKS=1;


ALTER TABLE Reservas ADD CONSTRAINT FK_Reservas_Aerolinea 
	FOREIGN KEY (Aerolinea) REFERENCES Aerolineas (Id_aerolinea)
	ON UPDATE CASCADE
;

ALTER TABLE Reservas ADD CONSTRAINT FK_Reservas_Clientes 
	FOREIGN KEY (Cliente_que_reserva) REFERENCES Clientes (Id_Cliente)
	ON UPDATE CASCADE
;

ALTER TABLE Reservas ADD CONSTRAINT FK_Reservas_Planes 
	FOREIGN KEY (plan_escogido) REFERENCES Planes (Id_plan)
	ON UPDATE CASCADE
;
