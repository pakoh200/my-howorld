INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES(1,'test','test','테스트','test@test.test', CURRENT_TIMESTAMP());
INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES(2,'test2','test2','테스트2','test2@test2.test2', CURRENT_TIMESTAMP());

INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES(1,1,'test','test',CURRENT_TIMESTAMP(), 0);
INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES(2,2,'test2','test2',CURRENT_TIMESTAMP(), 0);