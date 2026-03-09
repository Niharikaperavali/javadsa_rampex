import java.util.*;
class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+", ID: "+id);
    }
    public static void main(String[] args){
        Student s=new Student("Alice", 123);
        s.displayInfo();
    }
}