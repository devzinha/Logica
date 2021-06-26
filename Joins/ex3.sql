CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    nome VARCHAR (255),
    em_estoque BOOLEAN,
    PRIMARY KEY (id_categoria) 
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
    id_categoria INT,
    nome VARCHAR (255),
    preco DECIMAL (4, 2),
    vendas INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (nome, em_estoque) 
	VALUES ("Cosméticos", 0), ("Medicamentos", 0), ("Mamãe e Bebê", 1), ("Vitaminas", 1), ("Diários", 1);
    
INSERT INTO tb_produto (nome, preco, vendas, id_categoria)
	VALUES ("Absorvente com abas", 8.00, 45, 5), ("Hidratante Labial", 14.90, 56, 1), ("Dorflex", 7.00, 15, 2), ("Gilette Feminina", 6.80, 90, 5), 
	("Desodorante", 9.99, 97, 5), ("Esmalte Risque", 6.90, 100, 1), ("Hidratante Facial", 45.00, 19, 1), ("Fralda Pampers", 50.00, 70, 3);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco >= 3 AND preco <= 60;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome = "Diários";