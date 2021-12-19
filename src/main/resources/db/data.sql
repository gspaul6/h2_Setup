INSERT INTO director (id, name) VALUES (1, 'Georges Lucas');
INSERT INTO director (id, name) VALUES (2, 'Steven Spielberg');

INSERT INTO actor (id, name) VALUES (1, 'Harrison Ford');
INSERT INTO actor (id, name) VALUES (2, 'Mark Hamil');
INSERT INTO actor (id, name) VALUES (3, 'Carrie Fisher');
INSERT INTO actor (id, name) VALUES (4, 'Sean Connery');

INSERT INTO movie (id, title, date, director_id) VALUES (10,'Star Wars 1 - La menace fantôme', '1999-01-01', 1);
INSERT INTO movie (id, title, date, director_id) VALUES (11,'Star Wars 2 - La revanche des Sith', '2002-01-01', 1);
INSERT INTO movie (id, title, date, director_id) VALUES (12,'Star Wars 3 - L''attaque des clônes', '2005-01-01', 1);
INSERT INTO movie (id, title, date, director_id) VALUES (13,'Star Wars 4 - Un nouvel espoir', '1977-01-01', 1);
INSERT INTO movie (id, title, date, director_id) VALUES (20,'Indiana Jones - Les aventuriers de l''arche perdue', '1977-01-01', 2);
INSERT INTO movie (id, title, date, director_id) VALUES (21,'Indiana Jones - Le temple maudit', '1984-05-23', 2);
INSERT INTO movie (id, title, date, director_id) VALUES (22,'Indiana Jones - La dernière croisade', '1989-05-24', 2);
INSERT INTO movie (id, title, date, director_id) VALUES (23,'Indiana Jones - Le royaume du crâne de cristal', '2008-05-21', 2);

INSERT INTO actor_movie (actor_id, movie_id) VALUES (1,13);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (1,20);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (1,21);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (1,22);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (1,23);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (2,13);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (3,13);
INSERT INTO actor_movie (actor_id, movie_id) VALUES (4,22);
