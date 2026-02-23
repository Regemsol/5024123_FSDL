public class StringsDemo {
    // Reverse using StringBuilder
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Normalize and check palindrome
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) if (Character.isLetterOrDigit(ch)) sb.append(Character.toLowerCase(ch));
        String norm = sb.toString();
        return norm.equals(new StringBuilder(norm).reverse().toString());
    }

    // Truncate with ellipsis
    public static String truncate(String s, int length) {
        if (s == null) return null;
        if (s.length() <= length) return s;
        if (length <= 3) return s.substring(0, length);
        return s.substring(0, length - 3) + "...";
    }

    public static void main(String[] args) {
        String s = "Able was I, ere I saw Elba";
        System.out.println("reverse: " + reverse("hello"));
        System.out.println("palindrome? " + isPalindrome(s));
        System.out.println("truncate: " + truncate("This is a long sentence.", 12));
        System.out.println(String.format("format: Name: %s, Age: %d", "Sam", 30));
    }
}
