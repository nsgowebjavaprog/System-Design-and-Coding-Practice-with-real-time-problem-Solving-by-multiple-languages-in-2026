public class One_Time_Appears {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2, 1 };

        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        System.out.println("Single time appears number is: " + xor);
    }
}