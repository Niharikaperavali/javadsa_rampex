class Basic {

    int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args){
        Basic ob = new Basic();
        System.out.println(ob.sum(10));
    }
}
