package com.baietiiGrei.Exams;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Optional;

@Entity
public class Student{
    private @Id @GeneratedValue Long id;
    private String name;
    private String email;
    private int study_year;
    private String section;

    public Student() {}

    public Student(Long id, String name, String email, int study_year, String section) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.study_year = study_year;
        this.section = section;
    }

    @Override
    public boolean equals(Object o){
        if(this==o){return true;}
        if(o==null || getClass()!=o.getClass()){return false;}
        Student student = (Student) o;
        return Objects.equals(id,student.id) &&
                Objects.equals(name,student.name) &&
                Objects.equals(email,student.email) &&
                Objects.equals(study_year,student.study_year) &&
                Objects.equals(section,student.section);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,email,study_year,section);
    }

    @Override
    public String toString(){
        return "Student{"+
                "id="+id+
                ", name='"+name+'\''+
                ", email='"+email+'\''+
                ", study_year='"+study_year+'\''+
                ", section='"+section+'\''+
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
