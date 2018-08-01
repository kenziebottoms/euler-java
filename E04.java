import java.util.*;

class E04 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("hannah"));
    }
    public static Boolean isPalindrome(String x) {
        List<String> letters = Arrays.asList(x.split(""));
        List<String> srettel = new ArrayList<String>(letters);
        Collections.reverse(srettel);
        for (int i=0; i<letters.size()/2; i++) {
            if (letters.get(i) == srettel.get(i)) {
                return false;
            }
        }
        return true;
    }
}