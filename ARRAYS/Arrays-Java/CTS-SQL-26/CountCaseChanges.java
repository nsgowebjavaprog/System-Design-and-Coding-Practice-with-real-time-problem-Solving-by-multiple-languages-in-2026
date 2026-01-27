public class CountCaseChanges {

    public static int countCaseChanges(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isLowerCase(s.charAt(i)) != Character.isLowerCase(s.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCaseChanges("HeLLLLLLLLo"));
    }
}