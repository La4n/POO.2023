create database if not exists Estoque;
use Estoque;
create table produtoo(
Posicao int auto_increment primary key,

Produto varchar(50),
Quantidade int,
preco decimal(2,1),
Codigo int
);
