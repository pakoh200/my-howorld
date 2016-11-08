INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL) VALUES(1,'test','test','테스트','test@test.test');
INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL) VALUES(2,'test2','test2','테스트2','test2@test2.test2');

INSERT INTO QUESTION (id, writer_id, title, contents, create_date) VALUES(1,1,'test','test',CURRENT_TIMESTAMP());
INSERT INTO QUESTION (id, writer_id, title, contents, create_date) VALUES(2,2,'test2','test2',CURRENT_TIMESTAMP());