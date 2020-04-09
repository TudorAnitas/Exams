package com.baietiiGrei.Exams;

public class Course {
    private int id;
    private String name;
    private int credits;
    private int professor_id;


    public Course(int id, String name, int credits, int professor_id) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.professor_id = professor_id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
