CREATE TABLE IF NOT EXISTS tasks_db (
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(45) NOT NULL,
    description VARCHAR(100) NOT NULL,
    date VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);