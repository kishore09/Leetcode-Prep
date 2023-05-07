public class ArraySubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Subsequences of the array:");
        findSubsequences(arr, 0, new int[arr.length], 0);
        System.out.println("END");
    }

    public static void findSubsequences(int[] arr, int index, int[] sub, int subIndex) {
        if (index == arr.length) {
            System.out.print("{ ");
            for (int i = 0; i < subIndex; i++) {
                System.out.print(sub[i] + " ");
            }
            System.out.println("}");
            return;
        }
        sub[subIndex] = arr[index];
        findSubsequences(arr, index + 1, sub, subIndex + 1);
        findSubsequences(arr, index + 1, sub, subIndex);
    }
}
