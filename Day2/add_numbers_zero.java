import java.util.*;
class Add{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
          int s=0;
        
        for(;true;){
            System.out.println("Enter the number");
        int n=sc.nextInt();
      
        if(n==0)
            {
               
                break;
            }
       
            s=s+n;
        }
    
            System.out.println("sum="+s);
    }
}