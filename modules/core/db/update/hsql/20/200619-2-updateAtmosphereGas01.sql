alter table PLANETS_ATMOSPHERE_GAS add constraint FK_PLANETS_ATMOSPHERE_GAS_ON_ATMOSPHERE foreign key (ATMOSPHERE_ID) references PLANETS_ATMOSPHERE(ID);
create index IDX_PLANETS_ATMOSPHERE_GAS_ON_ATMOSPHERE on PLANETS_ATMOSPHERE_GAS (ATMOSPHERE_ID);
