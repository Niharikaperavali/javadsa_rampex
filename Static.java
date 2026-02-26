import java.util.*;
class Stat{
    int instanceVar=10;
    static void  myMethod(){
        System.out.println(this.instanceVar);//instance variable cannot be accessed in static method
    }

}
public class Static {
    public static void main(String[] args){
        Stat s=new Stat();
        s.myMethod();
    }
}