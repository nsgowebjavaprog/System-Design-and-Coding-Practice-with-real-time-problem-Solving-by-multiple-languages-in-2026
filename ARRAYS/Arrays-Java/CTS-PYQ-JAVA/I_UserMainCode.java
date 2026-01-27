import java.util.*;
// package CTS-PYQ-JAVA;

public class I_UserMainCode {
    public static int unique_substring(String input1, int input2) {
        if (input2 > input1.length()) {
            return 0;
        }
        Set<String> unique_set = new HashSet<>();

        for (int i = 0; i <= input1.length() - input2; i++) {
            String sub_str = input1.substring(i, i + input2);
            unique_set.add(sub_str);
        }

        return unique_set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read
        System.out.println("Enter the String: ");
        String input1 = sc.next();

        System.out.println("Enter the length [K]: ");
        int input2 = sc.nextInt();

        // Call
        int res = unique_substring(input1, input2);
        System.out.println("Result: " + res);

        sc.close();
    }
}