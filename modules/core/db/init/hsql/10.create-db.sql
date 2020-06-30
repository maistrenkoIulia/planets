-- begin PLANETS_CARRIER
create table PLANETS_CARRIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end PLANETS_CARRIER
-- begin PLANETS_ATMOSPHERE
create table PLANETS_ATMOSPHERE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(255),
    PRESSURE double precision,
    --
    primary key (ID)
)^
-- end PLANETS_ATMOSPHERE
-- begin PLANETS_ATMOSPHERE_GAS
create table PLANETS_ATMOSPHERE_GAS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GAS_ID varchar(36) not null,
    VOLUME double precision not null,
    ATMOSPHERE_ID varchar(36),
    --
    primary key (ID)
)^
-- end PLANETS_ATMOSPHERE_GAS
-- begin PLANETS_CUSTOMER
create table PLANETS_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    TYPE varchar(31),
    --
    NAME varchar(255),
    EMAIL varchar(255),
    GRADE varchar(50),
    --
    primary key (ID)
)^
-- end PLANETS_CUSTOMER
-- begin PLANETS_DISCOUNTS
create table PLANETS_DISCOUNTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GRADE varchar(50),
    VALUE_ decimal(19, 2),
    --
    primary key (ID)
)^
-- end PLANETS_DISCOUNTS
-- begin PLANETS_GAS
create table PLANETS_GAS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end PLANETS_GAS
-- begin PLANETS_SPACEPORT
create table PLANETS_SPACEPORT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COORDINATES_LATITUDE double precision,
    COORDINATES_LONGITUDE double precision,
    --
    NAME varchar(255),
    PLANET_ID varchar(36),
    MOON_ID varchar(36),
    IS_DEFAULT boolean,
    --
    primary key (ID)
)^
-- end PLANETS_SPACEPORT
-- begin PLANETS_WAYBILL_ITEM
create table PLANETS_WAYBILL_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DIM_LENGHT double precision,
    DIM_WIDTH double precision,
    DIM_HEIGHT double precision,
    --
    NUMBER_ integer,
    NAME varchar(255),
    WEIGHT double precision,
    CHARGE decimal(19, 2),
    WAYBILL_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PLANETS_WAYBILL_ITEM
-- begin PLANETS_WAYBILL
create table PLANETS_WAYBILL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REFERENCE varchar(255),
    CREATOR_ID varchar(36),
    SHIPPER_ID varchar(36),
    CONSIGNEE_ID varchar(36),
    DEPARTURE_PORT_ID varchar(36),
    DESTINATION_PORT_ID varchar(36),
    CARRIER_ID varchar(36),
    TOTAL_WEIGHT double precision,
    TOTAL_CHARGE decimal(19, 2),
    --
    primary key (ID)
)^
-- end PLANETS_WAYBILL
-- begin PLANETS_PLANET
create table PLANETS_PLANET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    MASS double precision,
    PICTURE_ID varchar(36),
    --
    SEMI_MAJOR_AXIS double precision,
    ORBITAL_PERIOD double precision,
    ROTATION_PERIOD double precision,
    ATMOSPHERE_ID varchar(36),
    RINGS boolean,
    --
    primary key (ID)
)^
-- end PLANETS_PLANET
-- begin PLANETS_MOON
create table PLANETS_MOON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    MASS double precision,
    PICTURE_ID varchar(36),
    --
    PLANET_ID varchar(36),
    ATMOSPHERE_ID varchar(36),
    --
    primary key (ID)
)^
-- end PLANETS_MOON
-- begin PLANETS_CARRIER_SPACEPORT_LINK
create table PLANETS_CARRIER_SPACEPORT_LINK (
    SPACEPORT_ID varchar(36) not null,
    CARRIER_ID varchar(36) not null,
    primary key (SPACEPORT_ID, CARRIER_ID)
)^
-- end PLANETS_CARRIER_SPACEPORT_LINK
-- begin PLANETS_INDIVIDUAL
create table PLANETS_INDIVIDUAL (
    ID varchar(36) not null,
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end PLANETS_INDIVIDUAL
-- begin PLANETS_COMPANY
create table PLANETS_COMPANY (
    ID varchar(36) not null,
    --
    REGISTRATION_ID varchar(255),
    COMPANY_TYPE varchar(255),
    --
    primary key (ID)
)^
-- end PLANETS_COMPANY
