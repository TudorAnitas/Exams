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
INSERT INTO COURSE(NAME,CREDITS,PROFESSOR_ID) VALUES
	('Programming 3',6,SELECT PROFESSOR_ID FROM PROFESSOR WHERE NAME = 'Garry Kasparov'),
	('Logic For Computer Science',5,SELECT PROFESSOR_ID FROM PROFESSOR WHERE NAME = 'Keanu Reeves'),
	('Calculus',5,SELECT PROFESSOR_ID FROM PROFESSOR WHERE NAME = 'Aldo Raine'),
	('Computer Architecture',4,SELECT PROFESSOR_ID FROM PROFESSOR WHERE NAME = 'Elon Musk');
INSERT INTO EXAM(ACADEMIC_YEAR,STUDY_YEAR,SECTION,CAPACITY,TEACHER,CLASSROOM,DATE,COURSE_ID) VALUES
	('2019-2020',2,'Computer Science',3,'Teacher 1','Classroom 1', {ts '2012-09-17 18:47:52.69'},SELECT COURSE_ID FROM COURSE WHERE NAME = 'Programming 3'),
	('2019-2020',1,'Computer Science',23,'Teacher 2','Classroom 2', {ts '2027-09-17 18:47:52.69'},SELECT COURSE_ID FROM COURSE WHERE NAME = 'Logic For Computer Science'),
	('2019-2020',1,'Computer Science',321,'Teacher 3','Classroom 3', {ts '2017-09-17 18:47:52.69'},SELECT COURSE_ID FROM COURSE WHERE NAME = 'Calculus'),
	('2019-2020',1,'Computer Science',321,'Teacher 4','Classroom 4', {ts '2032-09-17 18:47:52.69'},SELECT COURSE_ID FROM COURSE WHERE NAME = 'Computer Architecture');