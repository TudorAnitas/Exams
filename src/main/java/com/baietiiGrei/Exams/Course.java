package com.baietiiGrei.Exams;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Course {
    private @Id @GeneratedValue Long id;
    private String name;
    private int credits;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name="FK_PROFESSOR_ID"))
    private Professor professor_id;

    public Course() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return credits == course.credits &&
                professor_id == course.professor_id &&
                Objects.equals(id, course.id) &&
                Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, credits, professor_id);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", professor_id=" + professor_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(Professor professor_id) {
        this.professor_id = professor_id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
