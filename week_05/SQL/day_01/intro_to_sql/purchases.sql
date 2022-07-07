-- This is for development, not production
-- be careful about dropping tables in real-world situations

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS admins;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS purchases;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS products_purchases;

-- if you feel a field should be obligatory, mark it as NOT NULL
CREATE TABLE users (
	id SERIAL PRIMARY KEY,
  	uname VARCHAR(30) NOT NULL,
  	user_password VARCHAR(50) NOT NULL,
  	email VARCHAR(50) NOT NULL
);

CREATE TABLE admins (
	permission_level INT DEFAULT 0,
  	fk_user INT,
  	FOREIGN KEY (fk_user) REFERENCES users(id)
);

CREATE TABLE customers (
	id SERIAL PRIMARY KEY,
  	address VARCHAR(255),
  	dob TIMESTAMP NOT NULL,
  	fk_user INT,
  	FOREIGN KEY (fk_user) REFERENCES users(id)
);

-- insert some rows, test some queries
INSERT INTO users (uname, email, user_password) VALUES ('json24', 'json24@yahoo.com', 'dasfsdlkj8342');
INSERT INTO users (uname, email, user_password) VALUES ('amanda13', 'amanda13@yahoo.com', 'duiafweknlks90234');
INSERT INTO users (uname, email, user_password) VALUES ('jack45', 'jack45@yahoo.com', 'bneijdw4351');
INSERT INTO users (uname, email, user_password) VALUES ('timmy19', 'timmy19@yahoo.com', 'birjfir58473');

-- lets add some admin and customer rows
INSERT INTO admins (fk_user) VALUES (1);
--  CURRENT_TIMESTAMP gives the current time
INSERT INTO customers (fk_user, address, dob) VALUES (1, '1234 Fake Street', '1989-3-10'::TIMESTAMP);
INSERT INTO customers (fk_user, address, dob) VALUES (2, '945 Not Real Avenue', '1978-8-15'::TIMESTAMP);
INSERT INTO customers (fk_user, address, dob) VALUES (3, '90 Somewhere Island', '1989-7-10'::TIMESTAMP);
INSERT INTO customers (fk_user, address, dob) VALUES (4, 'Another made up address', '1989-9-22'::TIMESTAMP);

CREATE TABLE purchases (
	id SERIAL PRIMARY KEY,
  	dop TIMESTAMP,
  	fk_customer INT,
  	FOREIGN KEY (fk_customer) REFERENCES customers(id)
);

CREATE TABLE products (
	id SERIAL PRIMARY KEY,
  	title VARCHAR(100) NOT NULL,
  	description VARCHAR(255) NOT NULL,
  	price FLOAT NOT NULL
);

CREATE TABLE products_purchases (
 	fk_product INT NOT NULL,
  	fk_purchase INT NOT NULL,
  	FOREIGN KEY (fk_product) REFERENCES products(id),
  	FOREIGN KEY (fk_purchase) REFERENCES purchases(id)
);

-- add some pruchases and products
INSERT INTO products (title, description, price) VALUES ('les Paul', 'A great Les Paul guitar!', 2000);
INSERT INTO products (title, description, price) VALUES ('Beginner''s Drum Kit', 'Great for getting started', 649.99);
INSERT INTO products (title, description, price) VALUES ('Generic Bass Gutar', 'A generic bass guitar', 800);
INSERT INTO products (title, description, price) VALUES ('Accordian', 'A great little accordian!', 3500);

-- first, add a purchase record...
INSERT INTO purchases (fk_customer, dop) VALUES (1, CURRENT_TIMESTAMP);
-- ... then, add products_purchases records for each product that is included in the purchase
INSERT INTO products_purchases (fk_product, fk_purchase) VALUES (1, 1);
INSERT INTO products_purchases (fk_product, fk_purchase) VALUES (4, 1);