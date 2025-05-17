CREATE DATABASE inventario;
USE inventario;

-- Tabla de usuarios
CREATE TABLE tabla_usuarios(
    idUsuario INT(12) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40),
    apellido VARCHAR(40),
    usuario VARCHAR(50),
    contrasena VARCHAR(250) UNIQUE
);


-- Tabla de categorías
CREATE TABLE tabla_categorias(
    idCategoria INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(180) NOT NULL
);


-- Tabla de proveedores
CREATE TABLE tabla_proveedores(
    idProveedor INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    apellido VARCHAR(40) NOT NULL,
    celular VARCHAR(15) NOT NULL
);


-- Tabla de clientes
CREATE TABLE tabla_clientes (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(15),
    email VARCHAR(100) UNIQUE
);

-- Tabla de productos
CREATE TABLE tabla_productos(
    idProducto INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precioCompra DECIMAL(10,2) NOT NULL,
    cantidad INT(11) NOT NULL,
    idCategoria INT(11) NOT NULL,
    idProveedor INT(11) NOT NULL,
    cantidadStop INT(11) NOT NULL, -- Se actualizará al vender o ingresar productos
    fechaCompra DATE,
    fechaVencimiento DATE,
    tipoMedida VARCHAR(30),
    FOREIGN KEY (idCategoria) REFERENCES tabla_categorias(idCategoria),
    FOREIGN KEY (idProveedor) REFERENCES tabla_proveedores(idProveedor)
);


-- Tabla de ventas
CREATE TABLE tabla_ventas (
    idVenta INT PRIMARY KEY AUTO_INCREMENT,
    idCliente INT NOT NULL,
    fechaVenta DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES tabla_clientes(idCliente)
);


-- Tabla de detalles de ventas 
CREATE TABLE tabla_detalle_ventas (
    idDetalle INT PRIMARY KEY AUTO_INCREMENT,
    idVenta INT NOT NULL,
    idProducto INT NOT NULL,
    cantidad INT NOT NULL,
    precioUnitario DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (idVenta) REFERENCES tabla_ventas(idVenta),
    FOREIGN KEY (idProducto) REFERENCES tabla_productos(idProducto)
);






