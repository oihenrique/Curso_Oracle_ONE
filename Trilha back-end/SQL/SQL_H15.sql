select * from tbcliente where DATA_NASCIMENTO > '1995-01-13';

select * from tbcliente where year(data_nascimento) = 1995;

select * from tbcliente where month(data_nascimento) = 10;
 
select * from tabela_de_vendedores where year(data_admissao) < 2016 and de_ferias = 1;
 