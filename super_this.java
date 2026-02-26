import java.util.*;
class A{
  void who(){
    System.out.println("parent");
  }
}
class B extends A{
   
   @Override
    void who(){
     System.out.println("child");
    }
    void test(){
         this.who();
        super.who();
    
    
    }
}
class super_this{
public static void main(String[] args){
    B b=new B();
    b.test();
   
}
}