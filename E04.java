import java.util.*;
import java.math.*;

class E04 {
    public static void main(String[] args) {
        // get a list of unique products of 3 digit numbers
        Set<String> products = new HashSet<String>();
        for (int i=999; i>100; i--) {
            for (int j=999; j>100; j--) {
                if (j%10 != 0 && j%10 != 0) {
                    BigInteger bsum = new BigInteger(Integer.toString(i)).multiply(new BigInteger(Integer.toString(j)));
                    products.add(bsum.toString());
                }
            }
        }

        // convert all to BigIntegers
        List<BigInteger> bigProducts = new ArrayList<BigInteger>();
        for (String ex: products) {
            bigProducts.add(new BigInteger(ex));
        }
        
        // reverse sort
        Collections.sort(bigProducts);
        Collections.reverse(bigProducts);
        
        // find first palindrome
        int i = 0;
        while (!isPalindrome(bigProducts.get(i))) {
            i++;
        }
        System.out.println(bigProducts.get(i));
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