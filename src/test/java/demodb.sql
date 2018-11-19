/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 5.7.16-log : Database - demodb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demodb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demodb`;

/*Table structure for table `tbl_emp` */

DROP TABLE IF EXISTS `tbl_emp`;

CREATE TABLE `tbl_emp` (
  `emp_id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(250) DEFAULT NULL,
  `emp_age` int(2) DEFAULT NULL,
  `emp_mobile` bigint(12) DEFAULT NULL,
  `emp_salary` decimal(10,2) DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_emp` */

insert  into `tbl_emp`(`emp_id`,`emp_name`,`emp_age`,`emp_mobile`,`emp_salary`,`created_date`,`updated_date`) values 
(1,'Nitish',20,9784520312,15000.00,'2018-01-03 12:27:04',NULL),
(2,'Amit',21,9784520310,17000.00,'2018-01-23 12:27:11',NULL),
(3,'Gaurav',22,9784520313,18000.00,'2018-01-19 12:27:17',NULL),
(4,'Ekram',23,9784520325,25000.00,'2018-01-08 12:27:22',NULL),
(5,'Shiva',20,9785000312,400000.00,'2018-01-05 12:27:27',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
