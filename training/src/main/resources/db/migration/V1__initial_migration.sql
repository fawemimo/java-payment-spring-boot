CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       email VARCHAR(150) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL
);

CREATE TABLE addresses (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           street VARCHAR(255) NOT NULL,
                           zip VARCHAR(20) NOT NULL,
                           city VARCHAR(100) NOT NULL,
                           addresses_fk INT,
                           CONSTRAINT fk_user_address
                               FOREIGN KEY (addresses_fk)
                                   REFERENCES users(id)
                                   ON DELETE CASCADE
                                   ON UPDATE CASCADE
);