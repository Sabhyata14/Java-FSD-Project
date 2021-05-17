create database if not exists ems_system;
use ems_system;

-- creating employee table --
create table employee (
ID int(11) NOT NULL  AUTO_INCREMENT,
Full_Name varchar(64) ,
Email varchar(100),
Department varchar(50),
Salary decimal(10,2),
primary key(`ID`)
);

-- inserting values into employee table --
insert into employee
(ID, Full_Name, Email, Department,Salary)
values
(3, 'Marry Smith', 'marry.smith@gmail.com','Engineering',56765.34),
(4, 'Mike David', 'mike.david@gmail.com','Developer',4579.78),
(5, 'Martha smith', 'martha.smith@gmail.com','Producer',784579.78);

SELECT * FROM ems_system.employee;

