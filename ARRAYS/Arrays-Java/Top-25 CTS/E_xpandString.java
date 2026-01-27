public class E_xpandString {
    public static String expandString(String s) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int n = s.indexOf(s.charAt(i)) + 1;

            for (int j = 0; j < n; j++)
                res.append(s.charAt(i));

            if (i != s.length() - 1)
                res.append("-");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String input = "abcaba";
        System.out.println(expandString(input));
    }
}