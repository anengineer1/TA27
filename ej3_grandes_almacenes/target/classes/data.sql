DROP TABLE IF EXISTS usuarios;
DROP TABLE IF EXISTS venta;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS cajeros;
DROP TABLE IF EXISTS maquinas_registradoras;
SET character_set_client = utf8mb4;

CREATE TABLE usuarios (
id int NOT NULL AUTO_INCREMENT,
username NVARCHAR(255),
password NVARCHAR(255),
role NVARCHAR(255),
PRIMARY KEY (id)
);

INSERT INTO usuarios (username, password, role) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');


CREATE TABLE productos (
  id int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  precio int DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table piezas
--

LOCK TABLES productos WRITE;
INSERT INTO productos (nombre, precio) VALUES ('tata', 5),('Raba en lata', 10),('Leche Fresca', 60);
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

SET character_set_client = utf8mb4;

CREATE TABLE cajeros (
  id int NOT NULL AUTO_INCREMENT,
  nomapels nvarchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table proveedores
--

LOCK TABLES cajeros WRITE;
INSERT INTO cajeros (nomapels) VALUES ('Almendras caramelizadas'), ('Almodobar'), ('Pastilla de freno');
UNLOCK TABLES;


--
-- Table structure for table `estudiante`
--

SET character_set_client = utf8mb4;

CREATE TABLE maquinas_registradoras (
  id int NOT NULL AUTO_INCREMENT,
  piso int DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table proveedores
--

LOCK TABLES maquinas_registradoras WRITE;
INSERT INTO maquinas_registradoras (piso) VALUES (2), (4), (1);
UNLOCK TABLES;


--
-- Table structure for table `registro_curso`
--

SET character_set_client = utf8mb4 ;
 
CREATE TABLE venta (
  id int NOT NULL AUTO_INCREMENT,
  idproducto int,
  idcajero int,
  idmaquina int,
  PRIMARY KEY (id),
  CONSTRAINT producto_fk FOREIGN KEY (idproducto) REFERENCES productos (id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT cajero_fk FOREIGN KEY (idcajero) REFERENCES cajeros (id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT maquina_fk FOREIGN KEY (idmaquina) REFERENCES maquinas_registradoras (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table suministra
--

LOCK TABLES venta WRITE;
INSERT INTO venta (idproducto, idcajero, idmaquina) VALUES (1,1,1),(2,2,2),(3,3,3);
UNLOCK TABLES;
