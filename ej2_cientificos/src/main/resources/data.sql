DROP TABLE IF EXISTS asignado_a;
DROP TABLE IF EXISTS cientificos;
DROP TABLE IF EXISTS proyecto;
SET character_set_client = utf8mb4;

CREATE TABLE cientificos (
  dni varchar(8) NOT NULL,
  nomapels nvarchar(255) DEFAULT NULL,
  PRIMARY KEY (dni)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table piezas
--

LOCK TABLES cientificos WRITE;
INSERT INTO cientificos (dni, nomapels) VALUES ('11122234', 'Alfredo Gauss'),('59684732', 'Abigail Clayton'),('29384635', 'Leche Fresca');
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

SET character_set_client = utf8mb4;

CREATE TABLE proyecto (
  id char(4) NOT NULL,
  nombre nvarchar(255) NOT NULL,
  horas int NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table proveedores
--

LOCK TABLES proyecto WRITE;
INSERT INTO proyecto (id, nombre, horas) VALUES ('1234','Almendras caramelizadas', 8), ('1111','Almodobar', 30), ('2222','Pastilla de freno', 5);
UNLOCK TABLES;

--
-- Table structure for table `registro_curso`
--

SET character_set_client = utf8mb4 ;
 
CREATE TABLE asignado_a (
  id int NOT NULL AUTO_INCREMENT,
  idcientifico varchar(8) NOT NULL,
  idproyecto char(4) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT cientifico_fk FOREIGN KEY (idcientifico) REFERENCES cientificos (dni) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT proyecto_fk FOREIGN KEY (idproyecto) REFERENCES proyecto (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table suministra
--

LOCK TABLES asignado_a WRITE;
INSERT INTO asignado_a (idcientifico, idproyecto) VALUES ('11122234','1234'),('59684732','1111'),('29384635','2222');
UNLOCK TABLES;
