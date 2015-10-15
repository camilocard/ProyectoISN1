CREATE SEQUENCE Aerolineas_Id_aerolinea_seq INCREMENT 1 START 1;

CREATE TABLE Aerolineas ( 
	Id_aerolinea integer DEFAULT nextval(('Aerolineas_Id_aerolinea_seq'::text)::regclass) NOT NULL,
	Nombre_aerolinea varchar(110)
);

CREATE SEQUENCE Clientes_Id_Cliente_seq INCREMENT 1 START 1;

CREATE TABLE Clientes ( 
	Id_Cliente integer DEFAULT nextval(('Clientes_Id_Cliente_seq'::text)::regclass) NOT NULL,
	Nombre1 varchar(50),
	Nombre2 varchar(50),
	Apellido1 varchar(50),
	Apellido2 varchar(50),
	Fecha_nacimiento varchar(50),
	Sexo boolean,
	Documento varchar(50),
	TipoDoc varchar(50)
);

CREATE SEQUENCE Contacto_Id_contacto_seq INCREMENT 1 START 1;

CREATE TABLE Contacto ( 
	Id_contacto integer DEFAULT nextval(('Contacto_Id_contacto_seq'::text)::regclass) NOT NULL,
	Cliente integer,
	Empleado integer,
	Telefono_fijo varchar(50),
	Celular varchar(50),
	Direccion varchar(50),
	Correo_electronico varchar(50)
);

CREATE SEQUENCE Empleados_Id_empleado_seq INCREMENT 1 START 1;

CREATE TABLE Empleados ( 
	Id_empleado integer DEFAULT nextval(('Empleados_Id_empleado_seq'::text)::regclass) NOT NULL,
	Cargo varchar(50),
	Nombre1 varchar(50),
	Nombre2 varchar(50),
	Apellido1 varchar(50),
	Apellido2 varchar(50),
	FechaNac varchar(50),
	Sexo boolean,
	Documento varchar(50),
	TipoDoc varchar(50)
);

CREATE SEQUENCE Itinerarios_Id_Itinerario_seq INCREMENT 1 START 1;

CREATE TABLE Itinerarios ( 
	Id_Itinerario integer DEFAULT nextval(('Itinerarios_Id_Itinerario_seq'::text)::regclass) NOT NULL,
	Ciudad varchar(25)
);

CREATE SEQUENCE Planes_Id_plan_seq INCREMENT 1 START 1;

CREATE TABLE Planes ( 
	Id_plan integer DEFAULT nextval(('Planes_Id_plan_seq'::text)::regclass) NOT NULL,
	nombre_plan varchar(50),
	costo_plan varchar(50)
);

CREATE SEQUENCE Reservas_Id_reserva_seq INCREMENT 1 START 1;
CREATE SEQUENCE Reservas_Num_reserva_seq INCREMENT 1 START 1;

CREATE TABLE Reservas ( 
	Id_reserva integer DEFAULT nextval(('Reservas_Id_reserva_seq'::text)::regclass) NOT NULL,
	Num_reserva integer DEFAULT nextval(('Reservas_Num_reserva_seq'::text)::regclass),
	Cliente_que_reserva integer,
	plan_escogido integer,
	fecha_salida varchar(50),
	fecha_regreso varchar(50),
	Empleado integer
);

CREATE SEQUENCE Tiquetes_Id_Tiquete_seq INCREMENT 1 START 1;

CREATE TABLE Tiquetes ( 
	Id_Tiquete integer DEFAULT nextval(('Tiquetes_Id_Tiquete_seq'::text)::regclass) NOT NULL,
	Aerolinea integer,
	Reservado integer,
	Itinerario integer,
	Valor real
);


ALTER TABLE Aerolineas ADD CONSTRAINT PK_Aerolinea 
	PRIMARY KEY (Id_aerolinea);


