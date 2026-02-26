class Animal
{
    String name;

    Animal(String name)
    {
        this.name = name;
        System.out.println("Animal created");
    }
}

class Dog extends Animal
{
    Dog(String name)
    {
        super(name);   
        System.out.println("Dog created");
    }

 void display()
{
    System.out.println("Dog's name: " + name);
}
}

class supe
{
    public static void main(String args[])
    {
        Dog d = new Dog("Buddy");
        d.display();
    }
}