-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-08-2022 a las 15:14:22
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vualafacil`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `ciudid` int(6) NOT NULL COMMENT 'Identificador de la tabla ciudad',
  `ciudnombre` varchar(80) NOT NULL COMMENT 'Nombre de la ciudad',
  `ciudnombreaeropuerto` varchar(100) NOT NULL COMMENT 'Nombre del aeropuerto de la ciudad',
  `ciudcodigoaeropuerto` varchar(3) NOT NULL COMMENT 'Código identificador del aeropuerto',
  `ciudhabilitado` tinyint(4) NOT NULL COMMENT 'Ciudad habilitada'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE `pasajero` (
  `pasaid` int(6) NOT NULL COMMENT 'Identificador de la tabla pasajero',
  `pasanombre` varchar(50) NOT NULL COMMENT 'Nombre del pasajero',
  `pasaapellido` varchar(50) NOT NULL COMMENT 'Apellidos del pasajero',
  `pasacorreoelectronico` varchar(80) NOT NULL COMMENT 'Correo electrónico del pasajero',
  `pasacelular` varchar(20) NOT NULL COMMENT 'Celular del pasajero'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `rutaid` int(6) NOT NULL COMMENT 'Identificador de la tabla ruta',
  `ciudidorigen` int(6) NOT NULL COMMENT 'Identificador de la ciudad de origen',
  `ciudiddestino` int(6) NOT NULL COMMENT 'Identificador de la ciudad de destino',
  `rutacodigo` varchar(10) NOT NULL COMMENT 'Código único de la ruta',
  `rutanombre` varchar(80) NOT NULL COMMENT 'Nombre de la ruta',
  `rutafechahorasalida` datetime NOT NULL COMMENT 'Fecha hora de salida de la ruta',
  `rutafechahorallegada` datetime NOT NULL COMMENT 'Fecha hora de llegada de la ruta'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumento`
--

CREATE TABLE `tipodocumento` (
  `tipdocid` int(4) NOT NULL COMMENT 'Identificador de la tabla tipo documento',
  `tipdocsigla` varchar(3) NOT NULL COMMENT 'Silga del tipo documento',
  `tipdocnombre` varchar(50) NOT NULL COMMENT 'Nombre del tipo de documento'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipodocumento`
--

INSERT INTO `tipodocumento` (`tipdocid`, `tipdocsigla`, `tipdocnombre`) VALUES
(1, 'CC', 'Cédula de ciudadanía'),
(2, 'TI', 'Tarjeta de identidad');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiquete`
--

CREATE TABLE `tiquete` (
  `tiquid` int(6) NOT NULL COMMENT 'Identificador del tiquete',
  `usuaid` int(6) NOT NULL COMMENT 'Identificador del usuario que realiza el registro',
  `vuelid` int(6) NOT NULL COMMENT 'identificador del vuelo',
  `pasaid` int(6) NOT NULL COMMENT 'identificador del pasajero',
  `tiquclasepreferencial` tinyint(1) NOT NULL DEFAULT 0 COMMENT 'Determina si es clase preferencial',
  `tiqupuesto` int(2) NOT NULL COMMENT 'Puesto del avión',
  `tiqufechahoraregistro` datetime NOT NULL COMMENT 'Fecha hora en que se realiza el registro en el sistema'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usuaid` int(6) NOT NULL COMMENT 'Identificado de la tabla usuario',
  `tipdocid` int(4) NOT NULL COMMENT 'Identificador del tipo de documento',
  `usuanombre` varchar(50) NOT NULL COMMENT 'Nombre del usuario',
  `usuaapellido` int(50) NOT NULL COMMENT 'Apellidos del usuario',
  `usuadocumento` varchar(50) NOT NULL COMMENT 'Documento del usuario',
  `usuadireccion` varchar(60) DEFAULT NULL COMMENT 'Dirección del usuario',
  `usuatelefono` varchar(20) DEFAULT NULL COMMENT 'Teléfono del usuario',
  `usuausuario` varchar(20) NOT NULL COMMENT 'Usuario de ingreso al sistema',
  `usuacontrasena` int(20) NOT NULL COMMENT 'Contraseña del usuario',
  `usuatipousuario` int(1) NOT NULL COMMENT 'Tipo de usuario'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `vuelid` int(6) NOT NULL COMMENT 'Identificador de la tabla vuelo',
  `rutaid` int(6) NOT NULL COMMENT 'Identificado de la ruta',
  `vuelnombrepiloto` int(100) NOT NULL COMMENT 'Nombre del piloto',
  `vuelnombrecopiloto` int(100) NOT NULL COMMENT 'Nombre del copiloto',
  `vuelnombreazafata` varchar(100) NOT NULL COMMENT 'Nombre de la azafata'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`ciudid`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  ADD PRIMARY KEY (`pasaid`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`rutaid`),
  ADD UNIQUE KEY `rutacodigo` (`rutacodigo`);

--
-- Indices de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  ADD PRIMARY KEY (`tipdocid`);

--
-- Indices de la tabla `tiquete`
--
ALTER TABLE `tiquete`
  ADD PRIMARY KEY (`tiquid`),
  ADD KEY `fk_tiqupasa` (`pasaid`),
  ADD KEY `fk_tiquvuel` (`vuelid`),
  ADD KEY `fk_tiquusua` (`usuaid`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usuaid`),
  ADD KEY `fk_usuatipdoc` (`tipdocid`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`vuelid`),
  ADD KEY `fk_rutavuel` (`rutaid`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  MODIFY `pasaid` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla pasajero';

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `rutaid` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla ruta';

--
-- AUTO_INCREMENT de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  MODIFY `tipdocid` int(4) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla tipo documento', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tiquete`
--
ALTER TABLE `tiquete`
  MODIFY `tiquid` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Identificador del tiquete';

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usuaid` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Identificado de la tabla usuario';

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `vuelid` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla vuelo';

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD CONSTRAINT `fk_rutaciuddestino` FOREIGN KEY (`rutaid`) REFERENCES `ciudad` (`ciudid`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_rutaciudorigen` FOREIGN KEY (`rutaid`) REFERENCES `ciudad` (`ciudid`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tiquete`
--
ALTER TABLE `tiquete`
  ADD CONSTRAINT `fk_tiqupasa` FOREIGN KEY (`pasaid`) REFERENCES `pasajero` (`pasaid`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tiquusua` FOREIGN KEY (`usuaid`) REFERENCES `usuario` (`usuaid`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tiquvuel` FOREIGN KEY (`vuelid`) REFERENCES `vuelo` (`vuelid`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuatipdoc` FOREIGN KEY (`tipdocid`) REFERENCES `tipodocumento` (`tipdocid`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `fk_rutavuel` FOREIGN KEY (`rutaid`) REFERENCES `ruta` (`rutaid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
