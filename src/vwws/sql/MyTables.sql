

update sale_items si set si.status=(select s.status from sales s where s.sales_no=si.sales_no);


alter table meter_readers add user_name varchar(255);
alter table meter_readers add password varchar(255);


/* 03/30/2015 */
drop table if exists suppliers;
create table suppliers(
id int auto_increment primary key
,supplier varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
);



/* 03/29/2015 */

drop table if exists customer_ordered_items;
create table customer_ordered_items(
id int auto_increment primary key
,customer_no varchar(100)
,customer_name varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,item_code varchar(100)
,barcode varchar(100)
,description varchar(100)
,category_id varchar(100)
,category varchar(100)
,classification_id varchar(100)
,sub_classification_id varchar(100)
,sub_classification varchar(100)
,brand_id varchar(100)
,brand varchar(100)
,model_id varchar(100)
,model varchar(100)
,product_qty double
,unit varchar(100)
,conversion double
,cost double
,selling_price double
,discount_amount double
,item_type varchar(100)
,supplier_id varchar(100)
,supplier varchar(100)
,branch_id varchar(100)
,branch varchar(100)
,location_id varchar(100)
,location varchar(100)
,status int
);







drop table if exists stock_outs;
create table stock_outs(
id int auto_increment primary key
,stock_out_no varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,remarks varchar(100)
,reference_no varchar(100)
,gross_total double
,discount_amount double
,net_total double
,status int
);
alter table stock_ins add UNIQUE(stock_in_no);

drop table if exists stock_out_items;
create table stock_out_items(
id int auto_increment primary key
,stock_out_no varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,remarks varchar(100)
,reference_no varchar(100)
,item_code varchar(100)
,barcode varchar(100)
,description varchar(100)
,category_id varchar(100)
,category varchar(100)
,classification_id varchar(100)
,sub_classification_id varchar(100)
,sub_classification varchar(100)
,brand_id varchar(100)
,brand varchar(100)
,model_id varchar(100)
,model varchar(100)
,product_qty double
,unit varchar(100)
,conversion double
,cost double
,selling_price double
,discount_amount double
,item_type varchar(100)
,supplier_id varchar(100)
,supplier varchar(100)
,branch_id varchar(100)
,branch varchar(100)
,location_id varchar(100)
,location varchar(100)
,status int
);





/* 03/27/2015 */
drop table if exists stock_ins;
create table stock_ins(
id int auto_increment primary key
,stock_in_no varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,supplier_id varchar(100)
,supplier varchar(100)
,remarks varchar(100)
,date_delivered date
,date_received date
,reference_no varchar(100)
,gross_total double
,discount_amount double
,net_total double
,status int
);
alter table stock_ins add UNIQUE(stock_in_no);

drop table if exists stock_in_items;
create table stock_in_items(
id int auto_increment primary key
,stock_in_no varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,remarks varchar(100)
,date_delivered date
,date_received date
,reference_no varchar(100)
,item_code varchar(100)
,barcode varchar(100)
,description varchar(100)
,category_id varchar(100)
,category varchar(100)
,classification_id varchar(100)
,sub_classification_id varchar(100)
,sub_classification varchar(100)
,brand_id varchar(100)
,brand varchar(100)
,model_id varchar(100)
,model varchar(100)
,product_qty double
,unit varchar(100)
,conversion double
,cost double
,selling_price double
,discount_amount double
,item_type varchar(100)
,supplier_id varchar(100)
,supplier varchar(100)
,branch_id varchar(100)
,branch varchar(100)
,location_id varchar(100)
,location varchar(100)
,status int
);








drop table if exists inventory;
create table inventory(
id int auto_increment primary key
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,item_code varchar(100)
,barcode varchar(100)
,description varchar(100)
,category_id varchar(100)
,category varchar(100)
,classification_id varchar(100)
,sub_classification_id varchar(100)
,sub_classification varchar(100)
,brand_id varchar(100)
,brand varchar(100)
,model_id varchar(100)
,model varchar(100)
,product_qty double
,unit varchar(100)
,conversion double
,cost double
,selling_price double
,item_type varchar(100)
,supplier_id varchar(100)
,supplier varchar(100)
,status int
,branch_id varchar(100)
,branch varchar(100)
,location_id varchar(100)
,location varchar(100)
);

alter table inventory add UNIQUE(item_code);
alter table inventory add classification  varchar(100) after classification_id;


/* 03/26/2015 */

alter table customers add gender varchar(100);
alter table customers add religion varchar(100);
alter table customers add height varchar(100);
alter table customers add weight varchar(100);
alter table customers add civil_status varchar(100);
alter table customers add contact_landline varchar(100);
alter table customers add contact_mobile varchar(100);
alter table customers add contact_email varchar(100);
alter table customers add meter_no varchar(100);



drop table if exists user_privileges;
create table user_privileges(
id int auto_increment primary key
,user_id varchar(100)
,account varchar(100)
,privilege_id varchar(100)
,privilege varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
);




drop table if exists user_default_privileges;
create table user_default_privileges(
id int auto_increment primary key
,account varchar(100)
,privilege varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
);

/* 03/24/2015 */
drop table if exists cities;
create table cities(
id int auto_increment primary key
,city varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
);



drop table if exists barangays;
create table barangays(
id int auto_increment primary key
,city_id varchar(100)
,city varchar(100)
,barangay varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
);


/* 03/17/2015 */
alter table reading_payments add customer_id varchar(100) after or_no;
alter table reading_payments add customer_name varchar(100) after customer_id;
alter table reading_payments add is_counted int;



