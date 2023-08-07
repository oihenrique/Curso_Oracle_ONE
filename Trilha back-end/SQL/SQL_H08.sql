use sucos;

# adicionando chave primária
alter table tbprodutos add primary key (produto);

INSERT INTO tbprodutos (
PRODUTO,  NOME, EMBALAGEM, TAMANHO, SABOR,
PRECO_LISTA) VALUES
('1078680', 'Frescor do Verão - 470 ml - Manga', 'Garrafa', '470 ml','Manga',5.18);

select * from tbprodutos