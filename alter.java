import java.util.*;

class alt{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(i % 2 == 0){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(sb.toString());
    }
}
