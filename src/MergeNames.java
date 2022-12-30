import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqNames = new HashSet<>();
        for (String name : names1) {
            uniqNames.add(name);
        }
        for (String name : names2) {
            uniqNames.add(name);
        }
        String[] output = new String[uniqNames.size()];
        return uniqNames.toArray(output);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}