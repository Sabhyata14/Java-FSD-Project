create database ecomwebapp;

use ecomwebapp;

create table eproduct (
id int(11) NOT NULL  AUTO_INCREMENT,
name varchar(100) ,
price decimal(10,2),
dateAdded timestamp NOT NULL DEFAULT current_timestamp,
primary key(`id`)
);

insert into eproduct
(id,name,price)
values
(3, 'HP',14579.78),
(4, 'Xiomi',9579.78);

SELECT * FROM ecomwebapp.eproduct;