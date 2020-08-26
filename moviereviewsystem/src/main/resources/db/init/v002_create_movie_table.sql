------- Movie table creation -----
CREATE TABLE MOVIE (
  MOVIE_ID VARCHAR(32) PRIMARY KEY,
  TITLE VARCHAR(100) NOT NULL,
  DESCRIPTION VARCHAR(500) NOT NULL,
  POSTER BLOB
);