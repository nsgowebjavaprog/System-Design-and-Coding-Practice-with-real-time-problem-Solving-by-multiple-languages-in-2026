public class Palindrome {
    public static boolean palindrom_check(String str) {

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
            // left++;
            // right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "oko";
        boolean res = palindrom_check(str);
        System.out.println(res);
    }
}