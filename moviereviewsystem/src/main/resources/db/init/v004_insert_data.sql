----- Insert User data -----

INSERT INTO USER(USERNAME, PASSWORD, USER_TYPE) VALUES ('admin', '$2a$12$T2ZX1vbnQI/rJ7MTnblF3.IjvZwejRmLZkVKR/hjUk6jcbKa6pK6W','admin');

INSERT INTO USER(USERNAME, PASSWORD, USER_TYPE) VALUES ('user', '$2a$12$XQmEKpi.Z3ErguJm3kF40.3oZMYkSTDRbXhSe29oJ/3Nzn2JMiBJS','user');

------ Insert Roles -----

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

------ Insert Movie Data -----------
INSERT INTO MOVIE(TITLE, DESCRIPTION,POSTER ) VALUES ('First', 'First Movie', null);

INSERT INTO MOVIE(TITLE, DESCRIPTION,POSTER ) VALUES ('Second', 'First Movie', null);

INSERT INTO MOVIE(TITLE, DESCRIPTION,POSTER ) VALUES ('Third', 'First Movie', null);


------ Insert Review Data -----------

INSERT INTO REVIEW(TITLE, DESCRIPTION, RATING, MOVIE_ID, REVIEWER) VALUES("Good","Nice Movie",4,"MOVIE001",'admin');