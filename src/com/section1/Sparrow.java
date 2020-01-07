package com.section1;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }
    public void fly()
    {
        System.out.println("Flying");
    }
}
