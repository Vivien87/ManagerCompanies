INSERT INTO  COMPANY (id, name)VALUES (1,'Coca-Cola');
INSERT INTO  COMPANY (id, name) VALUES (2,'IBM');
INSERT INTO  COMPANY (id, name) VALUES (3,'APPLE');
INSERT INTO  COMPANY (id, name) VALUES (4,'Nike');




 INSERT INTO  USER (ID,NAME,LASTNAME,DATE_OF_BIRTH) VALUES
        (1,'Misha', 'Korol','1987-11-12'),
        (2,'Vova', 'dib','1987-11-12'),
        (3,'Sergiy', 'mar','1987-11-12'),
        (4,'Yura', 'poli','1987-11-12'),
        (5,'Rus', 'kon','1987-11-12'),
        (6,'Valera', 'kkk','1987-11-12'),
        (7,'Igor', 'vvv','1987-11-12'),
        (8,'Dima', 'ddd','1987-11-12'),
        (9,'Anya', 'ccc','1987-11-12'),
        (10,'Oksana', 'bbb','1987-11-12'),
        (11,'Nastya', 'aaa','1987-11-12'),
        (12,'Olya', 'aaa','1987-11-12');

INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('SPECIALIST',1);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('MANAGER',2);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('DIRECTOR',3);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('SPECIALIST',4);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('MANAGER',5);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('SPECIALIST',6);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('SPECIALIST',7);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('MANAGER',8);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('DIRECTOR',9);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('SPECIALIST',10);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('MANAGER',11);
INSERT INTO POSITIONTYPE ( position,USERID) VALUES ('SPECIALIST',12);




-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (1,'IT',1,2);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES  (2,'Legal',6,1);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (3,'HR',2,1);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (4,'IT',3,2);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (5,'HR',4,2);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (6,'IT',5,3);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES  (7,'Legal',6,3);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (8,'HR',7,4);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (9,'Legal',1,2);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES  (10,'Legal',6,1);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (11,'HR',2,1);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (12,'IT',3,2);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (13,'HR',4,2);
-- INSERT INTO DEPARTMENT(ID, NAME,USER_ID, COMPANY_ID) VALUES (14,'IT',5,3);

INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (1, 1, 2,'HR');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (2, 6, 1,'FINANCE');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (3, 2, 1,'LEGAL');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (4, 3, 2,'IT');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (5, 4, 2,'HR');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (6, 5, 3,'IT');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (7, 7, 2,'IT');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (8, 8, 1,'HR');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (9, 9, 1,'FINANCE');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (10, 10, 2,'IT');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (11, 11, 2,'HR');
INSERT INTO DEPARTMENT(ID, USER_ID, COMPANY_ID,DEPARTMENT_CATEGORY) VALUES (12, 12, 3,'LEGAL');


INSERT INTO DEPARTMENTCATEGORY ( ID, NAME ) VALUES (1,'IT');
INSERT INTO DEPARTMENTCATEGORY ( ID, NAME) VALUES  (2,'LEGAL');
INSERT INTO DEPARTMENTCATEGORY ( ID, NAME) VALUES  (3,'HR');
INSERT INTO DEPARTMENTCATEGORY ( ID, NAME) VALUES  (4,'FINANCE');


INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID)  VALUES (1, 3);
INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID) VALUES (2, 4);
INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID) VALUES (3, 2);
INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID) VALUES (4, 1);
INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID) VALUES (5, 3);
INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID) VALUES (6, 1);
INSERT INTO DEPARTMENT_CATEGORY (DEPARTMENT_ID,DEPARTMENTCATEGORY_ID) VALUES (7, 1);