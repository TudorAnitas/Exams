package com.baietiiGrei.Exams;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {

    public List<Exam> getExamList() {
        List<Exam> examList = new ArrayList<>();

        examList.add(new Exam("2020","summer","2","info en",10,"ads","foxy"));
        examList.add(new Exam("2019","winter","1","info en",10,"ads","foxy"));
        return examList;
    }
}
