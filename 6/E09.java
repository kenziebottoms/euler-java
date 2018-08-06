import java.lang.Math;
import java.util.Arrays;

class E09 {
    public static void main(String[] args) {
        int[] finalTrip = new int[3];
        for (int j=4; j<500; j++) {
            for (int i=3; i<j; i++) {
                double k = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                if ((double) Math.floor(k) == k && (int) k + i + j == 1000) {
                    finalTrip[0] = i;
                    finalTrip[1] = j;
                    finalTrip[2] = (int) Math.floor(k);
                    break;
                }
            }
        }
        long sum = finalTrip[0]*finalTrip[1]*finalTrip[2];
        System.out.println(sum);
    }
}