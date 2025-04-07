DROP DATABASE IF EXISTS BBDD_PROG;
CREATE DATABASE BBDD_PROG;
USE BBDD_PROG;

CREATE USER 'developer'@'localhost' IDENTIFIED BY 'developer';

GRANT ALL PRIVILEGES ON BBDD_PROG TO 'developer'@'localhost';

CREATE TABLE Tipo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE Producto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    referencia VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    tipo_id INT,
    cantidad INT NOT NULL,
    precio DOUBLE NOT NULL,
    descuento INT DEFAULT 0,
    iva INT DEFAULT 0,
    aplicar_dto BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (tipo_id) REFERENCES Tipo(id)
);

INSERT INTO Tipo (nombre) VALUES ('Articulos de oficina');
INSERT INTO Tipo (nombre) VALUES ('Productos para mascotas');
INSERT INTO Tipo (nombre) VALUES ('Productos de limpieza');
INSERT INTO Tipo (nombre) VALUES ('Ropa y accesorios');
INSERT INTO Tipo (nombre) VALUES ('Alimentos y bebidas');
INSERT INTO Tipo (nombre) VALUES ('Hogar y jardin');
INSERT INTO Tipo (nombre) VALUES ('Productos de cuidado personal');
INSERT INTO Tipo (nombre) VALUES ('Juguetes y juegos');
INSERT INTO Tipo (nombre) VALUES ('Electronica');
INSERT INTO Tipo (nombre) VALUES ('Salud y bienestar');

INSERT INTO Producto (referencia, nombre, descripcion, tipo_id, cantidad, precio, descuento, iva, aplicar_dto) VALUES 
('O001', 'Impresora', 'Imprime', 1, 30, 199.99, 5, 21, TRUE),
('M001', 'Comida para Perros', 'Alimenta', 5, 200, 34.99, 0, 21, FALSE),
('L001', 'Limpiador', 'Limpia', 3, 150, 4.99, 10, 21, TRUE),
('R001', 'Chaqueta de Cuero', 'Abriga', 2, 50, 149.99, 3, 21, TRUE),
('A001', 'Te Verde', 'Estimula', 10, 300, 5.99, 0, 21, FALSE),
('H001', 'Sofa', 'Acomoda', 4, 25, 899.99, 8, 21, TRUE),
('P001', 'Crema Hidratante', 'Hidrata', 8, 50, 12.99, 5, 21, TRUE),
('J001', 'Juego de Construcción', 'Entretiene', 8, 120, 29.99, 0, 21, TRUE),
('E001', 'Auriculares', 'Sonante', 9, 50, 89.99, 10, 21, TRUE),
('S001', 'Suplemento de Vitamina C', 'Fortalece', 7, 100, 19.99, 0, 21, FALSE);


SELECT * FROM Tipos;
SELECT * FROM Producto;