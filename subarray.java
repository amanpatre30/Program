public class subarray {
    public static int subarr(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            min = Math.min(min, arr[i]);
            if (sum < 0) {
                sum = 0;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1 };
        int n = arr.length;
        System.out.println(subarr(arr, n));
    }
}
