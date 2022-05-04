create table cliente(codigo serial primary key,
nome varchar(50),
telefone varchar(11),
email varchar(30));

insert into cliente (nome, telefone, email)
values ("Jão", "22431000", "jao@gmail.com");

insert into cliente (nome, telefone, email)
values ("Maria", "22485027", "maria@gmail.com");

