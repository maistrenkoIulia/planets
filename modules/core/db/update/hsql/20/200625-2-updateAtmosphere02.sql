alter table PLANETS_ATMOSPHERE alter column PLANET_ID rename to PLANET_ID__U21487 ^
alter table PLANETS_ATMOSPHERE drop constraint FK_PLANETS_ATMOSPHERE_ON_PLANET ;
drop index IDX_PLANETS_ATMOSPHERE_ON_PLANET ;
