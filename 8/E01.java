import java.util.List;
import java.util.stream.*;

class E01 {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 1000)
            .filter(x -> x % 3 == 0 || x % 5 == 0)
            .sum();
        System.out.println(sum);
    }
}