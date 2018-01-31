create table  category_tbl (
category_id number(3) ,
name varchar2(50), 
descrption varchar(255),
img_url varchar2(50),
is_active boolean,
constraint pk_category_id primary key(category_id)
); 



create table user_detial (
user_id identity ,
first_name VARCHAR2(50),
last_name varchar2(50),
role varchar(50),
enable Boolean , 
passsword varchar2(50),
email VARCHAR2 (50),
contact_number varchar2(15),
constraint pk_user_id primary key(user_id));

create table produect (
productid identity ,
code varchar2(20),
brand varchar2(50),
descriptrion varchar2(255),
unit_price DECIMAL(10,2),
quantity int,
is_active boolean,
category_id int,
suppler_id int ,
purchases int default 0,
views int default 0,
constraint pk_product_id  primary key (product_id),
constraint fk_product_category_id foreign key (category_id)references category (id),
constraint fk_product_supplier_id foreign key (suppler_id) references   user_detial (id),


