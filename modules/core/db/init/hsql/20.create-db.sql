-- begin PLANETS_CARRIER
create unique index IDX_PLANETS_CARRIER_UNIQ_NAME on PLANETS_CARRIER (NAME) ^
-- end PLANETS_CARRIER

-- begin PLANETS_ATMOSPHERE_GAS
alter table PLANETS_ATMOSPHERE_GAS add constraint FK_PLANETS_ATMOSPHERE_GAS_ON_GAS foreign key (GAS_ID) references PLANETS_GAS(ID)^
alter table PLANETS_ATMOSPHERE_GAS add constraint FK_PLANETS_ATMOSPHERE_GAS_ON_ATMOSPHERE foreign key (ATMOSPHERE_ID) references PLANETS_ATMOSPHERE(ID)^
create unique index IDX_PLANETS_ATMOSPHERE_GAS_UNIQ_GAS_ID on PLANETS_ATMOSPHERE_GAS (GAS_ID) ^
create index IDX_PLANETS_ATMOSPHERE_GAS_ON_GAS on PLANETS_ATMOSPHERE_GAS (GAS_ID)^
create index IDX_PLANETS_ATMOSPHERE_GAS_ON_ATMOSPHERE on PLANETS_ATMOSPHERE_GAS (ATMOSPHERE_ID)^
-- end PLANETS_ATMOSPHERE_GAS
-- begin PLANETS_CUSTOMER
create unique index IDX_PLANETS_CUSTOMER_UNIQ_NAME on PLANETS_CUSTOMER (NAME) ^
create unique index IDX_PLANETS_CUSTOMER_UNIQ_FIRST_NAME on PLANETS_CUSTOMER (FIRST_NAME) ^
-- end PLANETS_CUSTOMER
-- begin PLANETS_GAS
create unique index IDX_PLANETS_GAS_UNIQ_NAME on PLANETS_GAS (NAME) ^
-- end PLANETS_GAS
-- begin PLANETS_SPACEPORT
alter table PLANETS_SPACEPORT add constraint FK_PLANETS_SPACEPORT_ON_PLANET foreign key (PLANET_ID) references PLANETS_PLANET(ID)^
alter table PLANETS_SPACEPORT add constraint FK_PLANETS_SPACEPORT_ON_MOON foreign key (MOON_ID) references PLANETS_MOON(ID)^
create unique index IDX_PLANETS_SPACEPORT_UNIQ_NAME on PLANETS_SPACEPORT (NAME) ^
create index IDX_PLANETS_SPACEPORT_ON_PLANET on PLANETS_SPACEPORT (PLANET_ID)^
create index IDX_PLANETS_SPACEPORT_ON_MOON on PLANETS_SPACEPORT (MOON_ID)^
-- end PLANETS_SPACEPORT
-- begin PLANETS_WAYBILL_ITEM
alter table PLANETS_WAYBILL_ITEM add constraint FK_PLANETS_WAYBILL_ITEM_ON_WAYBILL foreign key (WAYBILL_ID) references PLANETS_WAYBILL(ID)^
create unique index IDX_PLANETS_WAYBILL_ITEM_UNIQ_NAME on PLANETS_WAYBILL_ITEM (NAME) ^
create index IDX_PLANETS_WAYBILL_ITEM_ON_WAYBILL on PLANETS_WAYBILL_ITEM (WAYBILL_ID)^
-- end PLANETS_WAYBILL_ITEM
-- begin PLANETS_WAYBILL
alter table PLANETS_WAYBILL add constraint FK_PLANETS_WAYBILL_ON_CREATOR foreign key (CREATOR_ID) references SEC_USER(ID)^
alter table PLANETS_WAYBILL add constraint FK_PLANETS_WAYBILL_ON_SHIPPER foreign key (SHIPPER_ID) references PLANETS_CUSTOMER(ID)^
alter table PLANETS_WAYBILL add constraint FK_PLANETS_WAYBILL_ON_CONSIGNEE foreign key (CONSIGNEE_ID) references PLANETS_CUSTOMER(ID)^
alter table PLANETS_WAYBILL add constraint FK_PLANETS_WAYBILL_ON_DEPARTURE_PORT foreign key (DEPARTURE_PORT_ID) references PLANETS_SPACEPORT(ID)^
alter table PLANETS_WAYBILL add constraint FK_PLANETS_WAYBILL_ON_DESTINATION_PORT foreign key (DESTINATION_PORT_ID) references PLANETS_SPACEPORT(ID)^
alter table PLANETS_WAYBILL add constraint FK_PLANETS_WAYBILL_ON_CARRIER foreign key (CARRIER_ID) references PLANETS_CARRIER(ID)^
create index IDX_PLANETS_WAYBILL_ON_CREATOR on PLANETS_WAYBILL (CREATOR_ID)^
create index IDX_PLANETS_WAYBILL_ON_SHIPPER on PLANETS_WAYBILL (SHIPPER_ID)^
create index IDX_PLANETS_WAYBILL_ON_CONSIGNEE on PLANETS_WAYBILL (CONSIGNEE_ID)^
create index IDX_PLANETS_WAYBILL_ON_DEPARTURE_PORT on PLANETS_WAYBILL (DEPARTURE_PORT_ID)^
create index IDX_PLANETS_WAYBILL_ON_DESTINATION_PORT on PLANETS_WAYBILL (DESTINATION_PORT_ID)^
create index IDX_PLANETS_WAYBILL_ON_CARRIER on PLANETS_WAYBILL (CARRIER_ID)^
-- end PLANETS_WAYBILL
-- begin PLANETS_PLANET
alter table PLANETS_PLANET add constraint FK_PLANETS_PLANET_ON_ATMOSPHERE foreign key (ATMOSPHERE_ID) references PLANETS_ATMOSPHERE(ID)^
alter table PLANETS_PLANET add constraint FK_PLANETS_PLANET_ON_PICTURE foreign key (PICTURE_ID) references SYS_FILE(ID)^
create unique index IDX_PLANETS_PLANET_UNIQ_NAME on PLANETS_PLANET (NAME) ^
create index IDX_PLANETS_PLANET_ON_ATMOSPHERE on PLANETS_PLANET (ATMOSPHERE_ID)^
create index IDX_PLANETS_PLANET_ON_PICTURE on PLANETS_PLANET (PICTURE_ID)^
-- end PLANETS_PLANET
-- begin PLANETS_MOON
alter table PLANETS_MOON add constraint FK_PLANETS_MOON_ON_PLANET foreign key (PLANET_ID) references PLANETS_PLANET(ID)^
alter table PLANETS_MOON add constraint FK_PLANETS_MOON_ON_ATMOSPHERE foreign key (ATMOSPHERE_ID) references PLANETS_ATMOSPHERE(ID)^
alter table PLANETS_MOON add constraint FK_PLANETS_MOON_ON_PICTURE foreign key (PICTURE_ID) references SYS_FILE(ID)^
create unique index IDX_PLANETS_MOON_UNIQ_NAME on PLANETS_MOON (NAME) ^
create index IDX_PLANETS_MOON_ON_PLANET on PLANETS_MOON (PLANET_ID)^
create index IDX_PLANETS_MOON_ON_ATMOSPHERE on PLANETS_MOON (ATMOSPHERE_ID)^
create index IDX_PLANETS_MOON_ON_PICTURE on PLANETS_MOON (PICTURE_ID)^
-- end PLANETS_MOON
-- begin PLANETS_CARRIER_SPACEPORT_LINK
alter table PLANETS_CARRIER_SPACEPORT_LINK add constraint FK_CARSPA_ON_SPACEPORT foreign key (SPACEPORT_ID) references PLANETS_SPACEPORT(ID)^
alter table PLANETS_CARRIER_SPACEPORT_LINK add constraint FK_CARSPA_ON_CARRIER foreign key (CARRIER_ID) references PLANETS_CARRIER(ID)^
-- end PLANETS_CARRIER_SPACEPORT_LINK
