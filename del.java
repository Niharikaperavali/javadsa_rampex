import java.util.*;

class del {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        String ch="aeiouAEIOU";

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            // if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
            //    ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){

            //     sb.append(ch);
          
            if(ch.indexOf(c) == -1){   
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}

