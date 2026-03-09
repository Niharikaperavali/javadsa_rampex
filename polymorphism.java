import java.util.*;
class polymorphism{
  void speak(){
    System.out.println("Animal makes a sound");
  }
  
}class Dog extends polymorphism{
  @Override
  void speak(){
    System.out.println("Dog barks");
  }
}

class cat extends polymorphism{
  @Override
  void speak(){
    System.out.println("Cat meows");
  }
}

class polymorphisms{
    public static void main(String[] args){
        polymorphism a[]=new polymorphism[2];
           Dog d=new Dog();
           if(d instanceof Dog){
               a[0]=d;
           }
               Cat c=new Cat();
                if(c instanceof Cat){
                     a[1]=c;
                }
             a[0]=new cat();
           
        
             a[1]=new Dog();
        
        
        for(polymorphism i:a){
            i.speak();
        }
        System.out.println(a[0] instanceof cat);
        System.out.println(a[1] instanceof Dog);
    }
}