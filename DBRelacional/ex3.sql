CREATE DATABASE colegioGen;
USE colegioGen;

CREATE TABLE alunos(
	nome VARCHAR (50) NOT NULL,
    idade INT(2),
    turma CHAR,
    nota DECIMAL (2, 1),
	materia VARCHAR(50),
    PRIMARY KEY (materia)
);

INSERT INTO alunos VALUES("Beatriz Cerqueira", 17, "E", 8.9, "HISTÓRIA");
INSERT INTO alunos VALUES("Maria Clara Andrade", 13, "B", 9.7, "MATEMÁTICA");
INSERT INTO alunos VALUES("André Carvalho", 14, "A", 7.0, "GEOGRAFIA");
INSERT INTO alunos VALUES("Lucas de Souza", 11, "A", 2.5, "QUIMÍCA");
INSERT INTO alunos VALUES("Andressa Massoni", 9, "C", 9.0, "FILOSOFIA");
INSERT INTO alunos VALUES("Ana Clara Pinheiro", 14, "B", 9.0, "FÍSICA");
INSERT INTO alunos VALUES("Carlos Albuquerque", 15, "B", 9.9, "TECNOLOGIA");
INSERT INTO alunos VALUES("Luma da Silva", 15, "B", 8.0, "SOCIOLOGIA");

SELECT * FROM alunos WHERE nota > 7;
SELECT * FROM alunos WHERE nota < 7;
UPDATE alunos SET turma = "1B" WHERE materia="GEOGRAFIA"