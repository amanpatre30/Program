public class lastoccurance {
    public static int occurance(int arr[], int n, int target) {
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                last = Math.max(i, last);
            }
        }
        return last;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 1, 6, 8, 2, 1 };
        int n = arr.length;
        int target = 1;
        System.out.println(occurance(arr, n, target));
    }
}
