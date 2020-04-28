package com.baietiiGrei.Exams;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Professor {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long professor_id;
    private String name;
    private String email;


    public Professor(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(professor_id, professor.professor_id) &&
                Objects.equals(name, professor.name) &&
                Objects.equals(email, professor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professor_id, name, email);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + professor_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Long getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(Long id) {
        this.professor_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
