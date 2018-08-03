import java.util.*;
import java.math.*;

class E03 {
    public static void main(String[] args) {
        Set<BigInteger> factors = primeFactors(new BigInteger("600851475143"));
        System.out.println(Collections.max(new ArrayList<BigInteger>(factors)));
    }
    // returns the prime factors of x
    public static Set<BigInteger> primeFactors(BigInteger x) {
        Set<BigInteger> factors = new HashSet<BigInteger>();
        BigInteger i = new BigInteger("2");
        while (x.compareTo(i) >= 0) {
            if (x.mod(i) == BigInteger.valueOf(0)) {
                factors.add(i);
                x = x.divide(i);
            } else {
                i = i.add(BigInteger.valueOf(1));
            }
        }
        return factors;
    }
    // returns sum of set
    public static BigInteger sum(Set<BigInteger> set) {
        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger x: set) {
            sum = sum.add(x);
        }
        return sum;
    }
}