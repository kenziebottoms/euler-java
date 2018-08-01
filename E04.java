import java.util.*;

class E04 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("hannah"));
        System.out.println(isPalindrome("hannahs"));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(10));
    }
    public static Boolean isPalindrome(String ex) {
        List<String> letters = Arrays.asList(ex.split(""));
        List<String> srettel = new ArrayList<String>(letters);
        Collections.reverse(srettel);
        for (int i=0; i<letters.size()/2; i++) {
            if (!letters.get(i).equals(srettel.get(i))) {
                return false;
            }
        }
        return true;
    }
    public static Boolean isPalindrome(int x) {
        String ex = Integer.toString(x);
        return isPalindrome(ex);
    }
}