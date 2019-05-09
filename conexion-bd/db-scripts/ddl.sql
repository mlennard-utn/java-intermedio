CREATE TABLE `java`.`usuarios` (
  `idusuarios` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `apellido` VARCHAR(100) NOT NULL,
  `edad` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idusuarios`))
ENGINE = InnoDB
COMMENT = 'Tabla de usuarios';