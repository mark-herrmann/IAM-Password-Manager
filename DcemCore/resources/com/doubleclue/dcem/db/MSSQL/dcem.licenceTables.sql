create table licence_cluster (
dc_id int not null,
clusterId varchar(255) not null,
clusterName varchar(255) not null,
createdOn datetime2 not null,
dc_disabled bit not null,
information varchar(255),
productive bit,
dc_customer int not null,
primary key (dc_id)
);

create table licence_customer (
dc_id int not null,
adress varchar(255) not null,
contact_email varchar(255),
contact_name varchar(255),
country varchar(128) not null,
name varchar(255) not null,
zip_code varchar(255),
primary key (dc_id)
);

create table licence_orders (
dc_id int not null,
lastModified datetime2 not null,
limitationMap varchar(4096) not null,
moduleID varchar(255),
tenantID varchar(255),
clusterId int not null,
customerId int not null,
lastModifiedBy int not null,
primary key (dc_id)
);

create table licence_otp_token (
dc_id int not null,
otpType int not null,
secretKey varbinary(MAX) not null,
serialNumber varchar(255) not null,
dc_customer int,
primary key (dc_id)
);

alter table licence_cluster
add constraint UK_LICENCE_CLUSTER_ID unique (clusterId);

alter table licence_cluster
add constraint UK_LICENCE_CLUSTER_NAME unique (clusterName);

alter table licence_customer
add constraint UK_CUSTOMER_NAME unique (name);

alter table licence_otp_token
add constraint UK_LICENCE_OTP_SERIAL unique (serialNumber);

alter table licence_cluster
add constraint FK_CLUSTER_CUSTOMER
foreign key (dc_customer)
references licence_customer;

alter table licence_orders
add constraint FK_licence_orders_license_cluster_id
foreign key (clusterId)
references licence_cluster;

alter table licence_orders
add constraint FK_licence_orders_license_customer_id
foreign key (customerId)
references licence_customer;

alter table licence_orders
add constraint FK_license_orders_core_user_id
foreign key (lastModifiedBy)
references core_user;

alter table licence_otp_token
add constraint FK_OTP_CUSTOMER
foreign key (dc_customer)
references licence_customer;
