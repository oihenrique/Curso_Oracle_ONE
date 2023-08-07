use sucos;

# adicionando chave primaria
alter table tbcliente add primary key (cpf);

# adicionando coluna a uma tabela existente
alter table tbcliente add column (data_nascimento date);


insert into tbcliente (
cpf, nome, endereco1, endereco2, bairro, cidade, estado, cep, idade, sexo,
limite_credito, volume_compra, primeira_compra, data_nascimento)
values ('00388934505', 'João da Silva', 'Rua projetada A numero 10', '',
'Vila Roman', 'Caratinga', 'Amazonas', '2222222', 30, 'M', 10000.00, 2000,
0, '1989-10-05');

select * from tbcliente;

alter table tabela_de_vendedores add primary key (matricula);
alter table tabela_de_vendedores add column (data_admissao date);
alter table tabela_de_vendedores add column (de_ferias bit);

insert into tabela_de_vendedores (
matricula, nome, percentual_comissao, data_admissao, de_ferias)
values ('00237', 'Roberta Martins', 0.11, '2017-03-18', 1);

insert into tabela_de_vendedores (
matricula, nome, percentual_comissao, data_admissao, de_ferias)
values ('00238', 'Péricles Alves', 0.11, '2016-08-21', 0);

update tabela_de_vendedores set data_admissao = '2014-08-15', de_ferias = 0
where matricula = '00235';

update tabela_de_vendedores set data_admissao = '2013-09-17', de_ferias = 1
where matricula = '00236';

select * from tabela_de_vendedores;