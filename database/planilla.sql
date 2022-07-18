-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2022 a las 21:35:27
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
-- Base de datos: `planilla`
--
CREATE DATABASE IF NOT EXISTS `planilla` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `planilla`;

DELIMITER $$
--
-- Procedimientos
--
DROP PROCEDURE IF EXISTS `sp_insert_detalle_planilla`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_detalle_planilla` (IN `p_id_planilla` VARCHAR(20), IN `p_cedula_empleado` VARCHAR(20), IN `p_horas_trabajadas` VARCHAR(20), IN `p_sph` VARCHAR(20), IN `p_sb` VARCHAR(20), IN `p_ss` VARCHAR(20), IN `p_se` VARCHAR(20), IN `p_sn` VARCHAR(20))   BEGIN
		insert into tbl_detalle_planilla 
		values (p_id_planilla, p_cedula_empleado, p_horas_trabajadas, p_sph, p_sb, p_ss, p_se, p_sn);
	END$$

DROP PROCEDURE IF EXISTS `sp_insert_empleado`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_empleado` (IN `p_cedula` VARCHAR(20), IN `p_nombre1` VARCHAR(100), IN `p_nombre2` VARCHAR(100), IN `p_apellido1` VARCHAR(100), IN `p_apellido2` VARCHAR(100), IN `p_fechanacimiento` VARCHAR(20), IN `p_direccion` VARCHAR(250), IN `p_telefono` VARCHAR(30))   BEGIN
		insert into tbl_empleado 
		values (p_cedula, p_nombre1, p_nombre2, p_apellido1, p_apellido2, p_fechanacimiento, p_direccion, p_telefono);
	END$$

DROP PROCEDURE IF EXISTS `sp_insert_planilla`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_planilla` (IN `p_fecha` VARCHAR(20))   BEGIN
		insert into tbl_planilla (fecha)
		values (p_fecha);
		
		select max(id_planilla) as ultimo_id
		from tbl_planilla;
	END$$

DROP PROCEDURE IF EXISTS `sp_insert_usuarios`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_usuarios` (IN `p_cedula` VARCHAR(20), IN `p_userid` VARCHAR(20), IN `p_contrasenna` VARCHAR(10), IN `p_nombre` VARCHAR(100), IN `p_apellido` VARCHAR(100), IN `p_direccion` VARCHAR(250))   BEGIN
		insert into tbl_usuarios (cedula, userid, contrasenna, nombre, apellido, direccion)
		values (p_cedula, p_userid, p_contrasenna, p_nombre, p_apellido, p_direccion);
	END$$

DROP PROCEDURE IF EXISTS `sp_LoginCheck`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_LoginCheck` (`_userid` VARCHAR(20), `_contrasenna` VARCHAR(20))   BEGIN
select "true" as result from tbl_usuarios where userid = _userid and contrasenna = _contrasenna;
END$$

DROP PROCEDURE IF EXISTS `sp_select_planilla_por_id`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_planilla_por_id` (IN `p_id_planilla` VARCHAR(20))   BEGIN

		SELECT p.id_planilla, 
		       p.fecha, 
		       e.cedula,
		       e.nombre1,
		       e.nombre2,
		       e.apellido1,
		       e.apellido2,
		       d.horas_trabajadas,
		       d.sph,
		       d.sb,
		       d.ss,
		       d.se,
		       d.sn 
		FROM tbl_planilla p JOIN tbl_detalle_planilla d ON p.id_planilla = d.id_planilla
		 JOIN tbl_empleado e ON d.cedula_empleado = e.cedula 
		 WHERE p.id_planilla=p_id_planilla;
	END$$

DROP PROCEDURE IF EXISTS `sp_select_tbl_empleado_by_id`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_empleado_by_id` (`_id` VARCHAR(20))   BEGIN
SELECT * FROM tbl_empleado WHERE cedula = _id;
END$$

DROP PROCEDURE IF EXISTS `sp_select_tbl_usuarios`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_usuarios` ()   BEGIN
select * from tbl_usuarios;
END$$

