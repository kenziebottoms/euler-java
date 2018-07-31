import java.util.*;
import java.math.*;

class E03 {
    public static void main(String[] args) {
        System.out.println(primeFactors(BigInteger.valueOf(13195)));
    }
    public static List<BigInteger> primeFactors(BigInteger x) {
        List<BigInteger> factors = new ArrayList<BigInteger>();
        Integer i=2;
        while (x.compareTo(BigInteger.valueOf(i)) >= 0) {
            if (x.mod(BigInteger.valueOf(i)) == BigInteger.valueOf(0)) {
                factors.add(BigInteger.valueOf(i));
                x = x.divide(BigInteger.valueOf(i));
            } else {
                i++;
            }
        }
        return factors;
    }
}