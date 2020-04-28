package com.baietiiGrei.Exams;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Exam {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long exam_id;
    private String academic_year;
    private int study_year;
    private String section;
    private int capacity;
    private String teacher;
    private String classroom;
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    public Exam() {}

    public Exam(Long exam_id, String academic_year, int study_year, String section, int capacity, String teacher, String classroom, Timestamp date, Course course) {
        this.exam_id = exam_id;
        this.academic_year = academic_year;
        this.study_year = study_year;
        this.section = section;
        this.capacity = capacity;
        this.teacher = teacher;
        this.classroom = classroom;
        this.date = date;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam_ = (Exam) o;
        return study_year == exam_.study_year &&
                capacity == exam_.capacity &&
                Objects.equals(exam_id, exam_.exam_id) &&
                Objects.equals(academic_year, exam_.academic_year) &&
                Objects.equals(section, exam_.section) &&
                Objects.equals(teacher, exam_.teacher) &&
                Objects.equals(classroom, exam_.classroom) &&
                Objects.equals(date, exam_.date) &&
                Objects.equals(course, exam_.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exam_id, academic_year, study_year, section, capacity, teacher, classroom, date, course);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + exam_id +
                ", academic_year='" + academic_year + '\'' +
                ", study_year=" + study_year +
                ", section='" + section + '\'' +
                ", capacity=" + capacity +
                ", teacher='" + teacher + '\'' +
                ", classroom='" + classroom + '\'' +
                ", date=" + date +
                ", course_id=" + course +
                '}';
    }

    public Long getExam_id() {
        return exam_id;
    }

    public void setExam_id(Long id) {
        this.exam_id = id;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
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

    public Course getCourse() { return course; }

    public void setCourse(Course course_id) { this.course = course_id; }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
