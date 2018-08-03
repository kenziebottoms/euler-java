import java.math.*;

class E05 {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("20");
        BigInteger inc = new BigInteger("20");
        while (!divisibleByAll(i, 20)) {
            i = i.add(inc);
        }
        System.out.println(i);
    }
    public static Boolean divisibleByAll(BigInteger x, int limit) {
        for (int i=limit; i>1; i--) {
            if (x.mod(new BigInteger(Integer.toString(i))).compareTo(new BigInteger("0")) != 0) {
                return false;
            }
        }
        return true;
    }
}