import java.util.*;
class Rectangle{
    int a,b;
    Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    void scale(double factor){
        a=(int)(a*factor);
        b=(int)(b*factor);
    }
    public static void main(String[] args){
        Rectangle r=new Rectangle(4, 5);
        System.out.println("Before scaling: "+r.a+" * "+r.b);
        r.scale(1.5);
        System.out.println("After scaling: "+r.a+" * "+r.b);
    }
}