DROP TABLE IF EXISTS actor_movie;
DROP TABLE IF EXISTS actor;
DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS director;

CREATE TABLE director (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

CREATE TABLE actor (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

CREATE TABLE movie (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    date TIMESTAMP NOT NULL,
    director_id INT NOT NULL,
    CONSTRAINT director_fk FOREIGN KEY (director_id)  REFERENCES director (id)
);

CREATE TABLE actor_movie(
    movie_id INT NOT NULL,
    actor_id INT NOT NULL,
    CONSTRAINT actor_movie_pk PRIMARY KEY (actor_id, movie_id),
    CONSTRAINT movie_fk FOREIGN KEY (movie_id) REFERENCES movie (id),
    CONSTRAINT actor_fk FOREIGN KEY (actor_id) REFERENCES actor (id)
);