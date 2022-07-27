-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-07-2022 a las 00:08:14
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

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_detalle_planilla` (IN `p_id_planilla` VARCHAR(20), IN `p_cedula_empleado` VARCHAR(20), IN `p_horas_trabajadas` VARCHAR(20), IN `p_sph` VARCHAR(20), IN `p_sb` VARCHAR(20), IN `p_ss` VARCHAR(20), IN `p_se` VARCHAR(20), IN `p_sn` VARCHAR(20))   BEGIN
		insert into tbl_detalle_planilla 
		values (p_id_planilla, p_cedula_empleado, p_horas_trabajadas, p_sph, p_sb, p_ss, p_se, p_sn);
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_empleado` (IN `p_cedula` VARCHAR(20), IN `p_nombre1` VARCHAR(100), IN `p_nombre2` VARCHAR(100), IN `p_apellido1` VARCHAR(100), IN `p_apellido2` VARCHAR(100), IN `p_fechanacimiento` VARCHAR(20), IN `p_direccion` VARCHAR(250), IN `p_telefono` VARCHAR(30))   BEGIN
		insert into tbl_empleado 
		values (p_cedula, p_nombre1, p_nombre2, p_apellido1, p_apellido2, p_fechanacimiento, p_direccion, p_telefono);
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_planilla` (IN `p_fecha` VARCHAR(20))   BEGIN
		insert into tbl_planilla (fecha)
		values (p_fecha);
		
		select max(id_planilla) as ultimo_id
		from tbl_planilla;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_planilla_simple` (`_fecha` DATE)   BEGIN
IF (SELECT fecha FROM tbl_planilla where fecha = _fecha) THEN
    Select "false" as "existe" from tbl_planilla;
    ELSE
    INSERT INTO tbl_planilla (fecha) values(_fecha);
    END IF;
            select max(id_planilla) as ultimo_id, fecha
        from tbl_planilla where fecha = _fecha;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_usuarios` (IN `p_cedula` VARCHAR(20), IN `p_userid` VARCHAR(20), IN `p_contrasenna` VARCHAR(10), IN `p_nombre` VARCHAR(100), IN `p_apellido` VARCHAR(100), IN `p_direccion` VARCHAR(250))   BEGIN
		insert into tbl_usuarios (cedula, userid, contrasenna, nombre, apellido, direccion)
		values (p_cedula, p_userid, p_contrasenna, p_nombre, p_apellido, p_direccion);
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_LoginCheck` (`_userid` VARCHAR(20), `_contrasenna` VARCHAR(20))   BEGIN
select "true" as result, nombre, apellido from tbl_usuarios where userid = _userid and contrasenna = _contrasenna;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_calculo_planilla` ()   BEGIN
select a.id_planilla, c.fecha, b.cedula,
b.nombre1, b.nombre2, b.apellido1,
b.apellido2, a.horas_trabajadas,
a.sph, a.sb, a.ss, a.se, a.sn
from tbl_detalle_planilla as a,
tbl_empleado as b,
tbl_planilla as c
where a.cedula_empleado = b.cedula
and a.id_planilla = c.id_planilla;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_join_planilla_detallada` ()   BEGIN
SELECT a.id_planilla, a.fecha, sum(b.sb) as "TSB", sum(b.ss) as "TSS", sum(b.se) as "TEE", sum(b.sn) as "TSN" from tbl_planilla as a inner join tbl_detalle_planilla as b where a.id_planilla = b.id_planilla group by a.id_planilla;
END$$

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

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_empleado_by_id` (`_id` VARCHAR(20))   BEGIN
SELECT * FROM tbl_empleado WHERE cedula = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_planilla_id_planilla` ()   BEGIN
        SELECT MAX(id_planilla) AS id_planilla FROM tbl_planilla;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_usuarios` ()   BEGIN
select * from tbl_usuarios;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_tbl_usuarios_by_id` (`_id` VARCHAR(20))   BEGIN
select *, "true" as result from tbl_usuarios where cedula = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_totales_planilla` ()   BEGIN
		SELECT p.id_planilla, 
		       p.fecha, 
		       SUM(sb)AS total_sb, 
		       SUM(ss) AS total_ss, 
		       SUM(se) AS total_se,
		       SUM(sn) AS total_sn
		FROM tbl_planilla p JOIN tbl_detalle_planilla d ON p.id_planilla = d.id_planilla
		GROUP BY p.id_planilla, p.fecha;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_validar_usuario` (IN `p_userid` VARCHAR(20), IN `p_contrasenna` VARCHAR(10))   BEGIN
		select count(*) as numero
	          from tbl_usuarios
	          where userid = p_userid
	          and contrasenna = p_contrasenna; 
	END$$

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

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_tbl_usuarios` (`_cedula` VARCHAR(20), `_userid` VARCHAR(20), `_contrasenna` VARCHAR(20), `_nombre` VARCHAR(100), `_apellido` VARCHAR(100), `_direccion` VARCHAR(250))   BEGIN
UPDATE tbl_usuarios 
SET 
    userid = _userid,
    contrasenna = _contrasenna,
    nombre = _nombre,
    apellido = _apellido,
    direccion = _direccion
WHERE
    cedula = _cedula;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_detalle_planilla`
--

CREATE TABLE tbl_empleado_planilla (
  id_planilla bigint(11) NOT NULL,
  cedula_empleado varchar(20) NOT NULL,
  horas_trabajadas float NOT NULL,
  sph float NOT NULL,
  sb float NOT NULL,
  ss float NOT NULL,
  se float NOT NULL,
  sn float NOT NULL,
)

-- ------------------------------------------------------
--
-- Estructura de tabla para la tabla `tbl_empleado`
--

CREATE TABLE tbl_empleado (
  cedula varchar(20) NOT NULL,
  nombre1 varchar(20) NOT NULL,
  nombre2 varchar(20) NOT NULL,
  apellido1 varchar(20) NOT NULL,
  apellido2 varchar(20) NOT NULL,
  fecha_nacimiento date DEFAULT NULL,
  direccion varchar(100) NOT NULL,
  telefono varchar(20) NOT NULL,
  PRIMARY KEY (cedula)
)

--
-- Estructura de tabla para la tabla `tbl_planilla`
--

CREATE TABLE tbl_planilla (
  id_planilla bigint(11) NOT NULL AUTO_INCREMENT,
  fecha date NOT NULL,
  PRIMARY KEY (id_planilla)
);


CREATE TABLE tbl_usuarios (
  cedula varchar(20) NOT NULL,
  userid varchar(20) NOT NULL,
  contrasenna varchar(20) NOT NULL,
  nombre varchar(20) NOT NULL,
  apellido varchar(20) NOT NULL,
  direccion varchar(100) NOT NULL,
  fecha_ingreso datetime
) 

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
  MODIFY `id_planilla` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
