public class Zoo {
    public static void main(String[] args) {
        Animal elephant=new Animal("Elephant", 20, 5000, "Male");
        elephant.eat();
        elephant.sleep();
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


    }
}
 