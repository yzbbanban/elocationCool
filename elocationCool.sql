create table if not exists NFC_Device_Params (
id int auto_increment,
Uid int not null default 1,
Company varchar(50),
DeviceNum varchar(50),
GoodsName varchar(50) not null default 'a',
delay smallint not null default 1,
IntervalTime smallint not null default 1,
MaxTemperature float not null default 10.0,
MinTemperature float not null default 10.0,
Model smallint not null default 1,
ReadStop smallint not null default 1,
DataUploadMode smallint not null default 0,
TagType smallint not null default 0,
MaxHum float,
MinHum float,
constraint pk_id primary key(id)
);
drop table nfc_temperature_data;
create table NFC_Temperature_Data(
	id int auto_increment,
    Uid int not null default 1,
    GoodsName varchar(50) not null default 'a',
    DateRecordTime varchar(50) not null default '1992-11-18 00:00:00',
    MaxTemperature float not null default 10.0,
	MinTemperature float not null default 10.0, 
    Temperature float not null default 10.0,
    TempStatus smallint not null default 0,
    MaxHum float,
    MinHum float,
    Hum float,
    HumStatus smallint,
	constraint pk_id primary key(id)
);

