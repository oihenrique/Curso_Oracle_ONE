create database loja_virtual;

use loja_virtual;

create table produto (
id int auto_increment,
nome varchar(50) not null,
descricao varchar(255),
primary key(id))
Engine = InnoDB;