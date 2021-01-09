create database projetoZup;

use projetoZup;

create table conta
	(
      idConta integer(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
      nome varchar(100),
      email varchar(200),
      cpf varchar(11),
	dataNascimento date
  );