import java.lang.Math;
import java.util.Arrays;

class E09 {
    public static void main(String[] args) {
        int[] finalTrip = new int[3];
        for (int j=4; j<1000; j++) {
            for (int i=3; i<j; i++) {
                double k = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                int[] trip = {i, j, (int) k};
                if (
                    k == (double) Math.floor(k) &&
                    i+j+(int)k == 1000 &&
                    isPythy(trip)
                ) {
                    finalTrip[0] = i;
                    finalTrip[1] = j;
                    finalTrip[2] = (int) Math.floor(k);
                    break;
                }
            }
        }
        long sum = (long) finalTrip[0]*finalTrip[1]*finalTrip[2];
        System.out.println(sum);
    }
    public static Boolean isPythy(int[] trip) {
        return ((int) Math.pow(trip[0], 2) + (int)Math.pow(trip[1], 2)) == (int) Math.pow(trip[2], 2);
    }
}