package com.example.Configuration;

import com.example.entity.ArtTeacher;
import com.example.entity.Student;
import com.example.entity.Teacher;
import lombok.ToString;
import org.springframework.context.annotation.*;

//这个就相当与xml配置
@Configuration
@ComponentScan("com.example.entity")
//这个是配置类
public class MainConfiguration {
//    @Bean("A")
//    public ArtTeacher artTeacherA(){
//        return new ArtTeacher();
//    }
//    @Bean("B")
//    public ArtTeacher artTeacherB(){
//        return new ArtTeacher();
//    }
//    @Bean
//    public Student student(){
//        return new Student();
//    }

}
