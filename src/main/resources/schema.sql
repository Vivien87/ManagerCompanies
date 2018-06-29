 create type positionUser as enum ('director','manager','specialist');

 create table company
(
   id integer not null,
    nameCompany varchar(255) not null,
    primary key(id)
 );
 create table department
  (
    id integer not null,
     nameDepartment varchar(255) not null,
    primary key(id)
 );
 create table user
  (
     id integer not null,
    nameUser varchar(255) not null,
     lastName varchar (255) not null,
   dateOfBirth TIMESTAMP not null,
     position varchar(255) not null ,
    primary key(id)
 );