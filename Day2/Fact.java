import java.util.*;
class Fact
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value");
        int a=s.nextInt();
        int f=1;
        for(int i=1;i<=a;i++)
     
        {
           if(a%i==0)
           {
            System.out.println(i);

           }
        }
        
    }
}