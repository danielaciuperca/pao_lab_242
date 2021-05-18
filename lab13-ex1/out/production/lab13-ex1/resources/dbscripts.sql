CREATE DATABASE `pao_lab13`;
USE `pao_lab13`;

CREATE TABLE `bankaccounts` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`accountNumber` varchar(100) NOT NULL,
`balance` double NOT NULL,
`type` varchar(100) NOT NULL,
`cardNumber` varchar(16) DEFAULT NULL,
PRIMARY KEY (`id`));