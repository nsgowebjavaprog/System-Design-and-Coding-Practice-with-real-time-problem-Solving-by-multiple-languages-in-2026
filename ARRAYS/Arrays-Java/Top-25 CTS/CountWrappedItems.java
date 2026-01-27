public class CountWrappedItems {
    public static int countWrappedItems(String s) {
        int count = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            char curr = s.charAt(i);
            char left = s.charAt(i - 1);
            char right = s.charAt(i + 1);

            if (Character.isDigit(left) && Character.isLetter(curr) && Character.isDigit(right)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "1a2b3c4d5";
        System.out.println(countWrappedItems(input));
    }
}