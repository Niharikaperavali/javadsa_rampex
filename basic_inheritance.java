import java.util.*;
class Animal
{
    void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
}
public class basic_inheritance {
public static void main(String[] args){
    Animal a=new Animal();
    a.speak();
    Dog d=new Dog();
    d.speak();
}
}