----- Insert User data -----

INSERT INTO USER(USERNAME, PASSWORD, USER_TYPE) VALUES ('admin', 'admin','admin');

INSERT INTO USER(USERNAME, PASSWORD, USER_TYPE) VALUES ('user', 'user','user');

------ Insert Roles -----

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

------ Insert Movie Data -----------
INSERT INTO MOVIE(TITLE, DESCRIPTION,POSTER ) VALUES ('First', 'First Movie', null);

INSERT INTO MOVIE(TITLE, DESCRIPTION,POSTER ) VALUES ('Second', 'First Movie', null);

INSERT INTO MOVIE(TITLE, DESCRIPTION,POSTER ) VALUES ('Third', 'First Movie', null);


------ Insert Review Data -----------

INSERT INTO REVIEW(TITLE, DESCRIPTION, RATING, MOVIE_ID, REVIEWER) VALUES("Good","Nice Movie",4,"MOVIE001",'admin');