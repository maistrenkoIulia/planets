alter table PLANETS_COMPANY add constraint FK_PLANETS_COMPANY_ON_ID foreign key (ID) references PLANETS_CUSTOMER(ID) on delete CASCADE;
