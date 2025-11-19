package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop object created");
    }
    @Override
    public void laptopCode() {
        System.out.println("compiling using Desktop");
    }
}
