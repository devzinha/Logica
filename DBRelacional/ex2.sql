CREATE DATABASE lojaZinha;
USE lojaZinha;

CREATE TABLE produtos(
	id INT(2),
	nome VARCHAR (50) NOT NULL,
	preco DECIMAL(7, 2),
    emEstoque INT(3),
    maisVendidos BOOLEAN,
    PRIMARY KEY (id)
);

INSERT INTO produtos VALUES(1, "Vestido Amália", 490.70, 1, TRUE);
INSERT INTO produtos VALUES(2, "Casaco Pele Fake", 699.90, 8, TRUE);
INSERT INTO produtos VALUES(3, "Coturno Vegano", 399.90, 56, FALSE);
INSERT INTO produtos VALUES(4, "Cropped Ciganinha", 99.90, 2, FALSE);
INSERT INTO produtos VALUES(5, "Calça Jeans Spirit", 399.90, 6, TRUE);
INSERT INTO produtos VALUES(6, "Sandália Couro Fake", 356.90, 200, FALSE);
INSERT INTO produtos VALUES(7, "Bolsa Made in Paris", 999.90, 45, TRUE);
INSERT INTO produtos VALUES(8, "Saia Andrea", 1000, 3, TRUE);

SELECT * FROM produtos WHERE preco > 500;
SELECT * FROM produtos WHERE preco < 500;
UPDATE produtos SET emEstoque = 0 WHERE id = 1;
