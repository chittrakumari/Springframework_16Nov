package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.awt.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//     //@Bean(name={"Beast"})
//    @Bean
//    //@Scope("prototype")
//     public Desktop desktop(){
//        return new Desktop();
//    }
//// @Qualifier("laptop")
//    @Bean
//    public Alien alien(Computer com){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
