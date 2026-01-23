public class Max_Consecutive_Onces {
    public static int max_onces(int arr[]) {
        int max_1 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max_1 = Math.max(max_1, count);
            } else {
                count = 0;
            }
        }
        return max_1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 5, 4, 1, 1, 1, 1, 1 };
        System.out.println("Total Contineous 1's is: " + max_onces(arr));
    }
}
