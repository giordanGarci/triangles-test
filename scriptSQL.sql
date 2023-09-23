DROP DATABASE company;
CREATE DATABASE IF NOT EXISTS company;
USE company;

CREATE TABLE person
(
    id   INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age  INT(100)
);

CREATE TABLE positions
(
    id   INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
);

CREATE TABLE employee
(
    id          INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    person_id   INT NOT NULL,
    position_id INT NOT NULL,
    CONSTRAINT fk_person_id FOREIGN KEY (person_id) REFERENCES person (id),
    CONSTRAINT fk_position_id FOREIGN KEY (position_id) REFERENCES positions (id)
);

INSERT INTO person (name, age) VALUES ('José', 25),
                                      ('Maria', 31),
                                      ('João', 60),
                                      ('Pedro', 45),
                                      ('Lucas', 27),
                                      ('Clara', 45),
                                      ('Francisco', 52),
                                      ('Joaquim', 24),
                                      ('Ana', 25),
                                      ('Silvanira', 50);

INSERT INTO positions (name) VALUES ('Assistente'),
                                    ('Programador'),
                                    ('Gerente');

INSERT INTO employee (person_id, position_id) VALUES (1, 1),
                                                     (2, 1),
                                                     (3, 2),
                                                     (4, 2),
                                                     (5, 3),
                                                     (6, 1),
                                                     (7, 2),
                                                     (8, 2),
                                                     (9, 2),
                                                     (10, 2);

SELECT positions.name AS cargo, COUNT(employee.id) AS quantidade
FROM positions
INNER JOIN employee ON positions.id = employee.position_id
GROUP BY cargo;
