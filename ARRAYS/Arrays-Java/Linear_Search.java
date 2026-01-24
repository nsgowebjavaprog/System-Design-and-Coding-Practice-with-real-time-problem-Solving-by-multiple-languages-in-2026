public class Linear_Search {
    public static int liner_search(int arr[], int needed) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == needed) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int needed = 3;
        int res = liner_search(arr, needed);
        System.out.println(res);
    }
}
