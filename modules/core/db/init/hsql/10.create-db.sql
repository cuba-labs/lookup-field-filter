-- begin DEMO_PRODUCT
create table DEMO_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end DEMO_PRODUCT
-- begin DEMO_CUSTOMER
create table DEMO_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    LAST_NAME varchar(100) not null,
    AGE integer,
    ACTIVE boolean not null,
    GRADE integer,
    --
    primary key (ID)
)^
-- end DEMO_CUSTOMER
-- begin DEMO_ORDER_ITEM
create table DEMO_ORDER_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    QUANTITY decimal(19, 3) not null,
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end DEMO_ORDER_ITEM
-- begin DEMO_ORDER
create table DEMO_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    DATE_ date not null,
    AMOUNT decimal(19, 2),
    DESCRIPTION longvarchar,
    --
    primary key (ID)
)^
-- end DEMO_ORDER
