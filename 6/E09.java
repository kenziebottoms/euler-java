import java.lang.Math;
import java.util.Arrays;

class E09 {
    public static void main(String[] args) {
        int i, j, k;
        int[] finalTrip = new int[3];
        i = 3;
        k = 5;
        for (j=4; j<1000; j++) {
            for (i=3; i<j; i++) {
                double kDubs = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                int[] trip = {i, j, (int) kDubs};
                if (
                    kDubs == (double) Math.floor(kDubs) &&
                    i+j+(int)kDubs == 1000 &&
                    isPythy(trip)
                ) {
                    k = (int) Math.floor(kDubs);
                    finalTrip[0] = i;
                    finalTrip[1] = j;
                    finalTrip[2] = k;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(finalTrip));
        long sum = (long) finalTrip[0]*finalTrip[1]*finalTrip[2];
        System.out.println(sum);
    }
    public static Boolean isPythy(int[] trip) {
        return ((int) Math.pow(trip[0], 2) + (int)Math.pow(trip[1], 2)) == (int) Math.pow(trip[2], 2);
    }
}