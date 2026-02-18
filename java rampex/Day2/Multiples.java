import java.util.*;
class Multi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=0;i<=100;i++){
            if(i%n==0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}