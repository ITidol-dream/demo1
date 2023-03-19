package com.example;

import com.example.Configuration.MainConfiguration;
import com.example.entity.ArtTeacher;
import com.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");
        Student student  = context.getBean(Student.class);
        System.out.println(student);
        exp.setValue(student,"asfasdfsdf"); //表达式最终的运算结果可以通过getValue()获取
        System.out.println(student);
    }
}
