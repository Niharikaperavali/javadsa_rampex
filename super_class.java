import java.util.*;
class Animal
{
    void speak(){
        System.out.println("Animal makes a sound");
    }   
}
class Dog extends Animal{
    void speak(){
        super.speak();
        System.out.println("Dog barks");
    }
}
public class super_class {
    public static void main(String[] args){
        Dog d=new Dog();
        d.speak();
    }
}