CREATE DATABASE recursos;
USE recursos;

CREATE TABLE funcionários(
    id INT (5),
    nome VARCHAR (50) NOT NULL,
    salário DECIMAL (10, 2), 
    telefone VARCHAR (10) NOT NULL,
	cargo VARCHAR (30),
    PRIMARY KEY (id)
);

INSERT INTO funcionários VALUES (1, "Maria Eduarda Pinheiro", 7000, "958811433", "Gerente de Ecommerce");
INSERT INTO funcionários VALUES (2, "Felipe Januário", 5900, "952739809", "Analista de Ecommerce");
INSERT INTO funcionários VALUES (3, "Beatriz Silveira", 3400, "97776-5086", "Auxiliar de Ecommerce");
INSERT INTO funcionários VALUES (4, "Angela Borges", 3000, "965189654", "Supervisora de Marketing");
INSERT INTO funcionários VALUES (5, "Clara Maria", 1800, "989156325", "Atendimento ao Cliente");

SELECT * FROM funcionários WHERE salário > 2000;
SELECT * FROM funcionários WHERE salário < 2000;
UPDATE funcionários SET telefone = "989156325" WHERE id = 2;