import java.util.*;

class E02 {
    public static void main(String[] args) {
        List<Integer> fibs = fibs(4000000);
        List<Integer> evens = new ArrayList<Integer>();
        for (int fib: fibs) {
            if (fib % 2 == 0) {
                evens.add(fib);
            }
        }
        System.out.println(sum(evens));
    }

    // generates a list representing the Fibonacci sequence from [1, 2] to the point where the terms exceed `limit`
    public static List<Integer> fibs(int limit) {
        List<Integer> fibs = new ArrayList<Integer>(Arrays.asList(1,2));
        int i=2;
        int next=3;
        while (next < limit) {
            fibs.add(next);
            i++;
            next = fibs.get(i-1)+fibs.get(i-2);
        }
        return fibs;
    }

    // returns sum of array
    public static int sum(List<Integer> arr) {
        int sum = 0;
        for (int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}