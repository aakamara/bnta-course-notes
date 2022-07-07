DROP TABLE IF EXISTS castings;
DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS directors;
DROP TABLE IF EXISTS actors;

CREATE TABLE directors(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE actors(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE movies(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    duration INT,
    rating VARCHAR(255),
    takings BIGINT,
    release_date TIMESTAMP,
    director_id INT REFERENCES directors(id)
);

CREATE TABLE castings(
    id SERIAL PRIMARY KEY,
    movie_id INT REFERENCES movies(id), 
    actor_id INT REFERENCES actors(id), 
    character_name VARCHAR(255),
    FOREIGN KEY (movie_id) REFERENCES movies(id),
    FOREIGN KEY (actor_id) REFERENCES actors(id)
);

INSERT INTO directors (name) VALUES ('Ridley Scott');
INSERT INTO directors (name) VALUES ('Morten Tyldum');
INSERT INTO directors (name) VALUES ('Jon Favreau');
INSERT INTO directors (name) VALUES ('Steven Spielberg');

INSERT INTO movies (title, duration, rating, takings, release_date, director_id) VALUES ('Alien', 117, '18', 2000000000, '1764-5-12'::TIMESTAMP, 1);
INSERT INTO movies (title, duration, rating, takings, release_date, director_id) VALUES ('The Imitation Game', 114, '12A', 1034000503, '1764-5-12'::TIMESTAMP, 2);
INSERT INTO movies (title, duration, rating, takings, release_date, director_id) VALUES ('Iron Man', 126, '12A', 45300042010, '1764-5-12'::TIMESTAMP, 3);
INSERT INTO movies (title, duration, rating, takings, release_date, director_id) VALUES ('The Martian', 144, '12A', 4656000000, '1764-5-12'::TIMESTAMP, 1);
INSERT INTO movies (title, duration, rating, takings, release_date, director_id) VALUES ('Jaws', 144, '12A', 234560000, '1764-5-12'::TIMESTAMP, 2);
-- INSERT INTO movies (title, duration, rating) VALUES ('HELLO', 123, '12A');

INSERT INTO actors (name) VALUES ('Sigourney Weaver');
INSERT INTO actors (name) VALUES ('Benedict Cumberbatch');
INSERT INTO actors (name) VALUES ('Robert Downey Jr');
INSERT INTO actors (name) VALUES ('Gwyneth Paltrow');
INSERT INTO actors (name) VALUES ('John Boyega');

INSERT INTO castings (movie_id, actor_id, character_name) VALUES (1, 1, 'Ripley');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (2, 2, 'Alan Turing');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (3, 3, 'Tony Stark');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (3, 4, 'Pepper Potts');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (5, 2, 'Dr Strange');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (5, 3, 'Tony Stark');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (5, 4, 'Pepper Potts');


-- LEFT JOIN ---------------------------------------------------------------------------
-- SELECT *  FROM directors LEFT JOIN movies ON directors.id = movies.director_id;

-- INNER JOIN ---------------------------------------------------------------------------
--SELECT directors.name, movies.title FROM directors INNER JOIN movies 
    -- adding conditions
-- ON directors.id = movies.director_id WHERE movies.duration < 120;
    -- only those that have 2 correspondents will appear in a join

-- RIGHT JOIN ----------------------------------------------------------------------------
-- SELECT * FROM directors RIGHT JOIN movies ON directors.id = movies.director_id;

-- JOINS ACROSS MULTIPLE TABLES ----------------------------------------------------------
-- SELECT * FROM actors INNER JOIN castings ON actors.id = casting.actor_id
    -- adding another join
-- INNER JOIN moviesON castings.movie_id = movies.id
    -- adding the WHERE clause
-- WHERE movies.rating = '18';

-- SELECT * FROM actors INNER JOIN castings ON actors.id = castings.actor_id INNER JOIN movies ON castings.movie_id = movies.id WHERE movies rating = '18';
