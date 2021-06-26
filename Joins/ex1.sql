CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe (
	id_classe INT AUTO_INCREMENT,
    nome_classe VARCHAR (255) NOT NULL,
    dificuldade VARCHAR (255), 
    PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem (
	id_personagem INT AUTO_INCREMENT,
    nome_personagem VARCHAR (255),
    level_personagem INT,
    ataque_personagem INT,
    defesa_personagem INT,
    id_classe INT,
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (id_classe) REFERENCES tb_classe (id_classe) 
);

INSERT INTO tb_classe (nome_classe, dificuldade) 
	VALUES ("Arqueiro", "Média"), ("Mago", "Difícil"), ("Cavaleiro", "Fácil"), ("Bardo", "Difícil"), ("Paladino", "Média"), ("Assassino", "Fácil");
    
    
INSERT INTO tb_personagem (nome_personagem, level_personagem, ataque_personagem, defesa_personagem, id_classe) 
	VALUES ("Player A", FLOOR(RAND(122)*256), FLOOR(RAND(23)*3001), FLOOR(RAND(32425)*3001), 1),
	("Player B", FLOOR(RAND(1)*256), FLOOR(RAND(2)*3001), FLOOR(RAND(3)*3001), 2),
    ("Player C", FLOOR(RAND(4)*256), FLOOR(RAND(5)*3001), FLOOR(RAND(6)*3001), 3),
    ("Player D", FLOOR(RAND(7)*256), FLOOR(RAND(8)*3001), FLOOR(RAND(9)*3001), 4),
    ("Player E", FLOOR(RAND(10)*256), FLOOR(RAND(11)*3001), FLOOR(RAND(12)*3001), 5),
    ("Player F", FLOOR(RAND(13)*256), FLOOR(RAND(14)*3001), FLOOR(RAND(15)*3001), 6),
    ("Player G", FLOOR(RAND(16)*256), FLOOR(RAND(17)*3001), FLOOR(RAND(18)*3001), 1),
    ("Player H", FLOOR(RAND(19)*256), FLOOR(RAND(20)*3001), FLOOR(RAND(21)*3001), 2);
    
SELECT * FROM tb_personagem WHERE ataque_personagem > 2000;
SELECT * FROM tb_personagem WHERE defesa_personagem >= 1000 && defesa_personagem <= 2000;
SELECT * FROM tb_personagem WHERE nome_personagem LIKE "%C%";

SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id_classe;
SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id_classe WHERE nome_classe = "Bardo";