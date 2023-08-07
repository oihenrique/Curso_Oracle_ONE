use sucos;

# atualizando um valor da tabela
update tbprodutos set embalagem = 'Lata', preco_lista = 2.46
where produto = '544931';

update tbprodutos set embalagem = 'Garrafa' where produto = '1078680';

update tabela_de_vendedores set percentual_comissao = 0.1 where matricula = '00233';

select * from tbprodutos