import java.lang.Math;

class E09 {
    public static void main(String[] args) {
        int[] trip = {3, 4, 5};
        System.out.println(isPythy(trip));
    }
    public static Boolean isPythy(int[] trip) {
        return ((int) Math.pow(trip[0], 2) + (int)Math.pow(trip[1], 2)) == (int) Math.pow(trip[2], 2);
    }
}