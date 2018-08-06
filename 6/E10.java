import java.util.*;

class E10 {
    public static void main(String[] args) {
        System.out.println(primes(10));
    }

    public static List<Long> primes(int terms) {
        List<Long> primes = new ArrayList<Long>();
        primes.add(new Long(2));
        Long i = new Long(3);
        while(primes.size() < terms) {
            for (Long prime: primes) {
                if (i % prime == 0) {
                    break;
                } else {
                    primes.add(i);
                    break;
                }
            }
            i += 1;
        }
        return primes;
    };
}