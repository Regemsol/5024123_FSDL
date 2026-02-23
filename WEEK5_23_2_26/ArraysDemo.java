import java.util.*;

public class ArraysDemo {
    // Preserve order while removing duplicates
    public static <T> List<T> dedupe(List<T> seq) {
        return new ArrayList<>(new LinkedHashSet<>(seq));
    }

    // Return element or default instead of throwing
    public static <T> T safeGet(List<T> seq, int index, T def) {
        if (index < 0 || index >= seq.size()) return def;
        return seq.get(index);
    }

    // Simple stats; throws if empty
    public static Map<String, Number> stats(List<Integer> nums) {
        if (nums.isEmpty()) throw new IllegalArgumentException("Empty list");
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        int sum = 0;
        for (int n : nums) sum += n;
        Map<String, Number> m = new HashMap<>();
        m.put("min", min);
        m.put("max", max);
        m.put("sum", sum);
        m.put("count", nums.size());
        return m;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3, 1, 2, 3, 4, 1);
        System.out.println("original: " + a);
        System.out.println("deduped: " + dedupe(a));
        System.out.println("safe_get a[10]: " + safeGet(a, 10, null));
        try {
            System.out.println("stats([]): " + stats(new ArrayList<>()));
        } catch (IllegalArgumentException e) {
            System.out.println("stats error: " + e.getMessage());
        }
        List<Integer> sorted = new ArrayList<>(a);
        Collections.sort(sorted);
        System.out.println("sorted: " + sorted);
    }
}
