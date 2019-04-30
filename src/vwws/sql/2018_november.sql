/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Nov 21, 2018
 */

drop table if exists customers;
create table customers(
id int auto_increment primary key
,customer_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,bday date
,city varchar(255)
,city_id varchar(255)
,barangay varchar(255)
,barangay_id varchar(255)
,purok varchar(255)
,purok_id varchar(255)
,sitio varchar(255)
,sitio_id varchar(255)
,address varchar(255)
,balance double
,tax_dec_no varchar(255)
,meter_is_paid int
,date_added datetime
,date_updated datetime
,added_by_id varchar(255)
,updated_by_id varchar(255)
,occupancy_id varchar(255)
,occupancy varchar(255)
,occupancy_type_id varchar(255)
,occupancy_type varchar(255)
,occupancy_type_code varchar(255)
,gender varchar(255)
,religion varchar(255)
,height varchar(255)
,weight varchar(255)
,civil_status varchar(255)
,contact_landline varchar(255)
,contact_mobile varchar(255)
,contact_email varchar(255)
,meter_no varchar(255)
,meter_description varchar(255)
,serial_no varchar(255)
,status int /* 0-new 1-active 2-disconnected 3-for reconnection 4-closed */
);



drop table if exists cities;
create table cities(
id int auto_increment primary key
,city varchar(100)
,date_added datetime
,date_updated datetime
,added_by_id varchar(100)
,update_by_id varchar(100)
,status int
,is_default int
);

select customer_no,meter_no,lname,fname,count(*) c from customers  group by meter_no having c>1  ;


select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='008-001-20-T';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='02-10-083';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='03-11-01-003';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='03-12-08-011';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='060-205-088';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='08-05-128';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-01-052';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-05-024';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-05-046';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-05-047';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-06-067';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-08-029';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-08-073';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-08-095';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-11-045';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-11-065';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-11-075';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='09-12-019';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='100-314-688';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='111-102-385';

select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='111-102-525';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='111-103-390';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='111-103-470';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='11114016';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='140807403';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='140808974';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='150400081';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='150501508';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='150715824';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='1583';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='2009-04-24-0332';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='2009-05-21-2003';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='2013-01';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='201604';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='20416137';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='234';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='30';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='300083';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='31106313';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='31107740';

select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='31107788';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='3178';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='3899';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='40809066';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='4691';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='478';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='489168';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='5211834';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='70400782';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='70402835';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='70702667';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='70901766';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='80370082';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='80370132';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='80371464';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='808001400';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='80801736';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='80805090';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='80808852';

select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31102564';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31102986';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31103529';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31103538';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31106200';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31107325';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O31121221';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O61151253';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O901005';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O905038';
select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no='O907094';

select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no IS NULL order by barangay asc,lname asc ;

select id,customer_no as Account_No,meter_no,lname,mi,fname,barangay_id,barangay,concat(occupancy_type_code,'-',occupancy_type) as Code from customers where meter_no = '' order by barangay asc,lname asc ;


drop table if exists readings;
create table readings(
id int auto_increment primary key
,reading_no varchar(255)
,meter_reader_id varchar(255)
,meter_reader_name varchar(255)
,customer_id varchar(255)
,customer_no varchar(255)
,customer_name varchar(255)
,customer_meter_no varchar(255)
,previous_reading_date date
,previous_reading double
,current_reading double
,city varchar(255)
,city_id varchar(255)
,barangay varchar(255)
,barangay_id varchar(255)
,purok varchar(255)
,purok_id varchar(255)
,sitio varchar(255)
,sitio_id varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,occupancy_id varchar(255)
,occupancy varchar(255)
,occupancy_type_id varchar(255)
,occupancy_type varchar(255)
,occupancy_type_code varchar(255)
,actual_consumption double
,amount_due double
,mf double
,mr double
,interest double
,discount double
,net_due double
,is_paid int
,or_id varchar(255)
,or_no varchar(255)
,date_uploaded date
,is_uploaded int
);

