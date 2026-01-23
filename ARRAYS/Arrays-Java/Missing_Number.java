class Missing_Number {
    public static int missing_num(int arr[], int n) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6 };
        int n = 6;
        System.out.println("Missing: " + missing_num(arr, n));
    }
}