ALTER TABLE Clientes ADD CONSTRAINT PK_Clientes 
	PRIMARY KEY (Id_Cliente);


ALTER TABLE Contacto ADD CONSTRAINT PK_ContactoCliente 
	PRIMARY KEY (Id_contacto);


ALTER TABLE Empleados ADD CONSTRAINT PK_Empleados 
	PRIMARY KEY (Id_empleado);


ALTER TABLE Itinerarios ADD CONSTRAINT PK_Itinerario 
	PRIMARY KEY (Id_Itinerario);


ALTER TABLE Planes ADD CONSTRAINT PK_Planes 
	PRIMARY KEY (Id_plan);


ALTER TABLE Reservas ADD CONSTRAINT PK_Reservas 
	PRIMARY KEY (Id_reserva);


ALTER TABLE Tiquetes ADD CONSTRAINT PK_Tiquete 
	PRIMARY KEY (Id_Tiquete);



ALTER TABLE Aerolineas
	ADD CONSTRAINT UQ_Aerolinea_Id_aerolinea UNIQUE (Id_aerolinea);
ALTER TABLE Clientes
	ADD CONSTRAINT UQ_Clientes_Id_Cliente UNIQUE (Id_Cliente);
ALTER TABLE Contacto
	ADD CONSTRAINT UQ_ContactoCliente_Id_contacto UNIQUE (Id_contacto);
ALTER TABLE Empleados
	ADD CONSTRAINT UQ_Empleados_Id_empleado UNIQUE (Id_empleado);
ALTER TABLE Itinerarios
	ADD CONSTRAINT UQ_Itinerarios_Id_Itinerario UNIQUE (Id_Itinerario);
ALTER TABLE Planes
	ADD CONSTRAINT UQ_Planes_Id_plan UNIQUE (Id_plan);
ALTER TABLE Reservas
	ADD CONSTRAINT UQ_Reservas_Id_reserva UNIQUE (Id_reserva);
ALTER TABLE Tiquetes
	ADD CONSTRAINT UQ_Tiquetes_Id_Tiquete UNIQUE (Id_Tiquete);

ALTER TABLE Contacto ADD CONSTRAINT FK_ContactoCliente_Clientes 
	FOREIGN KEY (Cliente) REFERENCES Clientes (Id_Cliente)
ON UPDATE CASCADE;

ALTER TABLE Contacto ADD CONSTRAINT FK_ContactoCliente_Empleados 
	FOREIGN KEY (Empleado) REFERENCES Empleados (Id_empleado)
ON UPDATE CASCADE;

ALTER TABLE Reservas ADD CONSTRAINT FK_Reservas_Clientes 
	FOREIGN KEY (Cliente_que_reserva) REFERENCES Clientes (Id_Cliente)
ON UPDATE CASCADE;

ALTER TABLE Reservas ADD CONSTRAINT FK_Reservas_Empleados 
	FOREIGN KEY (Empleado) REFERENCES Empleados (Id_empleado)
ON UPDATE CASCADE;

ALTER TABLE Reservas ADD CONSTRAINT FK_Reservas_Planes 
	FOREIGN KEY (plan_escogido) REFERENCES Planes (Id_plan)
ON UPDATE CASCADE;

ALTER TABLE Tiquetes ADD CONSTRAINT FK_Tiquetes_Aerolineas 
	FOREIGN KEY (Aerolinea) REFERENCES Aerolineas (Id_aerolinea)
ON UPDATE CASCADE;

ALTER TABLE Tiquetes ADD CONSTRAINT FK_Tiquetes_Itinerarios 
	FOREIGN KEY (Itinerario) REFERENCES Itinerarios (Id_Itinerario)
ON UPDATE CASCADE;

ALTER TABLE Tiquetes ADD CONSTRAINT FK_Tiquetes_Reservas 
	FOREIGN KEY (Reservado) REFERENCES Reservas (Id_reserva)
ON UPDATE CASCADE;
