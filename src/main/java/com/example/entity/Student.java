package com.example.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Student {
    @Autowired
    ArtTeacher artTeacher;

//    public Student(ArtTeacher artTeacher) {
//        this.artTeacher  = artTeacher;
//    }
public void syncTest() throws InterruptedException {
    System.out.println(Thread.currentThread().getName()+"我是同步执行的方法，开始...");
    Thread.sleep(3000);
    System.out.println("我是同步执行的方法，结束！");
}

    @Async
    public void asyncTest() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"我是异步执行的方法，开始...");
        Thread.sleep(3000);
        System.out.println("我是异步执行的方法，结束！");
    }

}
