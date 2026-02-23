public class ErrorHandling {
    // Try to parse inputs and divide; return descriptive errors on failure
    public static String safeDivide(String aStr, String bStr) {
        try {
            double a = Double.parseDouble(aStr);
            double b = Double.parseDouble(bStr);
            if (b == 0.0) return "Error: division by zero";
            return String.valueOf(a / b);
        } catch (NumberFormatException e) {
            return "Error: unsupported operand type";
        }
    }

    // Parse integer or throw a clear exception
    public static int readInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid integer: " + value);
        }
    }

    public static void main(String[] args) {
        // Demo calls
        System.out.println("safeDivide(10,2) -> " + safeDivide("10", "2"));
        System.out.println("safeDivide(5,0) -> " + safeDivide("5", "0"));
        System.out.println("safeDivide(\"a\",2) -> " + safeDivide("a", "2"));

        String[] vals = {"3", "x", "5"};
        for (String v : vals) {
            try {
                System.out.println("readInt(" + v + ") -> " + readInt(v));
            } catch (NumberFormatException e) {
                System.out.println("readInt error: " + e.getMessage());
            }
        }
    }
}
