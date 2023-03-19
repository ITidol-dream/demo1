package com.example.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Student {
  //  @Value("${test.name}")  //`@Value`中的`${...}`表示占位符，它会读取外部配置文件的属性值装配到属性中
    public String name;
    public  int age;
    @Autowired
    ArtTeacher artTeacher;
    public Student(@Value("${test.name}") String name){ //通过构造方法注入
        this.name = name;
        this.age = 12;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
