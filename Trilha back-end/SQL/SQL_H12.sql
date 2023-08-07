select * from tbcliente;

# Selecionando campos específicos
select cpf, nome from tbcliente;

# Filtrando campos e especificando limite de linhas exibidas
select cpf, nome from tbcliente limit 5;

# aleterando o nome de exibição das colunas (alias)
select cpf as CPF_CLIENTE, nome as NOME_CLIENTE from tbcliente;

# As colunas aparecem na ordem que foram chamadas no código
select nome, matricula from tabela_de_vendedores;