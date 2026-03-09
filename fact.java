// import java.util.*;
// public class fact {
//     public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
 
//     for(int i=1;i<=n;i++){
//         if(n%i==0){
//             System.out.println(i);
//         }
//     }
//     }
// }
class Basic {

    void factors(int n, int i){
        if(i > n){
            return;
        }

        if(n % i == 0){
            System.out.println(i);
        }

        factors(n, i + 1);
    }

    public static void main(String[] args){
        Basic ob = new Basic();
        ob.factors(10, 1);
    }
}
