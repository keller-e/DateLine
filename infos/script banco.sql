create database dateline;
use dateline;

create table cliente(
id int auto_increment primary key NOT NULL,
nome varchar(200) NOT NULL,
dataNascimento varchar(15) NOT NULL,
genero varchar(10)NOT NULL,
cpf varchar(15)NOT NULL,
endereco varchar(150)NOT NULL,
telefone varchar(20)NOT NULL,
email varchar(80)NOT NULL,
doencaCronica varchar(300)NOT NULL,
usoMedimento varchar(300)NOT NULL,
alergia varchar(300)NOT NULL,
cirurgia varchar(300)NOT NULL,
condicaoDermatologica varchar(300)NOT NULL
);

create table atendimento(
`id` int auto_increment primary key NOT NULL,
`data` varchar(15) NOT NULL,
`hora` varchar (7) NOT NULL,
`procedimento` varchar(35) NOT NULL,
`formaPagamento` varchar(8) NOT NULL
);

CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `login` varchar(30) DEFAULT NULL,
  `senha` varchar(30) DEFAULT NULL,
  `nivel` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `usuario` (`login`, `senha`, `nivel`) 
VALUES ('admin', '1234', 'administrador');

ALTER TABLE atendimento ADD COLUMN cliente_id BIGINT;