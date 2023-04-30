DROP TABLE IF EXISTS usuarios;
DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS investigadores;
DROP TABLE IF EXISTS equipos;
DROP TABLE IF EXISTS facultad;

SET character_set_client = utf8mb4;

CREATE TABLE usuarios (
id int NOT NULL AUTO_INCREMENT,
username NVARCHAR(255),
password NVARCHAR(255),
role NVARCHAR(255),
PRIMARY KEY (id)
);

INSERT INTO usuarios (username, password, role) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');

CREATE TABLE facultad (
  id int NOT NULL AUTO_INCREMENT, 
  nombre nvarchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


SET character_set_client = utf8mb4;

CREATE TABLE investigadores (
  dni varchar(8) NOT NULL,
  nomapels nvarchar(255) DEFAULT NULL,
  idfacultad int,
  PRIMARY KEY (dni),
  CONSTRAINT facultad_i_fk FOREIGN KEY (idfacultad) REFERENCES facultad (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SET character_set_client = utf8mb4;

CREATE TABLE equipos (
  num_serie char(4) NOT NULL,
  nombre nvarchar(100) DEFAULT NULL,
  idfacultad int,
  PRIMARY KEY (num_serie),
  CONSTRAINT facultad_e_fk FOREIGN KEY (idfacultad) REFERENCES facultad (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


SET character_set_client = utf8mb4 ;
 
CREATE TABLE reserva (
  id int NOT NULL AUTO_INCREMENT,
  comienzo DATETIME,
  fin DATETIME,
  idinvestigadores varchar(8),
  idequipos char(4),
  PRIMARY KEY (id),
  CONSTRAINT investigadores_fk FOREIGN KEY (idinvestigadores) REFERENCES investigadores (dni) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT equipos_fk FOREIGN KEY (idequipos) REFERENCES equipos (num_serie) ON DELETE CASCADE ON UPDATE CASCADE
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


---------------------------------------
-- Now insert values into the tables --
---------------------------------------

LOCK TABLES facultad WRITE;
INSERT INTO facultad (nombre) VALUES ('Juan Carlos'), ('Medicina Alquimista'), ('URV');
UNLOCK TABLES;

LOCK TABLES investigadores WRITE;
INSERT INTO investigadores (dni, nomapels, idfacultad) VALUES ('11111111' ,'Benito Hernandez', 1),
('22222222' ,'Selena Gomez', 2),
('33333333','Romero García', 3);
UNLOCK TABLES;

LOCK TABLES equipos WRITE;
INSERT INTO equipos (num_serie, nombre, idfacultad) VALUES ('1111', 'Los pepos', 1), ('2222', 'Pe fuertes', 2), ('3333', 'Recelos', 3);
UNLOCK TABLES;

LOCK TABLES reserva WRITE;
INSERT INTO reserva (comienzo, fin, idinvestigadores, idequipos) VALUE
('1998-01-23 12:45:56', '2004-01-22 12:45:56', '11111111', '1111'),
('1998-01-23 12:45:56', '2007-02-12 12:45:56', '22222222', '2222'),
('1995-01-23 12:45:56', '2000-01-25 12:45:56', '33333333', '3333');
UNLOCK TABLES;

-- CREATE DATABASE investigadores;
-- USE investigadores;

-- SELECT * from reserva;
