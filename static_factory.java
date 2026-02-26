import java.util.*;
class User{
    private static user u=new user();
    private user(){
            
    }
    public static user getInstance(){
        return u;
    }
}
class StaticFactory{
    public static void main(String[] args){
        // User u=new User(); //cannot create object of class with private constructor
        User u1=User.getInstance();
        User u2=User.getInstance();
        System.out.println(u1);
    }
}