CREATE TABLE transactions (
    transactionId SERIAL PRIMARY KEY,
    customerId int,
    productId int,
    transactionDate date
);


insert into transactions (customerId, productId, transactionDate) VALUES(0, 0, '2017-03-14');
insert into transactions (customerId, productId, transactionDate) VALUES(0, 1, '2017-03-14');
insert into transactions (customerId, productId, transactionDate) VALUES(1, 1, '2017-03-14');

select * from transactions;

CREATE TABLE products (
    productId SERIAL PRIMARY KEY,
    brand VARCHAR,
    model VARCHAR,
    description VARCHAR,
    price float,
    quantity int
);


insert into products (brand, model, description, price, quantity) VALUES('nike', 'show', 'the shoes', 3.00, 5);
insert into products (brand, model, description, price, quantity) VALUES('apple', 'ipad', 'tablet', 135.00, 2);

select * from products;

CREATE TABLE customer (
    customerId SERIAL PRIMARY KEY,
    firstName VARCHAR,
    lastName VARCHAR,
    email VARCHAR,
    phone VARCHAR
);


insert into customer (firstName, lastName, email, phone) VALUES('jon', 'doe', 'jondoe@email.com', '555-500-5555');
insert into customer (firstName, lastName, email, phone) VALUES('jon', 'doe', 'jondoe@email.com', '555-500-5555');

select * from customer;