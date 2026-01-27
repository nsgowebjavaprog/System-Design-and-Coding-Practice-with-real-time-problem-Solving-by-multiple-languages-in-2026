import java.util.*;

public class Rearrange_chars {

    public static int count_dist(String arr[]) {
        
        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            char ch_arr[] = arr[i].toCharArray();

            Arrays.sort(ch_arr);
            String sorted = new String(ch_arr);
            set.add(sorted);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String arr[] = { "abcd", "badc", "fgdf" };
        System.out.println(count_dist(arr));
    }
}