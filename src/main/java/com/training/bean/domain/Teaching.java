package com.training.bean.domain;

public class Teaching {
    private Subject subject;

    public Teaching(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teaching{" +
                "subject=" + subject +
                '}';
    }
}
