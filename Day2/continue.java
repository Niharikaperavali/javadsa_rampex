import java.util.*;
class con{
    public static void main(String[] args){
        bye:
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            if(i==2){
            continue bye;
        
            }
                System.out.println(i);
            }
        }
    }
}