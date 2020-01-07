package com.section1;

public class Fish extends Animal{

    public Fish(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    @Override
    public void move() {
        System.out.println("com.section1.Fish is swimming");
    }

    public void swim()
    {
        System.out.println("Swimming");
    }
}
