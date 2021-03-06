------- Reviews table creation -----

CREATE TABLE REVIEW (
  REVIEW_ID VARCHAR(32) PRIMARY KEY,
  TITLE VARCHAR(100) NOT NULL,
  DESCRIPTION VARCHAR(500),
  RATING INTEGER NOT NULL,
  MOVIE_ID VARCHAR(32),
  REVIEWER  VARCHAR(32),
  REVIEW_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP
  
);


ALTER TABLE REVIEW
ADD CONSTRAINT FK_MOVIE_ID
FOREIGN KEY (MOVIE_ID) REFERENCES MOVIE(MOVIE_ID);

ALTER TABLE REVIEW
ADD CONSTRAINT FK_REVIEW_ID
FOREIGN KEY (REVIEWER) REFERENCES USER(USERNAME);