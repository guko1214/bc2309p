create database bootcamp_exercise3;

use bootcamp_exercise3;

create table city(
	id int auto_increment,
    name varchar(128) not null,
    constraint pk_city primary key (id)
);

create table customer(
	id int auto_increment,
    customer_name varchar(255) not null,
    city_id int not null,
    customer_address varchar(255) not null,
    contact_person varchar(255),
    email varchar(128) not null,
    phone varchar(128) not null,
    constraint pk_customer primary key (id),
    constraint fk_customer foreign key(city_id) references city(id)
);

create table product(
	id int auto_increment,
    sku varchar(32) not null,
    product_name varchar(128) not null,
    product_description text not null,
    current_price decimal(8,2) not null,
    constraint pk_product primary key (id)    
);

create table invoice(
	id int auto_increment,
    invoice_number varchar(255) not null,
    customer_id int not null,
    user_account_id int not null,
    total_price decimal(8,2) not null,
    time_issued datetime,
    time_due datetime,
    time_paid datetime,
    time_canceled datetime,
    time_refunded datetime,
    constraint pk_invoice primary key (id),
    constraint fk_invoice foreign key (customer_id) references customer(id)
);

create table invoice_item(
	id int auto_increment,
    invoice_id int not null,
    product_id int not null,
    quantity int not null,
    price decimal(8,2) not null,
    line_total_price decimal(8,2) not null,
    constraint pk_invoice_item primary key (id),
    constraint fk_invoice_item1 foreign key (invoice_id) references invoice(id),
    constraint fk_invoice_item2 foreign key (product_id) references product(id)
);

delete from city;
insert into city
(name) values
('City1'),
('City2'),
('City3'),
('City4');

delete from customer;
insert into customer
(id, customer_name, city_id, customer_address, contact_person, email, phone) values
(1,'Drogerie Wien',1,'Deckergasse 15A','Emil Steinbach','abc@gmail.com',123455678),
(2,'John',4,'Deckergasse 1A','9upper','abck@gmail.com',12345567),
(3,'Mary',3,'Deckergasse 18A','9upper','abcd@gamil.com',123456789);



