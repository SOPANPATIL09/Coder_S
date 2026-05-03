create database datapetrol;
use datapetrol;

CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    salary DECIMAL(10,2),
    dept_id INT,
    join_date DATE
);
CREATE TABLE department (
    dept_id INT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(50)
);
ALTER TABLE employee
ADD CONSTRAINT fk_dept
FOREIGN KEY (dept_id) REFERENCES department(dept_id);
INSERT INTO department (dept_name) VALUES
('HR'),
('IT'),
('Finance'),
('Sales');
INSERT INTO employee (name, age, salary, dept_id, join_date) VALUES
('Amit', 25, 30000, 2, '2022-01-10'),
('Ravi', 30, 50000, 1, '2021-03-15'),
('Sita', 28, 45000, 2, '2020-07-20'),
('John', 35, 70000, 3, '2019-11-25'),
('Neha', 26, 32000, 4, '2023-05-01'),
('Amit', 29, 30000, 2, '2022-06-18'); -- duplicate for practice

SELECT * FROM employee;

SELECT * FROM employee where salary>40000; 

SELECT * FROM employee  as e
INNER JOIN department as d
ON e.dept_id=d.dept_id;

SELECT * FROM employee AS e 
left  JOIN department AS d
ON d.dept_id=e.dept_id;
SELECT distinct name,salary  from employee;


SELECT e.dept_id, d.dept_name ,count(*) as Total_Employee
from employee as e
inner join  department as d
on e.dept_id=d.dept_id
group by  e.dept_id, d.dept_id;

select salary from employee
where salary order by salary desc  limit 1  offset 1; 

