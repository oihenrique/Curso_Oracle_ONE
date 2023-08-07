# Filtrando informações de acordo com valores
select * from tbproduto where produto = '544931';

select * from tbcliente where cidade = 'Rio de janeiro';

select * from tbproduto where sabor = 'Limão';

update tbproduto set sabor = 'Cítricos' where sabor = 'Limão';

select * from tbproduto where sabor = 'Cítricos';