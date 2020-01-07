package com.section1;

public class Bird extends Animal {


    public Bird(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    @Override
    public void move() {
        System.out.println("com.section1.Bird is flapping wings");
    }


}
