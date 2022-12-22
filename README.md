This is Sehit Ozgur Gencer Apartment Management Project



Databse Note: this is sql query for logging sql table;

CREATE TABLE `EVENT_LOGS` (
  `ID` varchar(40) NOT NULL,
  `DATE_TIME` datetime DEFAULT NULL,
  `CLASS_INFO` varchar(45) DEFAULT NULL,
  `LEVEL` varchar(45) DEFAULT NULL,
  `MESSAGE` longtext,
  `EXCEPTION_INFO` longtext,
  PRIMARY KEY (`ID`)
) 

///---
