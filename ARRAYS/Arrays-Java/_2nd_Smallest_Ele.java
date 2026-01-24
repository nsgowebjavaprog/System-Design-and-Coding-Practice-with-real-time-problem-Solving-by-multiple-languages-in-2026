public class _2nd_Smallest_Ele {
    public static int Sec_Large_Ele(int arr[]) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Arr is less than 2 length");
        }
        int sec_small = Integer.MAX_VALUE;
        int small = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < small) {
                sec_small = small;
                small = i;
            } else if (i > small && i < sec_small) {
                sec_small = i;
            }
        }
        return sec_small;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Sec_Large_Ele(arr));
    }
}