DROP PROCEDURE IF EXISTS `sp_select_tbl_usuarios_by_id`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_usuarios_by_id` (`_id` VARCHAR(20))   BEGIN
select * from tbl_usuarios where cedula = _id;
END$$

DROP PROCEDURE IF EXISTS `sp_select_totales_planilla`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_totales_planilla` ( )   BEGIN
		SELECT p.id_planilla, 
		       p.fecha, 
		       SUM(sb)AS total_sb, 
		       SUM(ss) AS total_ss, 
		       SUM(se) AS total_se,
		       SUM(sn) AS total_sn
		FROM tbl_planilla p JOIN tbl_detalle_planilla d ON p.id_planilla = d.id_planilla
		GROUP BY p.id_planilla, p.fecha;
	END$$

DROP PROCEDURE IF EXISTS `sp_select_usuario_empleado`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_usuario_empleado` (`_cedula` VARCHAR(20))   BEGIN
select 
if(_cedula = e.cedula and e.cedula = u.cedula, true, false)
as usuario_empleado
from tbl_usuarios as u,
tbl_empleado as e
where _cedula = e.cedula and e.cedula = u.cedula;
END$$

DROP PROCEDURE IF EXISTS `sp_select_validar_usuario`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_validar_usuario` (IN `p_userid` VARCHAR(20), IN `p_contrasenna` VARCHAR(10))   BEGIN
		select count(*) as numero
	          from tbl_usuarios
	          where userid = p_userid
	          and contrasenna = p_contrasenna; 
	END$$

DROP PROCEDURE IF EXISTS `sp_update_tbl_empleado`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_tbl_empleado` (`_cedula` VARCHAR(20), `_nombre1` VARCHAR(100), `_nombre2` VARCHAR(100), `_apellido1` VARCHAR(100), `_apellido2` VARCHAR(100), `_fechanacimeinto` DATE, `_direccion` VARCHAR(250), `_telefono` VARCHAR(30))   BEGIN
UPDATE tbl_empleado 
SET 
    cedula = _cedula,
    nombre1 = _nombre1,
    nombre2 = _nombre2,
    apellido1 = _apellido1,
    apellido2 = _apellido2,
    fechanacimeinto = _fechanacimeinto,
    direccion = _direccion,
    telefono = _telefono
WHERE
    _cedula = cedula;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_detalle_planilla`
--

