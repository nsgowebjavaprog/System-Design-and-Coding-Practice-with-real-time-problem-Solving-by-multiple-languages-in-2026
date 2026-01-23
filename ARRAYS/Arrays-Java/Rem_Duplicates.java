public class Rem_Duplicates {
    public static int remove_Duplicates(int arr[]) {
        int n = arr.length;

        if (arr.length < 2) {
            return n;
        }
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                arr[j + 1] = arr[i];
                j++;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9 };
        System.out.println(remove_Duplicates(arr));
    }
}
