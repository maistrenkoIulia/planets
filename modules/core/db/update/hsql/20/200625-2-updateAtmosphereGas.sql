-- update PLANETS_ATMOSPHERE_GAS set GAS_ID = <default_value> where GAS_ID is null ;
alter table PLANETS_ATMOSPHERE_GAS alter column GAS_ID set not null ;
update PLANETS_ATMOSPHERE_GAS set VOLUME = 0 where VOLUME is null ;
alter table PLANETS_ATMOSPHERE_GAS alter column VOLUME set not null ;
