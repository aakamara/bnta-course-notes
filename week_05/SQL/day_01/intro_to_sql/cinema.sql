DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS directors
        -- this removes duplicates especially with development code


        -- There are different commands to implement values into the table
        -- the command psql -d cinema -f cinema.sql will show you the 
        -- file that you want to look at

CREATE TABLE directors(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE movies(
    id SERIAL,
    title VARCHAR(255),
    duration INT,
    rating VARCHAR(255)
);

        -- id is not used as it has a SERIAL type database which
        -- auto assigning a value to each new entry
--CREATE D
INSERT INTO directors (name) VALUES ('Ridley Scott');
INSERT INTO directors (name) VALUES ('Morten Tyldum');
INSERT INTO directors (name) VALUES ('Jon Favreau');
INSERT INTO directors (name) VALUES ('Steven Spielberg');


-- CREATE
INSERT INTO movies (title, duration, rating) VALUES ('Alien', 117, '18');
INSERT INTO movies (title, duration, rating) VALUES ('The Imitation Game', 114, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('Iron Man', 126, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('The Martian', 144, '12A');

        -- if you miss out something then the value provided will return NULL where you missed
        -- the information on the database (it will be blank)

INSERT INTO directors (name) VALUE ('Anthony Russo');
INSERT INTO movies (title, duration, rating, director_id) VALUES ('Avengers: Endgame', 181, '12A', 4);

    -- INSERT INTO movies (title, rating) VALUES ('Braveheart', 'PG');
    -- UPDATE movies SET duration = 155 WHERE id = 5; 

-- READ
SELECT * FROM movies;
        -- key command to reading things in sql
        -- SELECT is a powerful command

SELECT * FROM movies WHERE rating = '12A';
        -- will give the 3 movies in a table format


SELECT title FROM movies WHERE duration > 120;
        -- will give you just the title of the movies 

-- UPDATE
UPDATE movies SET rating = '15' WHERE id = 2;
        -- to see the change you have to use the SELECT command
-- SELECT * FROM movies;

UPDATE movies SET (duration, rating) = (178, '12A') WHERE id = 2;
        -- if you want to change 2 things you put them in brackets
-- SELECT * FROM movies;

-- DELETE
        -- DELETE FROM movies; this deletes everything
DELETE FROM movies WHERE id = 1;
 -- SELECT * FROM movies;
        -- move the SELECT * FROM movies command at the end of the code 
        -- so it is not always repeating itself

INSERT INTO movies (title, duration, rating) VALUES ('Guardians of the Galaxy', 121, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('You Only Live Twice', 117, 'PG');
INSERT INTO movies (title, duration, rating) VALUES ('I Know what you did Last Summer', 101, '18');

-- READ
SELECT * FROM movies;

-- FUZZY MATCHING

SELECT * FROM movies WHERE title = 'Alien';

SELECT * FROM movies WHERE title LIKE ' Ali%';

SELECT * FROM movies WHERE title LIKE 'You%';

SELECT * FROM movies WHERE title LIKE '%the%';

-- ORDERING RESULTS
--SELECT * FROM movies ORDER BY duration DESC;

        -- DESC is descending order
        -- ASC ascending order

SELECT * FROM movies WHERE rating = '12A' ORDER BY duration DESC;

-- SUMMARISING RESULTS
-- COUNT
SELECT COUNT (*) FROM movies;

-- DISTINCT
SELECT DISTINCT rating  FROM movies;

SELECT rating, COUNT (DISTINCT rating) FROM movies GROUP BY rating;

--  WHAT IS THE AVERAGE DURATION OF A PG MOVIE, A 12A MOVIE AND AN 18 MOVIE?
SELECT rating, AVG(duration) FROM movies GROUP BY rating;