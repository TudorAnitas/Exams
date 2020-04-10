INSERT INTO STUDENT(NAME,EMAIL,STUDY_YEAR,SECTION) VALUES
	('John Doe','johndoe@gmail.com','2','Computer Science'),
	('Jane Doe','janed@gmail.com','1','Chemistry'),
	('Raymond Reddington','redsemail@gmail.com','3','Law'),
	('Ulysess Grant','ulysess_grant85@yahoo.com','2','Computer Science');
INSERT INTO PROFESSOR(NAME,EMAIL) VALUES
	('Garry Kasparov','kasparov_chess@gmail.com'),
	('Keanu Reeves','johnwick1@gmail.com'),
	('Aldo Raine','aldoraine_us@gmail.com'),
	('Elon Musk','tesla_spacex@gmail.com');
INSERT INTO COURSE(COURSE_NAME,CREDITS,PROFESSOR_ID) VALUES
	('Programming 3','6',SELECT id FROM PROFESSOR WHERE NAME = 'Garry Kasparov'),
	('Logic For Computer Science','5',SELECT id FROM PROFESSOR WHERE NAME = 'Keanu Reeves'),
	('Calculus','5',SELECT id FROM PROFESSOR WHERE NAME = 'Aldo Raine'),
	('Computer Architecture','4',SELECT id FROM PROFESSOR WHERE NAME = 'Elon Musk');
INSERT INTO EXAM(ACADEMIC_YEAR,SESSION_TYPE,STUDY_YEAR,SECTION,CAPACITY,COURSE_ID) VALUES
	('2019-2020','Winter','2','Computer Science','90',SELECT id FROM COURSE WHERE COURSE_NAME = 'Programming 3'),
	('2019-2020','Winter','1','Computer Science','110',SELECT id FROM COURSE WHERE COURSE_NAME = 'Logic For Computer Science'),
	('2019-2020','Summer','1','Computer Science','70',SELECT id FROM COURSE WHERE COURSE_NAME = 'Calculus'),
	('2019-2020','Winter','1','Computer Science','60',SELECT id FROM COURSE WHERE COURSE_NAME = 'Computer Architecture');