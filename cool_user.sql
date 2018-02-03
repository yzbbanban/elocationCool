#select * from nfc_device_params;
#SET SQL_SAFE_UPDATES = 0;
#nfc_device_paramsSET FOREIGN_KEY_CHECKS = 0;
#select * from nfc_device_params;
#select * from nfc_temperature_data;
#update nfc_device_params set Company='riti' where Company='fff'
DROP TABLE IF EXISTS `cool_user`;
CREATE TABLE `cool_user` (
  `cool_user_id` varchar(100) NOT NULL COMMENT '用户ID',
  `cool_company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  `cool_user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `cool_user_password` varchar(100) DEFAULT NULL COMMENT '密码',
  `cool_user_token` varchar(100) DEFAULT NULL COMMENT '令牌',
  `cool_user_nick` varchar(100) COMMENT '昵称',
  `cool_user_gender` enum('M','F') COMMENT '性别',
  `cool_user_email` varchar(100) COMMENT '邮箱',
  `cool_create_time` datetime COMMENT '创建时间',
  `cool_user_update_time` datetime COMMENT '更新时间',
  `cool_user_level` smallint(6) COMMENT '账号等级',
  PRIMARY KEY (`cool_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `cool_manager` (
  `cool_manager_id` varchar(100) NOT NULL COMMENT '管理者id',
  `cool_user_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `cool_company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  `cool_tag_list_id` varchar(100) DEFAULT NULL COMMENT '温标列表id',
  PRIMARY KEY (`cool_manager_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cool_tag_list` (
  `cool_tag_list_id` varchar(100) NOT NULL COMMENT '温标列表id',
  `cool_user_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `uid` varchar(100) DEFAULT NULL COMMENT '温标',
  `cool_tag_create_time` datetime COMMENT '创建时间',
  `cool_tag_update_time` datetime COMMENT '更新时间',
  PRIMARY KEY (`cool_tag_list_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cool_company` (
  `cool_company_id` varchar(100) NOT NULL COMMENT '公司id',
  `cool_company_name` varchar(100) DEFAULT NULL COMMENT '公司名',
  `cool_company_email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `cool_company_address` varchar(100) DEFAULT NULL COMMENT '地址',
  `cool_company_tel` varchar(100) DEFAULT NULL COMMENT '电话',
  `cool_company_create_time` datetime COMMENT '创建时间',
  `cool_company_update_time` datetime COMMENT '更新时间',
  PRIMARY KEY (`cool_company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cool_message` (
  `cool_message_id` varchar(100) NOT NULL COMMENT '消息id',
  `cool_company_id` varchar(100) DEFAULT NULL COMMENT '公司名',
  `cool_user_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `cool_message_handle_id` varchar(100) DEFAULT NULL COMMENT '接收用户id',
  `cool_message_detail` varchar(200) DEFAULT NULL COMMENT '消息详情',
  `cool_message_create_time` datetime COMMENT '消息创建时间',
  `cool_message_update_time` datetime COMMENT '更新创建时间',
  PRIMARY KEY (`cool_message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;







