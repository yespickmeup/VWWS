/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Dec 3, 2018
 */


select count(id) from customers where barangay_id=65;
select occupancy_type_code,occupancy_type from customers where barangay_id=65 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R',occupancy_type='III' where barangay_id=65;

select occupancy_type_code,occupancy_type from customers where barangay_id=66 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R',occupancy_type='III' where barangay_id=66;

select occupancy_type_code,occupancy_type from customers where barangay_id=67 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=67 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=68 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=68 and occupancy_type_code='RI';
update customers set occupancy_type_code='NR' where barangay_id=68 and occupancy_type_code='NRVIII';

select occupancy_type_code,occupancy_type from customers where barangay_id=69 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R',occupancy_type='III',occupancy='Residential',occupancy_id=1 where barangay_id=69;

select occupancy_type_code,occupancy_type from customers where barangay_id=70 group by occupancy_type_code,occupancy_type;

select occupancy_type_code,occupancy_type from customers where barangay_id=71 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=71 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=72 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=72 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=73 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=73 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=74 group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=74 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=75  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=75 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=76  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=76 and occupancy_type_code='RI';
update customers set occupancy_type_code='NR' where barangay_id=76 and occupancy_type_code='NRI';

select occupancy_type_code,occupancy_type from customers where barangay_id=77  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=77 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=78  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=78 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=79  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=79 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=80  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=80 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=81  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=81 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=82  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=82 and occupancy_type_code='RI';

select occupancy_type_code,occupancy_type from customers where barangay_id=83  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=83 and occupancy_type_code='R1';
update customers set occupancy_type='RIII' where barangay_id=83 and occupancy_type_code='R';

select occupancy_type_code,occupancy_type from customers where barangay_id=84  group by occupancy_type_code,occupancy_type;
update customers set occupancy_type_code='R' where barangay_id=84 and occupancy_type_code='RI';
update customers set occupancy_type='IV' where barangay_id=84 and occupancy_type like '%IV%';

select occupancy_type_code,occupancy_type from customers where barangay_id=85  group by occupancy_type_code,occupancy_type;



alter table customers add pipe_size varchar(255) default '1/2';
alter table meter_reader_assignments add pipe_size varchar(255) default '1/2';
alter table readings add pipe_size varchar(255) default '1/2';

alter table reading_payments add customer_no varchar(255);
alter table reading_payments add meter_no varchar(255);


alter table settings add version varchar(255);
alter table settings add cloud_host varchar(255);
alter table settings add cloud_port varchar(255);;
alter table settings add cloud_user varchar(255);
alter table settings add cloud_password varchar(255);
alter table settings add cloud_db varchar(255);
alter table settings add ar_footer varchar(255);



update settings set version='V.1.20170206';
update settings set cloud_host='128.199.80.53';
update settings set cloud_port='3306';
update settings set cloud_user='smis2';
update settings set cloud_password='nopassword101';
update settings set cloud_db='db_algorithm';
update settings set ar_footer='Should you have any inquiries concerning this statement, please contact the Accounting Department';





