public class Largest_Ele {
    public static int Large_Ele(int arr[]) {
        int Large_Element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Large_Element) {
                Large_Element = arr[i];
            }
        }
        return Large_Element;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 4, 15, 6, 7, 8 };
        System.out.println(Large_Ele(arr));
    }
}
