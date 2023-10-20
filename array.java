class array {
    public static void main(String args[]) {
        int arr[] = { 0 };
        int n = arr.length;
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        if (n == 0 || n == 1) {
            System.out.println(-1);
            System.out.println(-1);
            System.out.println("\n");
        }
        for (int i = 0; i < n; i++) {
            s = Math.min(s, arr[i]);
            l = Math.max(l, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < ss && arr[i] != s) {
                ss = arr[i];
            }
            if (arr[i] > sl && arr[i] != l) {
                sl = arr[i];
            }
        }
        System.out.println("the 2nd smalles numbeer is :" + ss);
        System.out.println("the 2nd largest number is :" + sl);
    }
}