import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

class E04 {
    public static void main(String[] args) {
        // get a list of unique products of 3 digit numbers
        Set<String> palindromes = new HashSet<String>();
        DecimalFormat df = new DecimalFormat("000000");
        for (int i=999; i>100; i--) {
            for (int j=999; j>100; j--) {
                if (j%10 != 0 && j%10 != 0) {
                    BigInteger bsum = new BigInteger(Integer.toString(i)).multiply(new BigInteger(Integer.toString(j)));
                    if (isPalindrome(bsum)) {
                        // add 6-character version of number to palindromes
                        palindromes.add(df.format(bsum));
                    }
                }
            }
        }
        System.out.println(Collections.max(new ArrayList<String>(palindromes)));
    }
    // TODO: don't make a new array
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
    public static Boolean isPalindrome(BigInteger x) {
        String ex = x.toString();
        return isPalindrome(ex);
    }
}