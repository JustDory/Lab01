
/**
 *
 * @author Nik Nev
 */
public class L01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Lab05.");
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA1("abby")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA1("Racecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA1("rasecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA1("ricecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA1("racecab")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA1("racecar")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA1("abZZba")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA1("11")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA1("131")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA1("")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA1("w")));

        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA2("abby")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA2("Racecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA2("rasecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA2("ricecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA2("racecab")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA2("racecar")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA2("abZZba")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA2("11")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA2("131")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA2("")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA2("w")));

        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA3("abby")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA3("Racecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA3("rasecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA3("ricecar")));
        System.out.println(String.format("Expected: %b, got: %b", false, isPalindromeA3("racecab")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA3("racecar")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA3("abZZba")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA3("11")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA3("131")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA3("")));
        System.out.println(String.format("Expected: %b, got: %b", true, isPalindromeA3("w")));
    }

    public static boolean isPalindromeA1(String s) {
        String r = reverse(s);
        return r.equals(s);
    }

    public static String reverse(String s) {
        /// Reverse the string
        //start w/empty string r
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static boolean isPalindromeA2(String s) {
        String ss1 = s.substring(0, s.length() / 2);
        String ss2;
        if (s.length() % 2 == 0) {
            //even
            ss2 = s.substring(s.length() / 2);
        } else {
            ss2 = s.substring((s.length() + 1) / 2);
        }

        return ss1.equals(reverse(ss2));
    }

    public static boolean isPalindromeA3(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
