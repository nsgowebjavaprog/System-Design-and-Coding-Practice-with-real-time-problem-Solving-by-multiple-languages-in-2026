import java.lang.reflect.Array;
import java.util.Arrays;

public class Move_Zero_To_End {
    public static void move_zero_to_end(int arr[]) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
                a++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 2, 6, 0, 7, 0, 7, 0 };
        move_zero_to_end(arr);
        System.out.println(Arrays.toString(arr));
    }
}
