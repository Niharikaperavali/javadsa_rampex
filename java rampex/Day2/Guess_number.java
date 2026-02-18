import java.util.*;
class Guess{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        for(;true;){
            System.out.println("Enter the number");
        int n=sc.nextInt();
            if(n==9)
            {
                 System.out.println("you got it......");
                 break;
            }
        }
    }
}