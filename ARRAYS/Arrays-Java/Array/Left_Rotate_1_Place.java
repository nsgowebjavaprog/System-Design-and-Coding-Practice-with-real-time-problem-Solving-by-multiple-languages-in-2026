import java.util.Arrays;

public class Left_Rotate_1_Place {
    public static void Left_One_Place(int arr[]) {

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Left_One_Place(arr);
        System.out.println(Arrays.toString(arr));
    }
}