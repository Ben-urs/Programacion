CREATE DATABASE IF NOT EXISTS dawbank;

USE dawbank;

CREATE TABLE IF NOT EXISTS cliente (
  id 				INT AUTO_INCREMENT PRIMARY KEY,
  nombre 			VARCHAR(100) 	NOT NULL,
  dni 				CHAR(9) 		NOT NULL UNIQUE,
  fecha_nacimiento 	DATE 			NOT NULL,
  telefono 			CHAR(9),
  email 			VARCHAR(100),
  direccion 		VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS cuenta (
  iban 				CHAR(24) PRIMARY KEY,
  cliente_id 		INT NOT NULL,
  saldo 			DECIMAL(8,2) 	NOT NULL DEFAULT 0.00,
  FOREIGN KEY (cliente_id) REFERENCES cliente(id)
	ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS movimiento (
  id 				INT AUTO_INCREMENT PRIMARY KEY,
  cuenta_iban 		CHAR(24) 		NOT NULL,
  tipo 				ENUM('Ingreso','Retirada') NOT NULL,
  cantidad 			DECIMAL(15,2) 	NOT NULL,
  fecha 			DATETIME 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (cuenta_iban) REFERENCES cuenta(iban)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE USER 'developer'@'localhost' IDENTIFIED BY 'developer';

GRANT ALL PRIVILEGES ON BBDD_PROG TO 'developer'@'localhost';


INSERT INTO cliente (nombre, dni, fecha_nacimiento, telefono, email, direccion) VALUES
	('Carlos Prates', '11111111A', '2001-01-01', '666666661', '1@gmail.com', 'Calle 1'),
	('Ian Garry', '22222222A', '2002-02-02', '666666662', '2@gmail.com', 'Calle 2');

INSERT INTO cuenta (iban, cliente_id, saldo) VALUES
	('ES1111111111111111111111', 1, 1111.11),
	('ES2222222222222222222222', 2, 2222.22);

INSERT INTO movimiento (cuenta_iban, tipo, cantidad, fecha) VALUES
	('ES1111111111111111111111', 'Ingreso', 1111.11, '2025-01-01 11:01:00'),
	('ES1111111111111111111111', 'Retirada', 111.11, '2025-01-11 11:10:00'),
	('ES2222222222222222222222', 'Ingreso', 2222.22, '2025-02-02 22:00:00'),
    ('ES2222222222222222222222', 'Retirada', 222.22, '2025-02-22 22:02:00');


SELECT * FROM cliente;
SELECT * FROM cuenta;
SELECT * FROM movimiento;