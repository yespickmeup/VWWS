/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Sep 6, 2019
 */


drop table if exists applications_requirements;
create table applications_requirements(
id int auto_increment primary key
,requirement_type varchar(255)
,requirement varchar(255)
);