/* 03/17/2015 */
alter table reading_payments add or_no varchar(100) after id;
alter table reading_payments ADD UNIQUE(or_no);




/* 03/16/2015 */
drop table if exists banks;
create table banks(
id int auto_increment primary key
,bank varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
);


/* 03/12/2015 */
alter table readings add previous_reading_date datetime;
alter table readings add is_paid int;
alter table readings add or_id varchar(100);
alter table readings add or_no varchar(100);

/*  03/11/2015 */
alter table readings add occupancy_id varchar(100);
alter table readings add occupancy varchar(100);
alter table readings add occupancy_type_id varchar(100);
alter table readings add occupancy_type varchar(100);
alter table readings add occupancy_type_code varchar(100);

alter table meter_reader_assignments add occupancy_id varchar(100);
alter table meter_reader_assignments add occupancy varchar(100);
alter table meter_reader_assignments add occupancy_type_id varchar(100);
alter table meter_reader_assignments add occupancy_type varchar(100);
alter table meter_reader_assignments add occupancy_type_code varchar(100);

alter table customers add occupancy_id varchar(100);
alter table customers add occupancy varchar(100);
alter table customers add occupancy_type_id varchar(100);
alter table customers add occupancy_type varchar(100);
alter table customers add occupancy_type_code varchar(100);



drop table if exists reading_payments;
create table reading_payments(
id int auto_increment primary key
,reading_ids varchar(100)
,amount_due double
,amount_paid double
,cash_paid double
,check_amount double
,check_bank varchar(100)
,check_no varchar(100)
,check_holder varchar(100)
,check_date date
,discount_name varchar(100)
,discount_amount double
,discount_rate double
,discount_customer_name varchar(100)
,discount_customer_id varchar(100)
,city varchar(100)
,city_id varchar(100)
,barangay varchar(100)
,barangay_id varchar(100)
,purok varchar(100)
,purok_id varchar(100)
,address varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
);



/*  03/09/2015 */
drop table if exists readings;
create table readings(
id int auto_increment primary key
,meter_reader_id varchar(100)
,meter_reader_no varchar(100)
,meter_reader_name varchar(100)
,customer_id varchar(100)
,customer_no varchar(100)
,customer_name varchar(100)
,customer_tax_dec_no varchar(100)
,previous_reading double
,current_reading double
,city varchar(100)
,city_id varchar(100)
,barangay varchar(100)
,barangay_id varchar(100)
,purok varchar(100)
,purok_id varchar(100)
,address varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
,occupancy_id varchar(100)
,occupancy varchar(100)
,occupancy_type_id varchar(100)
,occupancy_type varchar(100)
,occupancy_type_code varchar(100)
);




/* 03/06/2015 */

drop table if exists meter_reader_assignments;
create table meter_reader_assignments(
id int auto_increment primary key
,meter_reader_id varchar(100)
,meter_reader_no varchar(100)
,meter_reader_name varchar(100)
,customer_id varchar(100)
,customer_no varchar(100)
,customer_name varchar(100)
,barangay varchar(100)
,barangay_id varchar(100)
,purok varchar(100)
,purok_id varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
,occupancy_id varchar(100)
,occupancy varchar(100)
,occupancy_type_id varchar(100)
,occupancy_type varchar(100)
,occupancy_type_code varchar(100)
,city varchar(255)
,city_id varchar(255)
,sitio varchar(255)
,sitio_id varchar(255)
,meter_no varchar(255)
);


drop table if exists meter_readers;
create table meter_readers(
id int auto_increment primary key
,customer_no varchar(100)
,fname varchar(100)
,mi varchar(100)
,lname varchar(100)
,bday date
,city varchar(100)
,city_id varchar(100)
,barangay varchar(100)
,barangay_id varchar(100)
,purok varchar(100)
,purok_id varchar(100)
,address varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
);

alter table meter_readers change customer_no meter_reader_no varchar(100);
alter table meter_readers ADD UNIQUE(meter_reader_no);



/* 03/04/15 */
drop table if exists customers;
create table customers(
id int auto_increment primary key
,customer_no varchar(100)
,fname varchar(100)
,mi varchar(100)
,lname varchar(100)
,bday date
,city varchar(100)
,city_id varchar(100)
,barangay varchar(100)
,barangay_id varchar(100)
,purok varchar(100)
,purok_id varchar(100)
,address varchar(100)
,balance double
,tax_dec_no varchar(100)
,meter_is_paid int
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
,occupancy_id varchar(100)
,occupancy varchar(100)
,occupancy_type_id varchar(100)
,occupancy_type varchar(100)
,occupancy_type_code varchar(100)
);

alter table customers ADD UNIQUE(customer_no);
/* */




/* 03/03/15 */

drop table if exists pipe_sizes;
create table pipe_sizes(
id int auto_increment primary key
,pipe_size varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
);



drop table if exists users;
create table users(
id int auto_increment primary key
,user_screen_name varchar(100)
,user_name varchar(100)
,password varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
);


drop table if exists occupancies;
create table occupancies(
id int auto_increment primary key
,occupancy varchar(100)
,occupancy_code varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
);
/* */


/* 03/02/15 */
drop table if exists occupancy_types;
create table occupancy_types(
id int auto_increment primary key
,occupancy varchar(100)
,occupancy_type_id varchar(100)
,occupancy_type_name varchar(100)
,occupancy_type_code varchar(100)
,pipe_size varchar(100)
,cubic varchar(100)
,mf double
,mr double
,charge double
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
,remarks text
);

/**/
