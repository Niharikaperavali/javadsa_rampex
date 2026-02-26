import java.util.*;

class sep{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String words[] = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            sb.append(words[i]);

            if(i != words.length - 1){
                sb.append(",");
            }
        }

        System.out.println(sb.toString());
    }
}
