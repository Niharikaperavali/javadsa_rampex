import java.util.*;
class Parent{
    String name="parent";
}
class Child extends Parent{
    String name="child";
    void print(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class superr{
    public static void main(String[] args){
        Child c=new Child();
        c.print();
    }
}