# Filtro por maior, menor e igual
select * from tbcliente where idade > 22;

select * from tbcliente where idade < 22;
select * from tbcliente where idade <= 22;

# <> significa diferente
select * from tbcliente where idade <> 22;

# ele verifica por ordem alfabética
select * from tbcliente where nome > 'Fernando Cavalcante';

# Pontos flutuantes não podem ser encontrados por numeros exatos, 
# por isso é melhor utilizar sinal de maior ou menor, para achar o valor exato seria melhor
# utilizar o tipo decimal
select * from tbcliente where preco_lista > 16.008;
# ou
select * from tbcliente where preco_lista  between 16.007 and 16.009;
