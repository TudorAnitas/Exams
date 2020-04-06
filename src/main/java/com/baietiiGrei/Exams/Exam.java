package com.baietiiGrei.Exams;

public class Exam {
    private String academicYear;
    private String session;
    private String studyYear;
    private String faculty;
    private int nrOfSeats;
    private String course;
    private String teacher;

    // constructor for exam
    public Exam(String academicYear, String session, String studyYear, String faculty, int nrOfSeats, String course, String teacher) {
        this.academicYear = academicYear;
        this.session = session;
        this.studyYear = studyYear;
        this.faculty = faculty;
        this.nrOfSeats = nrOfSeats;
        this.course = course;
        this.teacher = teacher;
    }

    // getters and setters

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(String studyYear) {
        this.studyYear = studyYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
