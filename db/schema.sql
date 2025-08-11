DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS categories;

SELECT * FROM categories;
SELECT * FROM products;

SELECT * FROM products WHERE category_id = 1;

CREATE TABLE categories(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);


CREATE TABLE products(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    price DOUBLE,
    category_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES categories(id)
);

