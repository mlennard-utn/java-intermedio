CREATE TABLE `java`.`usuarios` (
  `idusuarios` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `apellido` VARCHAR(100) NOT NULL,
  `edad` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idusuarios`))
ENGINE = InnoDB
COMMENT = 'Tabla de usuarios';

CREATE TABLE `java`.`auto` ( `id` INT NOT NULL AUTO_INCREMENT , `color` VARCHAR(45) NOT NULL , `modelo` VARCHAR(45) NOT NULL , `marca` VARCHAR(45) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB; 