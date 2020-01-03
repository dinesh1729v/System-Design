public class Zoo {
    public static void main(String[] args) {
        Animal elephant=new Animal("Elephant", 20, 5000, "Male");
        elephant.eat();
        elephant.sleep();
        Bird b=new Bird();
        b.fly();
        Fish f=new Fish();
        f.swim();
    }
}
 