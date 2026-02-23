import java.util.regex.Pattern;

public class Validations {
    private static final Pattern EMAIL = Pattern.compile("^[\\w\\.-]+@[\\w\\.-]+\\.\\w+$");
    private static final Pattern PHONE = Pattern.compile("^\\+?[0-9 ()-]{7,20}$");

    // Basic email check (illustrative)
    public static boolean isEmail(String s) {
        if (s == null) return false;
        return EMAIL.matcher(s).matches();
    }

    // Permissive phone check
    public static boolean isPhone(String s) {
        if (s == null) return false;
        return PHONE.matcher(s).matches();
    }

    // True only if the value can be parsed to a positive integer
    public static boolean isPositiveInt(String x) {
        if (x == null) return false;
        try {
            return Integer.parseInt(x) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] samples = {"alice@example.com", "bad@.com", "+1 800 555 0199", "12345"};
        for (String s : samples) {
            System.out.println(s + " email? " + isEmail(s) + " phone? " + isPhone(s));
        }

        String[] vals = {"10", "5", "-2", "x"};
        for (String v : vals) System.out.println(v + " positive_int? " + isPositiveInt(v));
    }
}
