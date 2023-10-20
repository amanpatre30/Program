public class reverse {
    public static void reverse(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse(arr, n);
    }
}
