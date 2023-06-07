package com.training.bean.domain;

public class Student {

    private StudentUser studentUser;

    public StudentUser getStudentUser() {
        return studentUser;
    }

    public void setStudentUser(StudentUser studentUser) {
        this.studentUser = studentUser;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentUser=" + studentUser +
                '}';
    }
}
