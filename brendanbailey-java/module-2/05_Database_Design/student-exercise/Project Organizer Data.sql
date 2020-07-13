begin transaction;
Create table employee
(
employee_number serial NOT NULL,
job_title varchar(64),
last_name varchar(64),
first_name varchar(64),
gender varchar(64),
date_of_birth date,
date_of_hire date,
department varchar(200),
constraint pk_employee_number primary key (employee_number)
)
;

--rollback;

begin transaction;
Create table department
(
department_number serial NOT NULL,
name varchar(64),
constraint pk_department_number primary key (department_number)
)
;

--rollback;

begin transaction;
Create table project
(
project_number serial NOT NULL,
name varchar(64),
start_date date,
constraint pk_project_number primary key (project_number)
)
;

--rollback;

insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('Sales Associate 1', 'Hobart', 'Dile', 'Male', 1990-10-05, 2008-01-03, 'Sales')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('Sales Associate 1', 'Reynolds', 'Rian', 'Male', 1976-11-15, 2015-06-10, 'Sales')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('Marketing Associate 3', 'Rami', 'Phil', 'Male', 1991-04-22, 2007-03-11, 'Marketing')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('Director of Sales', 'Sparks', 'Nemo', 'Female', 2001-09-17, 2020-07-21, 'Sales')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('IT Help Desk Analyst 1', 'Cooper', 'Jan', 'Female', 1988-11-15, 2006-09-27, 'IT')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('IT Systems Analyst', 'Goldstein', 'Virginia', 'Female', 1976-04-10, 1991-07-03, 'IT')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('Chief Marketing Officer', 'Sky', 'Gale', 'Female', 1966-01-05, 1988-11-13, 'Marketing')
insert into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department) values ('IT Software Engineer', 'Bonds', 'Reginald', 'Male', 1998-12-25, 2007-02-06, 'IT')

insert into department (name) values ('IT')
insert into department (name) values ('Marketing')
insert into department (name) values ('Sales')

insert into project (name, start_date) values ('New Horizons Data V2', 2018-10-12)
insert into project (name, start_date) values ('Database Transfer to Cloud', 2020-01-19)
insert into project (name, start_date) values ('We Value Our Customers', 2001-11-24)      

rollback;