alter table PLANETS_INDIVIDUAL add constraint FK_PLANETS_INDIVIDUAL_ON_ID foreign key (ID) references PLANETS_CUSTOMER(ID) on delete CASCADE;
create unique index IDX_PLANETS_INDIVIDUAL_UNIQ_FIRST_NAME on PLANETS_INDIVIDUAL (FIRST_NAME);
