CREATE TABLE `user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`address` varchar(255) DEFAULT NULL,
`birth_day` datetime DEFAULT NULL,
`sex` varchar(255) DEFAULT NULL,
`user_name` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;