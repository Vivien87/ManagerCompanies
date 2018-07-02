CREATE TABLE POSITIONTYPE (
    ID INT NOT NULL PRIMARY KEY ,
    POSITION VARCHAR (50)
);

CREATE TABLE COMPANY (
  ID INT GENERATED BY DEFAULT AS IDENTITY,
  NAME VARCHAR(255),
  PRIMARY KEY (ID),
  UNIQUE KEY COMPANY_NAME (NAME)
);

CREATE TABLE DEPARTMENT (
  ID INT GENERATED BY DEFAULT AS IDENTITY,
  NAME VARCHAR(255),
  COMPANY_ID INT NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (COMPANY_ID) REFERENCES COMPANY(ID)
);


 create table user
  (
  ID INT GENERATED BY DEFAULT AS IDENTITY,
  NAME VARCHAR(255),
  LASTNAME VARCHAR(255),
  DATE_OF_BIRTH DATE ,
  POSITION_ID INT NOT NULL,
  DEPARTMENT_ID INT NOT NULL,
  PRIMARY KEY (ID),

FOREIGN KEY (POSITION_ID) REFERENCES POSITIONTYPE(ID),
FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID)
);