import java.util.*;

class arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] new_Arr = new int[3][];

      
        for (int i = 0; i < new_Arr.length; i++) {
            int size = sc.nextInt();
            new_Arr[i] = new int[size];
        }

       
            System.out.println(new_Arr[0].length);
             System.out.println(new_Arr[1].length);
              System.out.println(new_Arr[2].length);
        
    }
}
