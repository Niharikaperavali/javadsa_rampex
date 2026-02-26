import java.util.*;

class repl{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        StringBuilder sb = new StringBuilder(s1);

        int index = sb.indexOf(s2);

        while(index != -1){
            sb.replace(index, index + s2.length(), s3);

            index = sb.indexOf(s2, index + s3.length());
        }

        System.out.println(sb.toString());
    }
}
