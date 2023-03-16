package com.example;

import com.example.Configuration.MainConfiguration;
import com.example.entity.ArtTeacher;
import com.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student  = context.getBean(Student.class);
        System.out.println("开始");
        student.syncTest();
        System.out.println("结束");

    }
}
