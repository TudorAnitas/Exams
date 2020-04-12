package com.baietiiGrei.Exams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Exam_DB {
        private @Id @GeneratedValue Long id;
        private String academic_year;
        private String session_type;
        private int study_year;
        private String section;
        private int capacity;
        @ManyToOne
        @JoinColumn(foreignKey = @ForeignKey(name="FK_COURSE_ID"))
        private Course course_id;

        public Exam_DB() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam_DB exam_db = (Exam_DB) o;
        return study_year == exam_db.study_year &&
                capacity == exam_db.capacity &&
                Objects.equals(id, exam_db.id) &&
                Objects.equals(academic_year, exam_db.academic_year) &&
                Objects.equals(session_type, exam_db.session_type) &&
                Objects.equals(section, exam_db.section) &&
                Objects.equals(course_id, exam_db.course_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, academic_year, session_type, study_year, section, capacity, course_id);
    }

    @Override
    public String toString() {
        return "Exam_DB{" +
                "id=" + id +
                ", academic_year='" + academic_year + '\'' +
                ", session_type='" + session_type + '\'' +
                ", study_year=" + study_year +
                ", section='" + section + '\'' +
                ", capacity=" + capacity +
                ", course_id=" + course_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Course getCourse_id() { return course_id; }

    public void setCourse_id(Course course_id) { this.course_id = course_id; }
}
