package org.example;

public class Laptop implements Computer {
    public Laptop(){
    System.out.println("Desktop object created");
}


    @Override
    public void laptopCode(){
        System.out.println("Hello from laptop");
    }
}
