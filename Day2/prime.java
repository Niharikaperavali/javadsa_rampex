import java.util.*;
class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thr input number");
        int n=sc.nextInt();
        int c=0;
        int num=2;
      outer:
      while(c<n){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                num++;
                continue outer;
            }
        }
           
                System.out.println(num+" ");
                c++;
                num++;
            }
            }
        }
    
