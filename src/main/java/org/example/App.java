package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("org.example")
public class App 
{
    public static void main( String[] args )
    {

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
       Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();
//        Desktop dt = context.getBean(Desktop.class);
//        dt.laptopCode();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.laptopCode();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.code();
//        Desktop obj = context.getBean(Desktop.class);

    }
}
