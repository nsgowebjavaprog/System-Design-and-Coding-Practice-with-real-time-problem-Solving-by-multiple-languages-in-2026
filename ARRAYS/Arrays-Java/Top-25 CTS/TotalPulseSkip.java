import java.util.*;

public class TotalPulseSkip {

    public static int totalPulseSkip(int[] arr, int N) {

        Stack<Integer> stk = new Stack<>();
        int skips = 0;

        for (int i : arr) {
            while (!stk.isEmpty() && i >= stk.peek()) {
                stk.pop();
                skips++;
            }
            stk.push(i);
        }
        return skips;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 4, 2, 7, 5 };
        int N = arr.length;

        System.out.println(totalPulseSkip(arr, N));
    }
}