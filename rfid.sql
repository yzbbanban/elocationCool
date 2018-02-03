CREATE TABLE if not exists  rfidUser (
`rfidUserId` varchar(100) Not NULL COMMENT '客户id',
`cool_user_id` varchar(100) NOT NULL COMMENT '用户ID',
`rfidUserName` varchar(100) Not NULL COMMENT '地点名称',
`rfidUserLocation` varchar(100) Not NULL COMMENT '详细位置',
`rfidUserCreatTime` datetime Not NULL COMMENT '创建时间',
PRIMARY KEY (`rfidUserId`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table rfidIdName(
`rfidOrderId` int auto_increment ,
`rfidIdName` varchar(100) Not NULL COMMENT '单号名',
`rfidOrderNumCreateTime` datetime Not NULL COMMENT '创建时间',
constraint pk_rfidOrder primary key (`rfidOrderId`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table rfidOrder(
`rfidUserId` varchar(100) Not NULL COMMENT '客户id',
`rfidOrderNum` varchar(100) Not NULL COMMENT '订单号',
`rfidIdName` varchar(100) Not NULL COMMENT '单号名',
`rfidOrderStockType` varchar(100) Not NULL COMMENT '0入库或1出库',
`rfidOrderCreateTime` datetime Not NULL COMMENT '创建时间',
constraint pk_rfidOrder primary key (`rfidUserId`,`rfidIdName`,`rfidOrderStockType`,`rfidOrderCreateTime`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table rfidOrderRecent(
`rfidUserId` varchar(100) Not NULL COMMENT '客户id',
`rfidOrderNum` varchar(100) Not NULL COMMENT '订单号',
`rfidIdName` varchar(100) Not NULL COMMENT '单号名',
`rfidOrderStockType` varchar(100) Not NULL COMMENT '0入库或1出库',
`rfidOrderRecentTime` datetime Not NULL COMMENT '更新时间',
constraint pk_rfidOrder primary key (`rfidIdName`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
