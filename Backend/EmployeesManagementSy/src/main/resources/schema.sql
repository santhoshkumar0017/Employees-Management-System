create table if not exists employees
(
id int primary key auto_increment,
employee_name  varchar(20) not null,
email VARCHAR(100) UNIQUE NOT NULL,
phone_number  VARCHAR(15) ,
role  varchar(20) not null,
hire_date DATE NOT NULL,
salary int check (salary >0)

);