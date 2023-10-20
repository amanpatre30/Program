class minmax {
    public static void minmax(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("the minimum value is : " + min);
        System.out.println("The largest value is : " + max);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 87, 3, 78, 2, 1 };
        int n = arr.length;
        minmax(arr, n);
    }
}