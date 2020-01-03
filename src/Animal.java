public abstract class Animal {
    String name;
    int age;
    int weight;
    String gender;

    public Animal(String name, int age, int weight, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public  void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
    public abstract void move();
}
