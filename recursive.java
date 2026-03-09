
class recursive {
    int fun(int n){
        if(n==1){
            return 1;
        }
       return n * fun(n-1);
    }
public static void main(String[] args) {
        recursive obj=new recursive();
        System.out.println(obj.fun(5));
    }
}
