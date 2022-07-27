drop table if exists customer;
drop table if exists accounts;

create table `customer` (
    `customer_id` int PRIMARY KEY,
    `name` varchar(100) not null,
    `email` varchar(100) not null,
    `mobile_number` varchar(20) not null,
    `create_dt` date default null
);

create table `accounts` (
    `customer_id` int not null,
    `account_number` int PRIMARY KEY,
    `account_type` varchar(100) not null,
    `branch_address` varchar(200) not null,
    `create_dt` date default null
);

insert into `customer` (customer_id, `name`, email, mobile_number, create_dt)
values (1, 'Easy Bytes', 'tutor@eazybytes.com','987654321', null);

insert into `accounts` (customer_id, account_number, account_type, branch_address, create_dt)
values (1,1845, 'Savings', '123 Main Street NY', null);
