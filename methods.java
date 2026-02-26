import java.util.*;
class Methods{
    void add(int a,int b){
        System.out.println(a+b);
    }
    static void multiply(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Methods m=new Methods();
        m.add(5, 10);
        multiply(5, 10);
    }
}