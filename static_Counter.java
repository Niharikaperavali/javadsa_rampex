import java.util.*;
class Thing{
    static int count;
    public static int getCount(){
        return count;
    }
   Thing(){
        count++;
    }
    public static void main(String[] args){
        Thing o1=new Thing();
        Thing o2=new Thing();
        Thing o3=new Thing();
        System.out.println("totalobjects:"+Thing.getCount());
    }
}