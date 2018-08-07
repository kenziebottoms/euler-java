import java.util.*;

class E10 {
    public static void main(String[] args) {
        System.out.println(sum(primesUpTo(2000000)));
    }

    public static List<Long> primesUpTo(Long limit) {
        List<Long> primes = new ArrayList<Long>();
        primes.add(new Long(3));
        Long i = new Long(3);
        while(i < limit) {
            for (Long prime: primes) {
                if (i % prime == 0) {
                    break;
                } else if (prime > Math.sqrt(i) || primes.get(primes.size()-1) == prime) {
                    primes.add(i);
                    break;
                }
            }
            i += 2;
        }
        primes.add(0, new Long(2));
        return primes;
    };
    public static List<Long> primesUpTo(int limit) {
        return primesUpTo(new Long(limit));
    };

    // returns sum of array
    public static Long sum(List<Long> arr) {
        Long sum = new Long(0);
        for (int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}