class os_1s_2s {
    public static void os_1s_2s(int arr[], int n) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                c1++;
            }
            if (arr[i] == 0) {
                c0++;
            }
            if (arr[i] == 2) {
                c2++;
            }
        }
        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            arr[i] = 1;
        }
        for (int i = c1 + c2; i < n; i++) {
            arr[i] = 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 0, 1, 0, 2, 1, 1 };
        int n = arr.length;
        os_1s_2s(arr, n);
    }
}
