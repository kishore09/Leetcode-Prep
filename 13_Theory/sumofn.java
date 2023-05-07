public class sumofn{
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfIntegers(n);
        System.out.println(sum);
    }

    public static int sumOfIntegers(int n) {
        if (n == 0) {
            return 0;
        } else {
            // very important
            return n + sumOfIntegers(n - 1);
        }
    }
}