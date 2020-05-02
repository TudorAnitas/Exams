CREATE TABLE STUDENT(
	id INTEGER NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) NOT NULL,
	EMAIL VARCHAR(255) NOT NULL,
	STUDY_YEAR INTEGER NOT NULL,
	SECTION VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE PROFESSOR(
	PROFESSOR_ID INTEGER NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) NOT NULL,
	EMAIL VARCHAR(255) NOT NULL,
	PRIMARY KEY(PROFESSOR_ID)
);

CREATE TABLE COURSE(
	COURSE_ID INTEGER NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) NOT NULL,
	CREDITS INTEGER NOT NULL,
	PROFESSOR_ID INTEGER NOT NULL,
	PRIMARY KEY(COURSE_ID),
	FOREIGN KEY(PROFESSOR_ID) REFERENCES PROFESSOR(professor_id)
);

CREATE TABLE EXAM(
	EXAM_ID INTEGER NOT NULL AUTO_INCREMENT,
	ACADEMIC_YEAR VARCHAR(255) NOT NULL,
	STUDY_YEAR INTEGER NOT NULL,
	SECTION VARCHAR(255) NOT NULL,
	CAPACITY INTEGER NOT NULL,
	TEACHER VARCHAR(255) NOT NULL,
	CLASSROOM VARCHAR(255) NOT NULL,
	DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	COURSE_ID INTEGER NOT NULL,
	PRIMARY KEY(EXAM_ID),
	FOREIGN KEY(COURSE_ID) REFERENCES COURSE(COURSE_ID)
);