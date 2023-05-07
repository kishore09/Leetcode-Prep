public class main {
    public static void recur(int n){
        if(n<0)return;
//        System.out.println(n);
        recur(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
//    int i=1;
        int n=5;

        recur(n);
    }
}
