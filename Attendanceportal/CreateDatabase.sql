CREATE DATABASE company;
USE company;
CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50), department VARCHAR(50));
INSERT INTO employees VALUES (1, 'John', 'HR'), (2, 'Alice', 'IT'), (3, 'Bob', 'Finance');
CREATE DATABASE school;
USE school;
CREATE TABLE attendance (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), status VARCHAR(20));
