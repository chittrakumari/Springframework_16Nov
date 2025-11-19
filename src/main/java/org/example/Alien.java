package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;


    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Alien(){
        System.out.println("Object Created");
    }
    public void code(){
//        System.out.println("Hello from alien");
        com.laptopCode();
    }
}
