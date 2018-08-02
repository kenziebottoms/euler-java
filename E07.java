import java.util.*;
import java.math.BigInteger;

class E07 {
    public static List<BigInteger> primes = new ArrayList<BigInteger>();

    public static void main(String[] args) {
        primes.add(new BigInteger("2"));
        int i = 3;
        while (primes.size() < 10002) {
            isPrime(i);
            i += 2;
        }
        System.out.println(primes.get(10000));
    }
    public static Boolean isPrime(BigInteger x) {
        for (BigInteger prime: primes) {
            if (x.mod(prime).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        primes.add(x);
        return true;
    }
    public static Boolean isPrime(int x) {
        BigInteger xxx = new BigInteger(Integer.toString(x));
        return isPrime(xxx);
    }
}