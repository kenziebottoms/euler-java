import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

class E04 {
    public static void main(String[] args) {
        // compile a list of unique products of 3-digit numbers
        Set<BigInteger> palindromes = new HashSet<BigInteger>();
        for (int i=999; i>100; i--) {
            for (int j=999; j>100; j--) {
                // skip multiples of 10
                if (j%10 != 0 && j%10 != 0) {
                    // do the math to BigIntegers
                    BigInteger bsum = new BigInteger(Integer.toString(i)).multiply(new BigInteger(Integer.toString(j)));
                    if (isPalindrome(bsum)) {
                        palindromes.add(bsum);
                    }
                }
            }
        }
        System.out.println(Collections.max(new ArrayList<BigInteger>(palindromes)));
    }
    public static Boolean isPalindrome(String ex) {
        List<String> letters = Arrays.asList(ex.split(""));
        for (int i=0; i<letters.size()/2; i++) {
            if (!letters.get(i).equals(letters.get(letters.size()-1-i))) {
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