CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    nome VARCHAR (255),
    popular BOOLEAN,
    PRIMARY KEY (id_categoria) 
);

CREATE TABLE tb_pizza (
	id_pizza INT AUTO_INCREMENT,
    id_categoria INT,
    sabor VARCHAR (255),
    preco DECIMAL (4, 2),
    vendas INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (nome, popular) 
	VALUES ("Brotinho", 0), ("Pequena", 0), ("Média", 1), ("Grande", 1), ("Gigante", 1);
    
INSERT INTO tb_pizza (sabor, preco, vendas, id_categoria)
	VALUES ("Portuguesa", 44.90, 30, 5), ("4 Queijos", 35, 23, 4), ("Abobrinha", 54.90, 32, 1), ("Strogonoff", 60, 33, 3), 
	("Marguerita", 30, 19, 3), ("Carne Seca", 40, 32, 2), ("Aliche", 34.90, 5, 4), ("Camarão", 70, 43, 3);
    
SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco >= 29 AND preco <= 60;
SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria;
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome = "Grande";