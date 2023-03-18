package com.example.Configuration;


import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;

//这个就相当与xml配置
@Configuration
@EnableAsync
@ComponentScans({
        @ComponentScan("com.example.entity"),
        @ComponentScan("com.example.listener")
})
@PropertySource(value = "classpath:test.properties")
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
