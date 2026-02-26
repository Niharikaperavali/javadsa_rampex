import java.util.*;
class inse{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder(s1);
        sb.insert(n,s2);
        System.out.println(sb.toString());
     }
}