public class Rev_String {
    public static String rev_string(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println(rev_string(s));
    }
}