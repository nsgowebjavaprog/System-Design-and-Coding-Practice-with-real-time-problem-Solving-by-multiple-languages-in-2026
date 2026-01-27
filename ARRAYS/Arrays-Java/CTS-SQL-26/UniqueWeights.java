import java.util.*;

public class UniqueWeights {

    public static int uniqueWeights(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(0);

        for (int i = 0; i < n; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int x : set) {
                temp.add(x + 3);
                temp.add(x * 2);
            }
            set = temp;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(uniqueWeights(n));
    }
}