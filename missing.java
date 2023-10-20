public class missing {
    public static int missingnumber(int arr[], int n) {
        for (int i = 0, c = 1; i < n; i++, c++) {
            if (arr[i] != c) {
                return c;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 5, 6 };
        int n = arr.length;
        System.out.println(missingnumber(arr, n));
    }
}
