/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.6.26-log : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo_graphql` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demo_graphql`;

DROP TABLE IF EXISTS `user`;

create table user
(
	id integer primary key auto_increment,
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	`username` varchar(50) DEFAULT NULL,
    `password` varchar(50) DEFAULT NULL,
    `email` varchar(50) DEFAULT NULL,
	`name` varchar(33) DEFAULT NULL
)auto_increment=1000;

DROP TABLE IF EXISTS `note`;

create table note
(
	id integer primary key auto_increment,
    `userId` integer,
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	`title` varchar(50) DEFAULT NULL,
    `content` TEXT DEFAULT NULL,
    FOREIGN KEY(userId) REFERENCES user(id)
)auto_increment=1;