import java.util.*;
class Person{
    private int age;
    public void setAge(int a){
        if(a>0){
            this.age=a;
            System.out.println("Age set to "+a);
    }
    }
    public void getAge(){
        System.out.println("Age is "+age);
    }
}
  
    class Persons{
        public static void main(String[] args)
        {
            Person p=new Person();
            p.setAge(25);
            p.getAge();
        }


}