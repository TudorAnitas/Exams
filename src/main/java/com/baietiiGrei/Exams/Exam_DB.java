package com.baietiiGrei.Exams;

public class Exam_DB {
    private int id;
    private String academic_year;
    private String session_type;
    private int study_year;
    private String section;
    private int capacity;
    private int course_id;
    private int professor_id;
    private int student_id;


    public Exam_DB(int id, String academic_year, String session_type, int study_year, String section, int capacity, int course_id, int professor_id, int student_id) {
        this.id = id;
        this.academic_year = academic_year;
        this.session_type = session_type;
        this.study_year = study_year;
        this.section = section;
        this.capacity = capacity;
        this.course_id = course_id;
        this.professor_id = professor_id;
        this.student_id = student_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    public String getSession_type() {
        return session_type;
    }

    public void setSession_type(String session_type) {
        this.session_type = session_type;
    }

    public int getStudy_year() {
        return study_year;
    }

    public void setStudy_year(int study_year) {
        this.study_year = study_year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