DROP TABLE IF EXISTS `tbl_detalle_planilla`;
CREATE TABLE `tbl_detalle_planilla` (
  `id_planilla` bigint(20) DEFAULT NULL,
  `cedula_empleado` varchar(20) DEFAULT NULL,
  `horas_trabajadas` float DEFAULT NULL,
  `sph` float DEFAULT NULL,
  `sb` float DEFAULT NULL,
  `ss` float DEFAULT NULL,
  `se` float DEFAULT NULL,
  `sn` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Truncar tablas antes de insertar `tbl_detalle_planilla`
--

TRUNCATE TABLE `tbl_detalle_planilla`;
--
-- Volcado de datos para la tabla `tbl_detalle_planilla`
--

INSERT INTO `tbl_detalle_planilla` (`id_planilla`, `cedula_empleado`, `horas_trabajadas`, `sph`, `sb`, `ss`, `se`, `sn`) VALUES
(4, '7-777-7777', 10, 10, 100, 7.25, 1.25, 90),
(4, '8-87-7777', 10, 10, 100, 7.25, 1.25, 90),
(4, '7-77-7777', 10, 10, 100, 7.25, 1.25, 90),
(5, '7-77-7777', 10, 10, 100, 7.25, 1.25, 90),
(5, '8-87-7777', 10, 10, 100, 7.25, 1.25, 90);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_empleado`
--

DROP TABLE IF EXISTS `tbl_empleado`;
CREATE TABLE `tbl_empleado` (
  `cedula` varchar(20) NOT NULL,
  `nombre1` varchar(100) DEFAULT NULL,
  `nombre2` varchar(100) DEFAULT NULL,
  `apellido1` varchar(100) DEFAULT NULL,
  `apellido2` varchar(100) DEFAULT NULL,
  `fechanacimeinto` date DEFAULT NULL,
  `direccion` varchar(250) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Truncar tablas antes de insertar `tbl_empleado`
--

TRUNCATE TABLE `tbl_empleado`;
--
-- Volcado de datos para la tabla `tbl_empleado`
--

INSERT INTO `tbl_empleado` (`cedula`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `fechanacimeinto`, `direccion`, `telefono`) VALUES
('1456', 'manganesio', 'pepe', 'gonzales', 'loandra', '1996-03-04', 'clalle 15', '1456-1456'),
('465489978', 'asfasfafs', 'safasfxzvzxvz', 'asfhjfjfgj', 'gjfjgsdtet', '1996-02-04', '121354hdf df hdfh dfh df', '416879'),
('7-77-7777', 'Maria', 'Ana', 'Perez', 'Castro', '2000-04-30', 'La Chorrera', '2222-2222'),
('7-777-7777', 'Maria', 'Ana', 'Perez', 'Castro', '2000-04-30', 'La Chorrera', '2222-2222'),
('8-87-7777', 'Maria', 'Ana', 'Perez', 'Castro', '2000-04-30', 'La Chorrera', '2222-2222'),
('8-956-740', 'Alessandro', 'Javier', 'Olivares', 'Velarde', '2000-03-31', 'Vacamonte, El Tecal', '6737-3828');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_planilla`
--

DROP TABLE IF EXISTS `tbl_planilla`;
CREATE TABLE `tbl_planilla` (
  `id_planilla` bigint(20) NOT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Truncar tablas antes de insertar `tbl_planilla`
--

TRUNCATE TABLE `tbl_planilla`;
--
-- Volcado de datos para la tabla `tbl_planilla`
--

INSERT INTO `tbl_planilla` (`id_planilla`, `fecha`) VALUES
(1, '2020-05-16'),
(2, '2020-08-16'),
(3, '2020-12-06'),
(4, '2020-07-17'),
(5, '2021-11-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuarios`
--

DROP TABLE IF EXISTS `tbl_usuarios`;
CREATE TABLE `tbl_usuarios` (
  `cedula` varchar(20) NOT NULL,
  `userid` varchar(20) DEFAULT NULL,
  `contrasenna` varchar(20) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `direccion` varchar(250) DEFAULT NULL,
  `fechaingreso` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Truncar tablas antes de insertar `tbl_usuarios`
--

TRUNCATE TABLE `tbl_usuarios`;
--
-- Volcado de datos para la tabla `tbl_usuarios`
--

INSERT INTO `tbl_usuarios` (`cedula`, `userid`, `contrasenna`, `nombre`, `apellido`, `direccion`, `fechaingreso`) VALUES
('123456789', 'UserPrueba', 'cHJ1ZWJh', 'prueba_nombre', 'prueba_apellido', 'prueba_direccion', '2022-07-16 23:40:27'),
('7-77-7777', 'Maria2022', 'bWFyaWEyMDIy', 'Maria', 'Perez', 'La Chorrera', '2022-07-16 19:18:16'),
('8-956-740', 'Alessandro12', 'MTIzNDU2Nzg5', 'Alessandro', 'Olivares', 'Vacamonte', '2022-07-15 23:45:14');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_empleado`
--
ALTER TABLE `tbl_empleado`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `tbl_planilla`
--
ALTER TABLE `tbl_planilla`
  ADD PRIMARY KEY (`id_planilla`);

--
-- Indices de la tabla `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  ADD PRIMARY KEY (`cedula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_planilla`
--
ALTER TABLE `tbl_planilla`
  MODIFY `id_planilla` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
