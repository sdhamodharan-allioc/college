package com.training.bean.domain;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StdMain {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("stdapp.xml");

        //autowire=byName
        Student std = (Student) context.getBean("student");
        System.out.println("Student Details : "+std);

        //autowire=byType
        Faculty faculty = (Faculty)context.getBean("faculty");
        System.out.println("Faculty Details : "+faculty);

        //autowire=constructor
        Teaching teaching = (Teaching) context.getBean("teaching");
        System.out.println("Teaching  Details : "+teaching);

        //autowire=default
        Warden warden = (Warden) context.getBean("warden");
        System.out.println("Warden Details : "+warden);

    }
}
