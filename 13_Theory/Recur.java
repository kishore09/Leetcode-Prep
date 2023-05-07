public class Recur {
    public static void recur(int n){
        if(n<0)return;

//        if we print before the rec fun then it prints 5 to 0
        System.out.println(n);
        recur(n-1);
        // if we print after the rec fun then it prints from 0 to 5
        System.out.println(n);
    }

    public static void main(String[] args) {
    int n=5;
    recur(n);
    }
}
