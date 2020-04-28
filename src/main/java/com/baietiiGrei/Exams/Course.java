package com.baietiiGrei.Exams;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Course {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long course_id;
    private String name;
    private int credits;

    @ManyToOne
    @JoinColumn(name="professor_id")
    private Professor professor;

    public Course() {}

    public Course(Long course_id, String name, int credits, Professor professor) {
        this.course_id = course_id;
        this.name = name;
        this.credits = credits;
        this.professor = professor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return credits == course.credits &&
                professor == course.professor &&
                Objects.equals(course_id, course.course_id) &&
                Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course_id, name, credits, professor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + course_id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", professor_id=" + professor +
                '}';
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long id) {
        this.course_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor_id) {
        this.professor = professor_id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
