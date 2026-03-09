import java.util.*;
class pal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
       
        if(s.equals(sb.reverse().toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}