import java.math.BigInteger;

class E06 {
    public static void main(String[] args) {
        System.out.println(diff(100));
    }
    public static BigInteger sumOfSquares(int limit) {
        BigInteger sum = new BigInteger("0");
        for (int i=1; i<=limit; i++) {
            sum = sum.add(new BigInteger(Integer.toString(i*i)));
        }
        return sum;
    }
    public static BigInteger squareOfSum(int limit) {
        BigInteger sum = new BigInteger("0");
        for (int i=1; i<=limit; i++) {
            sum = sum.add(new BigInteger(Integer.toString(i)));
        }
        return sum.multiply(sum);
    }
    public static BigInteger diff(int limit) {
        return squareOfSum(limit).subtract(sumOfSquares(limit));
    }
}