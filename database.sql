CREATE DATABASE student_db;
USE student_db;

CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(50),
                       email VARCHAR(50)
);

CREATE TABLE attendance (
                            id INT PRIMARY KEY AUTO_INCREMENT,
                            student_id INT,
                            date DATE,
                            status VARCHAR(10),
                            FOREIGN KEY (student_id) REFERENCES users(id)
);

CREATE TABLE marks (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       student_id INT,
                       subject_code VARCHAR(10),
                       ca_marks FLOAT,
                       final_marks FLOAT,
                       FOREIGN KEY (student_id) REFERENCES users(id)
);
