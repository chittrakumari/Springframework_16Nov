package org.example;

public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop object created");
    }
    @Override
    public void laptopCode() {
        System.out.println("compiling using Desktop");
    }
}
