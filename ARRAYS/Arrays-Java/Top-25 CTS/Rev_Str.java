public class Rev_Str {
    public static String reverse_str(String str) {

        // 1.
        StringBuilder new_rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            new_rev.append(str.charAt(i));
        }
        return new_rev.toString();

        // 2.

        // return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse_str(str));
    }
}