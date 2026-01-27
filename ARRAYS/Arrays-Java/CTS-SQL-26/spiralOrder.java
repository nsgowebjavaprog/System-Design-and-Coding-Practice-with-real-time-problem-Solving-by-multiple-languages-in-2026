import java.util.*;

public class spiralOrder {
    // Made this static so it can be called directly from main
    public static String spiralOrder_res(int input1, int input2, String input3) {
        if (input3 == null || input3.isEmpty())
            return "";

        // 1. Arrange letters in the grid G[N][M] row by row
        char[][] grid = new char[input1][input2];
        int charIdx = 0;
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input2; j++) {
                grid[i][j] = input3.charAt(charIdx++);
            }
        }

        // 2. Fetch letters in spiral order (outer block to inner block)
        StringBuilder result = new StringBuilder();
        int top = 0, bottom = input1 - 1;
        int left = 0, right = input2 - 1;

        while (top <= bottom && left <= right) {
            // Read Top Row: left to right
            for (int i = left; i <= right; i++)
                result.append(grid[top][i]);
            top++;

            // Read Right Column: top to bottom
            for (int i = top; i <= bottom; i++)
                result.append(grid[i][right]);
            right--;

            // Read Bottom Row: right to left (if row still exists)
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.append(grid[bottom][i]);
                bottom--;
            }

            // Read Left Column: bottom to top (if column still exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.append(grid[i][left]);
                left++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (rows): ");
        int n = sc.nextInt();
        System.out.print("Enter M (columns): ");
        int m = sc.nextInt();
        System.out.print("Enter string S: ");
        String s = sc.next();

        // Corrected the typo in the method name here
        String result = spiralOrder_res(n, m, s);

        System.out.println("Output: " + result);
        sc.close();
    }
}