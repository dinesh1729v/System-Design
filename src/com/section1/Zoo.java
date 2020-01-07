package com.section1;

public class Zoo {
    public static void main(String[] args) {
//        com.section1.Animal elephant=new com.section1.Animal("Elephant", 20, 5000, "Male");
//        elephant.eat();
//        elephant.sleep(); //commenting because abstract classes cant be instantiated.
        Bird b=new Bird("sparrow", 5,2,"Fe");
        //b.fly();
        b.eat();
        b.sleep();
        Fish f=new Fish("GoldenFish",1,2,"Ma");
        f.swim();

        Chicken chick = new Chicken("A",2,23,"f");
        //chick.fly();
        Sparrow sp=new Sparrow("Sparrwo",2,2,"f");
        sp.fly();
        Animal spa=new Sparrow("A",2,2,"f");
        spa.move();

        Fish fi = new Fish("fa",2,2,"F");
        fi.move();

        moveAnimal(fi);    //this is the advantage of abstraction. The fish object can be send as an animal object
        moveAnimal(spa);
        Flyable flyingBird = new Sparrow("sparrow",2,2,"F");
        flyingBird.fly();


    }

    public static void moveAnimal(Animal animal)
    {
        animal.move();
    }
}
 